package moraqui.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import moraqui.ui.GerenciarUsuarioUI;
import moraqui.entity.GerenciarUsuario;

/**
 *
 * @author Jessica Terada
 */
public class GerenciarUsuarioDAO{
    Connection cn;
    Statement stm;
    boolean conectado = false;

   
    public void Conectar(){
        if(!conectado)
        {
            try{
                Class.forName("org.postgresql.Driver");
                cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/MoraquiBanco","postgres", "postgre");
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
    public void CadastrarUsuario(GerenciarUsuario usuario){
        Conectar();
        try
        {            
            stm.executeUpdate("INSERT INTO Usuario (nome,rg,cpf,datanasce,endereco,cep,sexo) "
                    +"VALUES('"+ usuario.getNome()+"', '"
                    + usuario.getRg() +"', '"
                    + usuario.getCpf() + "', '"
                    + usuario.getDataNascimento() +"', '"
                    + usuario.getEndreco() +"', '"
                    + usuario.getCep() +"', '"
                    + usuario.getSexo() +"')");
          
            JOptionPane.showConfirmDialog(null,"Cadastro Realizado", "Cadastro Usuario",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException erro){
            JOptionPane.showConfirmDialog(null,"Erro ao Cadastrar Usuário", "Cadastro Usuario",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void AlterarUsuario(GerenciarUsuario usuario){
        Conectar();
        try{          
            stm.executeUpdate("UPDATE Usuario SET Nome = '" + usuario.getNome() + 
                    "', CPF = " + usuario.getCpf() + 
                    ", DATANASCE = '" + usuario.getDataNascimento() + 
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
    public void PesquisarUsuario(){
    }
    
    public void ExcluirUsuario(GerenciarUsuario usuario){
        Conectar();
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
