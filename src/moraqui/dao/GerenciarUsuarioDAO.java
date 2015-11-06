package moraqui.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import moraqui.ui.GerenciarUsuarioUI;
import moraqui.entity.GerenciarUsuario;
import moraqui.ui.LoginUI;
import moraqui.ui.GerenciarMoradiaUI;
import moraqui.entity.GerenciarMoradia;


/**
 *
 * @author Jessica Terada
 */
public class GerenciarUsuarioDAO{
    Connection cn;
    Statement stm;
    boolean conectado = false;

   
    public void conectar(){
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
    
    public void desconectar(){
        if(conectado){
            try {
                cn.close();
                conectado = false;
            } catch (SQLException ex) {
                Logger.getLogger(GerenciarUsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
    public void cadastrar(GerenciarUsuario usuario){
        conectar();
        try
        {   
                    String sql = "with _idUsuario as (INSERT INTO Usuario (nome,rg,cpf,datanasce,senha, endereco,cep,sexo,situacao,tipo) "
                    +"VALUES('"+ usuario.getNome()+"', '"
                    + usuario.getRg() +"', '"
                    + usuario.getCpf() + "', '"
                    + usuario.getDataNascimento() +"', '"
                    + usuario.getSenha()+ "', '"
                    + usuario.getEndreco() +"', '"
                    + usuario.getCep() +"', '"
                    + usuario.getSexo() +"', '"
                    + usuario.getSituacao() + "','"
                    + usuario.getTipo()+"') RETURNING codusuario AS idUsuario)";
            

                if(usuario.getTipo().equals("Gerenciador")){
                    sql = sql + " INSERT INTO Gerenciador(codusuario) select idUsuario from _idUsuario;";
                }
                else if(usuario.getTipo().equals("Locador"))
                        sql = sql + " INSERT INTO Locator(codusuario) select idUsuario from _idUsuario;";
                else if(usuario.getTipo().equals("Locatario")){
                        sql = sql + "INSERT INTO Locatario(codusuario,alergias,fumante) "
                                  + " select idUsuario,'"+usuario.getAlergias()+"',";
                         if(usuario.isFumante()){
                                sql = sql + "true from _idUsuario;";
                         }else
                         {
                             sql = sql+ "false from _idUsuario;";
                         }
                }
                stm.executeUpdate(sql);        
                

                JOptionPane.showConfirmDialog(null,"Cadastro Realizado", "Cadastro Usuario",JOptionPane.OK_OPTION);
        }
        catch(SQLException erro){
            JOptionPane.showConfirmDialog(null,erro, "Cadastro Usuario",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public GerenciarUsuario consultarUsuarioLocatarioLocator(GerenciarUsuario usuario){
        conectar();
        String sql = "SELECT * from usuario where codusuario = '"+
                usuario.getId()+"'";
        try{
            PreparedStatement stat = cn.prepareStatement(sql);
            ResultSet rs = stat.executeQuery();
            while(rs.next()){
                  usuario.setDataNascimento(rs.getString(("datanasce")));
                  usuario.setCep(rs.getString(("cep")));
                  usuario.setCpf(rs.getString(("cpf")));
                  usuario.setNome(rs.getString(("nome")));
                  usuario.setSenha(rs.getString(("senha")));
                  usuario.setEndreco(rs.getString(("endereco")));
                  usuario.setSexo(rs.getString(("sexo")));
                  usuario.setRg(rs.getString("rg"));
                  GerenciarUsuario.setTipo(rs.getString("tipo"));
            }
            usuario = consultarTipo(usuario);
        }
        catch(Exception erro){
        
        
        }
        return usuario;
    }
    public boolean login(GerenciarUsuario usuario){
        conectar();
        String senha = null;
        String tipo = null;
        int codusuario = 0;
        String codlocator = null;
        try{
            String sql = "SELECT senha, codusuario, tipo FROM usuario WHERE rg = '" + usuario.getRg()+"'"
                        + " AND senha = '"+usuario.getSenha()+"'";
            PreparedStatement stat = cn.prepareStatement(sql);
            ResultSet rs = stat.executeQuery();
            if(rs == null){
                JOptionPane.showConfirmDialog(null,"Não foi possivel encontrar o usuario", "Login",JOptionPane.OK_OPTION);
                return false;
            }else{
                while(rs.next()){
                    senha = rs.getString("senha");
                    GerenciarUsuario.setId(rs.getString("codusuario"));
                    GerenciarUsuario.setTipo(rs.getString("tipo"));
                }
                if(GerenciarUsuario.getTipo().equals("Locatario")){
                    sql = "SELECT codlocatario from locatario where codusuario = '"
                            +GerenciarUsuario.getId()+"'";
                    PreparedStatement stat2 = cn.prepareStatement(sql);
                    ResultSet rs2 = stat2.executeQuery();
                    while(rs2.next()){
                        String a = rs2.getString("codlocatario");
                        GerenciarUsuario.setIdTipo(rs2.getString("codlocatario"));
                    }
                    return true;
                }
                if(GerenciarUsuario.getTipo().equals("Locador")){
                    sql = "SELECT codlocator from locator where codusuario = '"
                            +GerenciarUsuario.getId()+"'";
                    PreparedStatement stat3 = cn.prepareStatement(sql);
                    ResultSet rs3 = stat3.executeQuery();
                    while(rs3.next()){
                        GerenciarUsuario.setIdTipo(rs3.getString("codlocator"));
                    }
                    return true;
                }
                
                
            }//else da senha
        }//try
        catch(Exception erro){
             JOptionPane.showConfirmDialog(null,erro, "Login - Erro de Banco",JOptionPane.OK_OPTION);
             return false;
          }
        return true;
    }
    
    public GerenciarUsuario consultarTipo(GerenciarUsuario usuario){
        ResultSet rs;
        String sql = "select ";
        try {
            conectar();
            switch (usuario.getTipo()) {
                case "Gerenciador":
                       sql = sql + "from gerenciador ";
                    break;
                case "Locatario":
                       sql = sql + "alergias, fumante from locatario ";
                    break;
                case "Locator":
                        sql = sql + "from locator ";
                    break;
                case "Locador":
                        sql = sql + "from locator ";
                    break;
            }
             sql = sql +"where codusuario = "+usuario.getId();
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            if(rs.next()){
                if(usuario.getTipo().equals("Locatario"))
                {
                    usuario.setFumante(rs.getBoolean("fumante"));
                    usuario.setAlergias(rs.getString("alergias"));
                    usuario.setTipo("Locatario");
                }
            }else{
                
             }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return usuario;
    }
    public DefaultTableModel pesquisar(String condicoes){
        ResultSet rs;
        conectar();
        DefaultTableModel aModel = new DefaultTableModel();
        String[] tableColumnsName = {"codusuario", "nome", "rg", "cpf","Data Nascimento","Endereco",
                                    "cep", "sexo","tipo"};
        aModel.setColumnIdentifiers(tableColumnsName);
        String sql = "Select codusuario, nome, rg, cpf,DataNasce,Endereco,"
                      +"cep, sexo,tipo from usuario";
          if(!condicoes.equals(""))
              sql = sql + " WHERE "+ condicoes + " AND situacao = TRUE";
          
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
    public DefaultTableModel pesquisarLocatario(String condicoes){
        ResultSet rs;
        conectar();
        DefaultTableModel aModel = new DefaultTableModel();
        String[] tableColumnsName = {"codlocatario", "nome", "rg", "cpf"};
        aModel.setColumnIdentifiers(tableColumnsName);
        String sql = "Select l.codlocatario, u.nome, u.rg, u.cpf " + 
                "from usuario u, locatario l where l.codusuario = u.codusuario";
         
        if(!condicoes.equals(""))
              sql = sql + " AND "+ condicoes + " AND situacao = TRUE";
          
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
    public void alterar(GerenciarUsuario usuario){
        conectar();
        try{          
            stm.executeUpdate("UPDATE Usuario SET Nome = '" + usuario.getNome() + 
                    "', CPF = " + usuario.getCpf() + 
                    ", DATANASCE = '" + usuario.getDataNascimento() + 
                    "', SENHA = '" + usuario.getSenha()+
                    "', ENDERECO = '" + usuario.getEndreco() +
                    "', CEP = " + usuario.getCep()+ 
                    ", sexo = '" + usuario.getSexo()+
                    "' WHERE RG = " + usuario.getRg()+""  );
             
            JOptionPane.showConfirmDialog(null, "Atualização Realizada", "Cadastro Usuario", JOptionPane.INFORMATION_MESSAGE);
            
        }
        catch(SQLException e){
            JOptionPane.showConfirmDialog(null, "Erro ao Atualizar Usuario", "Cadastro Usuario", JOptionPane.INFORMATION_MESSAGE);
        }
    }    
    public void excluir(GerenciarUsuario usuario){
        conectar();
        try
        {
            stm.executeUpdate("DELETE FROM Usuario where RG = " + usuario.getRg() + "");
            
            JOptionPane.showConfirmDialog(null, "Exclução Realizada", "Cadastro Usuario", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ee){
            JOptionPane.showConfirmDialog(null, "Erro ao Excluir Usuario", "Cadastro Usuario", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
