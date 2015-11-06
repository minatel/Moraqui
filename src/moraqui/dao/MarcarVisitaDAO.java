/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moraqui.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import moraqui.ui.GerenciarMoradiaUI;
import moraqui.entity.GerenciarMoradia;
import moraqui.entity.MarcarVisita;
/**
 *
 * @author Jéssica
 */
public class MarcarVisitaDAO {
    
    Connection cn;
    Statement stm;
    boolean conectado = false;
    
    
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
    
    public void cadastrar(MarcarVisita visita){
        Conectar();
        try
        {   
            stm.executeUpdate("INSERT INTO visita (codlocatario, codmoradia, datavisita, horavisita, descricao, status) "
                    +"VALUES('"+ visita.getIdLocatario()+"','"
                    + visita.getIdMoradia()+"', '"
                    + visita.getData()+"', '"
                    + visita.getHora()+"', '"
                    + visita.getDescricao() + "', '"
                    + visita.getStatus() +"')");
          
            JOptionPane.showMessageDialog(null, "Visita Registrada", "Registro", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null, erro, "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public DefaultTableModel pesquisar(String condicoes){
        ResultSet rs;
        Conectar();
        DefaultTableModel aModel = new DefaultTableModel();
        String[] tableColumnsName = {"endereco", "cep", "tipo", "area", "genero", 
                                    "quantMorador", "valorUnitario"};
        aModel.setColumnIdentifiers(tableColumnsName);
        String sql = "Select endereco, cep, tipo, area, genero, quantmorador, valorunitario from moradia";
          if(!condicoes.equals(""))
              sql = sql + " WHERE "+ condicoes;
          
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
    
    public void excluir(String idMoradia, String idLocatario){
        Conectar();
        try
        {
            stm.executeUpdate("DELETE FROM visita where codmoradia = " + idMoradia+ " and codLocatario = "+idLocatario+"");
            JOptionPane.showMessageDialog(null, "Exclusão Realizada","Excluir", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ee){
            JOptionPane.showMessageDialog(null, ee,"Excluir", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void alterar(MarcarVisita visita){
        Conectar();
        try{          
            stm.executeUpdate("UPDATE visita SET DATAVISITA = '"  
                    + visita.getData()+"', HORAVISITA = '"
                    + visita.getHora()+"', DESCRICAO = '"
                    + visita.getDescricao() + "', STATUS = '"
                    + visita.getStatus() +"' WHERE CODMORADIA = '"+visita.getIdMoradia()+"' AND CODLOCATARIO = '"+visita.getIdLocatario()+"'");
             
            JOptionPane.showMessageDialog(null, "Atualização Realizado", "Atualização", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e, "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
   
    public String codMoradia(String endereco){
        Conectar();
        String idmoradia = null;
        try{
            String sql = "SELECT codMoradia from moradia where endereco = '"+endereco+"'";
            PreparedStatement stat = cn.prepareStatement(sql);
            ResultSet rs = stat.executeQuery();
            while(rs.next()){
                idmoradia = rs.getString("codMoradia");
            }
        }
        catch(Exception erro){
             JOptionPane.showMessageDialog(null, erro,"Aviso", JOptionPane.WARNING_MESSAGE);
        }
        return idmoradia;
    } 
    
    public MarcarVisita visita(String idMoradia, String idLocatario){
        MarcarVisita visita = new MarcarVisita();
        visita.setData(null);
        visita.setHora(null);
        visita.setDescricao(null);
        visita.setStatus(null);
        Conectar();
        try{
            String sql = "SELECT datavisita, horavisita, descricao, status from visita where codlocatario = '"+idLocatario+"' and codmoradia = '"+idMoradia+"'"; 
            PreparedStatement stat2 = cn.prepareStatement(sql);
            ResultSet rs2 = stat2.executeQuery();
            while (rs2.next()){
                visita.setData(rs2.getString("datavisita")); 
                visita.setHora(rs2.getString("horavisita"));
                visita.setDescricao(rs2.getString("descricao"));
                visita.setStatus(rs2.getString("status"));
            }  
        }
        catch(Exception errro){
            JOptionPane.showMessageDialog(null, errro,"Aviso", JOptionPane.WARNING_MESSAGE);
        }
        
        return visita;
    }
}
