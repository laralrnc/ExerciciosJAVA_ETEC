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

public class Alterar {

public void alterar (String nome)
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
  
         //  ******  Obtém a conexão com o banco  ****** //

         Connection conn = DriverManager.getConnection(str_conn, usuario, senha);
  
         System.out.println("Conexao com Databases ok");
                  
         Statement stmt = conn.createStatement();
         String    sql  = "Update agenda set " + nome + ";";
         stmt.executeUpdate(sql);
         conn.close();
         JOptionPane.showMessageDialog(null,"Sua Alteração foi Efetuada com Sucesso","Alterar",JOptionPane.INFORMATION_MESSAGE);
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
