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

public class Consultar {
      public void consulta (String nomec)
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
         String sql="";
         if (nomec.equals("TODOS"))
            {sql  = "select * from agenda";}
         else
            {sql  = "select * from agenda where nome = \'" + nomec + "\';";} 
            System.out.println(nomec + "==> " +nomec.length());
            System.out.println(sql);
         ResultSet rs   = stmt.executeQuery(sql);

         String dados= "";

         while (rs.next())
         {
             dados=rs.getString(1).toString()+ " "+ rs.getString(2).toString()+ "  ";
             JOptionPane.showMessageDialog(null, dados + "\n");
         }
         rs.close();
         JOptionPane.showMessageDialog(null," Sua Consulta foi  Efetuada com Sucesso","Consulta ",JOptionPane.INFORMATION_MESSAGE);
      }
 
   catch (ClassNotFoundException ex)
      {
         System.out.println("Não foi possível carregar o driver.");
         ex.printStackTrace();
      }

   catch (SQLException ex) 
      {
         System.out.println("Problema ao consultar com o SQL");
         ex.printStackTrace();
      }
    
    
   }
}
