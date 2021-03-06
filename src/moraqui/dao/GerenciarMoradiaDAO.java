package moraqui.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import moraqui.ui.GerenciarMoradiaUI;
import moraqui.entity.GerenciarMoradia;
/**
 *
 * @author Thayna
 */
public class GerenciarMoradiaDAO {
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
    public void cadastrar(GerenciarMoradia moradia){
        Conectar();
        try
        {   
            stm.executeUpdate("INSERT INTO Moradia (codlocator, endereco, cep, tipo, area, genero, quantMorador, valorUnitario) "
                    +"VALUES('"+ moradia.getCodLocator()+"','"
                    + moradia.getEndereco() +"', '"
                    + moradia.getCep()+"', '"
                    + moradia.getTipo() + "', '"
                    + moradia.getArea() +"', '"
                    + moradia.getGenero() +"', '"
                    + moradia.getQuantMorador() +"', '"
                    + moradia.getValor() +"')");
          
            JOptionPane.showMessageDialog(null, "Moradia Registrada", "Registro", JOptionPane.INFORMATION_MESSAGE);
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
    public void alterar(GerenciarMoradia moradia){
        Conectar();
        try{          
            stm.executeUpdate("UPDATE Moradia SET ENDERECO = '" + moradia.getEndereco() + 
                    "', CEP = " + moradia.getCep() + 
                    ", TIPO = '" + moradia.getTipo() + 
                    "', AREA = '" + moradia.getArea() +
                    "', GENERO = '" + moradia.getGenero() + 
                    "', QUANTMORADOR = '" + moradia.getQuantMorador() +
                    "', VALORUNITARIO = '" + moradia.getValor()+ "' WHERE codMoradia = '"+moradia.getCodMoradia()+"'");
             
            JOptionPane.showMessageDialog(null, "Atualização Realizado", "Atualização", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e, "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
    public void excluir(GerenciarMoradia moradia){
        Conectar();
        try
        {
            stm.executeUpdate("DELETE FROM moradia where codMoradia = " + moradia.getCodMoradia()+ "");
            JOptionPane.showMessageDialog(null, "Exclusão Realizada","Excluir", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ee){
            JOptionPane.showMessageDialog(null, ee,"Excluir", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public String codMoradia(String endereco){
        Conectar();
        String idmoradia = null;
        try{
            String sql = "SELECT codmoradia from moradia where endereco = '"+endereco+"'";
            PreparedStatement stat = cn.prepareStatement(sql);
            ResultSet rs = stat.executeQuery();
            while(rs.next()){
                idmoradia = rs.getString("codmoradia");
            }
        }
        catch(Exception erro){
             JOptionPane.showMessageDialog(null, erro,"Excluir", JOptionPane.WARNING_MESSAGE);
        }
        return idmoradia;
    }    
}
