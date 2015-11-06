/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moraqui.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import moraqui.dao.GerenciarUsuarioDAO;
import moraqui.ui.GerenciarContratoUI;
import moraqui.entity.GerenciarContrato;
import moraqui.entity.GerenciarUsuario;

/**
 *
 * @author Thayna
 */
public class GerenciarContratoDAO {
    Connection cn;
    Statement stm;
    boolean conectado = false;
    
    GerenciarUsuario usuario = new GerenciarUsuario();
    

   
    public void Conectar(){
        if(!conectado)
        {
            try{
                Class.forName("org.postgresql.Driver");
                cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/MoraquiBanco","postgres", "postgres");
                stm = cn.createStatement(); 
                conectado = true;
            }
            catch(SQLException e){
                // para o cn
                System.out.println("não Conectado");
                
            }
            catch(ClassNotFoundException e){
                //para o Class.for name
                System.out.println("não Conectado2");
                
            }
        }
    }
    public void Desconectar(){
        if(conectado){
            try {
                cn.close();
                conectado = false;
            } catch (SQLException ex) {
                Logger.getLogger(GerenciarUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
    public void inserir(GerenciarContrato contrato){
        Conectar();
        
        //JOptionPane.showMessageDialog(null, contrato.getCodLocatario(), "Registro", JOptionPane.INFORMATION_MESSAGE);
        try
        {   String sql = "INSERT INTO Contrato (codmoradia, codlocator, codlocatario, valor, datainic,datafim, especificacoes) "
                    +"VALUES('"
                    + contrato.getCodMoradia()+"', '"
                    + GerenciarUsuario.getIdTipo()+"', '"
                    + contrato.getCodLocatario()+"', '"
                    + contrato.getValor()+ "', '"
                    + contrato.getDataInicioContrato()+"', '"
                    + contrato.getDataTerminoContrato()+"', '"
                    + contrato.getEspecificacoes()+"')";
            stm.executeUpdate(sql);
          
            JOptionPane.showMessageDialog(null, "Contrato Cadastrado", "Registro Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null, erro, "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
//    public void excluir(GerenciarContrato contrato){
//        Conectar();
//        try
//        {
//            stm.executeUpdate("DELETE FROM Contrato where Data = " + contrato.getDataContrato()+ "");
//            JOptionPane.showMessageDialog(null, "Exclusão Realizada", "Excluir", JOptionPane.INFORMATION_MESSAGE);
//        }
//        catch(SQLException ee){
//            JOptionPane.showMessageDialog(null, "Erro ao excluir contrato", "Excluir", JOptionPane.WARNING_MESSAGE);
//        }
//    }
    public DefaultTableModel pesquisarContrato(String condicoes){
        ResultSet rs;
        Conectar();
        DefaultTableModel aModel = new DefaultTableModel();
        String[] tableColumnsName = {"codcontrato", "codmoradia",
                                    "codlocator","codlocatario",
                                     "valor", "datainic","datafim",
            "especificacoes"};
        aModel.setColumnIdentifiers(tableColumnsName);
        String sql = "Select codcontrato, codmoradia, codlocator, codlocatario, valor, datainic,datafim "
                +" from contrato ";
          if(!condicoes.equals(""))
              sql = sql + " WHERE "+ condicoes ;
        try {
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            java.sql.ResultSetMetaData rsmd = rs.getMetaData();
          int colNo = rsmd.getColumnCount();
          while(rs.next()){
            Object[] objects = new Object[colNo];
            for(int i = 0; i < colNo; i++) {
                objects[i] = rs.getObject(i+1);
            }
            
           aModel.addRow(objects);
          }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
          
        return aModel;
    
    }
    public GerenciarUsuario pesquisarLocador(String condicoes){
        ResultSet rs;
        Conectar();
     
       
        String sql = "Select nome, rg, cpf from usuario WHERE "+condicoes+" ";
         
        try {
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            
 
            while(rs.next())  
          {  
  
             
             String nome = rs.getString("nome");  
             int rg = rs.getInt("rg");  
             int cpf = rs.getInt("cpf");  
  
             String RG = Integer.toString(rg);
             String CPF = Integer.toString(cpf);
             
            usuario.setNome(nome);
            usuario.setRg(RG);
            usuario.setCpf(CPF); 
          } 
             
 
             
//             usuario.setNome(nome);
//             usuario.setRg(rg);
//             usuario.setCpf(cpf);
          
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
          
        return usuario;
    
    }

    public ArrayList pesquisarUsuarioLocator(String id) {
        ResultSet rs;
        Conectar();
        ArrayList<String> aux = new ArrayList<String>();
        String sql = "Select u.nome, u.rg, u.cpf from usuario u,locator l WHERE "+
               "l.codlocator = "+id+" AND u.codusuario = l.codusuario";
         
        try {
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            
 
            while(rs.next())  
          {  
              aux.add(rs.getString("nome"));
              aux.add(rs.getString("rg"));
              aux.add(rs.getString("cpf"));            
          }
         } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return aux;
    }
    public ArrayList pesquisarMoradia(String id) {
        ResultSet rs;
        Conectar();
        ArrayList<String> aux = new ArrayList<String>();
        String sql = "Select endereco, tipo from moradia WHERE "+
               "codmoradia = '"+id+"'";
         
        try {
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            
 
            while(rs.next())  
          {  
              aux.add(rs.getString("endereco"));
              aux.add(rs.getString("tipo"));            
          }
         } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return aux;
    }
    
    public ArrayList pesquisarUsuarioLocatario(String id) {
        ResultSet rs;
        Conectar();
        ArrayList<String> aux = new ArrayList<String>();
        String sql = "Select u.nome, u.rg, u.cpf from usuario u,locatario l WHERE "+
               "l.codlocatario = "+id+" AND u.codusuario = l.codusuario";
         
        try {
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            
 
            while(rs.next())  
          {  
              aux.add(rs.getString("nome"));
              aux.add(rs.getString("rg"));
              aux.add(rs.getString("cpf"));            
          }
         } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return aux;
    }

    public void atualizarContrato(String dataInicioContrato, String dataTerminoContrato) {
       
    Conectar();
        try{          
            String sql = "UPDATE contrato SET datainic = '" + dataInicioContrato + 
                    "', datafim = '" + dataTerminoContrato+"'";
            stm.executeUpdate(sql);
            JOptionPane.showConfirmDialog(null, "Atualização Realizada", "Cadastro Usuario", JOptionPane.INFORMATION_MESSAGE);
            
        }
        catch(SQLException e){
            JOptionPane.showConfirmDialog(null, "Erro ao Atualizar Usuario", "Cadastro Usuario", JOptionPane.INFORMATION_MESSAGE);
        }
    }    
    public void excluirContrato(String id){
        Conectar();
        try
        {
            String sql = "DELETE FROM contrato where codcontrato = '" + id + "'";
            stm.executeUpdate(sql);
            
            JOptionPane.showConfirmDialog(null, "Exclução Realizada", "Cadastro Usuario", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ee){
            JOptionPane.showConfirmDialog(null, "Erro ao Excluir Usuario", "Cadastro Usuario", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
}
