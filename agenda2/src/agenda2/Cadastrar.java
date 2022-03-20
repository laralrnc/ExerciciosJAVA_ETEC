package agenda2;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import java.sql.PreparedStatement;

public class Cadastrar
{
public void cadastro (String nome, String telefone)
//
  {

       
  ////////////////////////////////////////////////////////////////////////////////////////////////     
    String driver   = "com.mysql.jdbc.Driver";                    // Classe do driver JDBC      //
    String banco    = "agenda";                               // Nome do Banco criado       //
    String host     = "localhost";                                // Maquina onde está o banco  //
    String str_conn = "jdbc:mysql://" + host + ":3306/" + banco;  // URL de conexão             //
    String usuario  = "root";                                     // Usuário do banco           //
    String senha    = "";                                         // Senha de conexão           //
  ////////////////////////////////////////////////////////////////////////////////////////////////
    try 
      {
         Class.forName(driver); //Carrega o driver
  
         //Obtém a conexão com o banco
         Connection conn = DriverManager.getConnection(str_conn, usuario, senha);
  
         System.out.println("Conexao com Databases ok");
                 
         Statement stmt       = conn.createStatement();
         String sql           = "insert into agenda  values (?,?);";
         PreparedStatement ps = null;
         
         ps = conn.prepareStatement(sql);
         ps.setString(1,nome.trim());
         ps.setString(2,telefone);
         ps.executeUpdate();
         ps.close(); 
         JOptionPane.showMessageDialog(null,"Cadastro"," Seu Cadastro foi Efetuado com Sucesso! ",JOptionPane.INFORMATION_MESSAGE);
      }
   catch (ClassNotFoundException ex)
      {
         System.out.println("Não foi possível carregar o driver.");
         ex.printStackTrace();
      }

   catch (SQLException ex) 
      {
         System.out.println("Problema com o SQL");
         ex.printStackTrace();
      }
    
    
   }


}
