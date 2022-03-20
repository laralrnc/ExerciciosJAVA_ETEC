import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class UsaProdutoComMetdodo
{
 public static void main (String args[])
 {
   Produto prod1, prod2, prod3;
   prod1 = new Produto();
   prod2 = new Produto();
   prod3 = new Produto();
   
   //Produto prod1 = new Produto();
   //Produto prod2 = new Produto();
   //Produto prod3 = new Produto();
   
   // ===============================
   // Entrada de dados
   // ===============================
   String cod1 = JOptionPane.showInputDialog(null, "Código", "Entrada de código",
                 JOptionPane.QUESTION_MESSAGE);                            
   String des1 = JOptionPane.showInputDialog(null, "Descrição", "Entrada de descrição",
                 JOptionPane.QUESTION_MESSAGE);                                          
   String qtd1 = JOptionPane.showInputDialog(null, "Quantidade", "Entrada de quantidade",
                 JOptionPane.QUESTION_MESSAGE); 
   String pre1 = JOptionPane.showInputDialog(null, "Preço", "Entrada de preço",
                 JOptionPane.QUESTION_MESSAGE);
   
   String cod2 = JOptionPane.showInputDialog(null, "Código", "Entrada de código",
                 JOptionPane.QUESTION_MESSAGE);                            
   String des2 = JOptionPane.showInputDialog(null, "Descrição", "Entrada de descrição",
                 JOptionPane.QUESTION_MESSAGE);                                          
   String qtd2 = JOptionPane.showInputDialog(null, "Quantidade", "Entrada de quantidade",
                 JOptionPane.QUESTION_MESSAGE); 
   String pre2 = JOptionPane.showInputDialog(null, "Preço", "Entrada de preço",
                 JOptionPane.QUESTION_MESSAGE);  
   
   String cod3 = JOptionPane.showInputDialog(null, "Código", "Entrada de código",
                 JOptionPane.QUESTION_MESSAGE);                            
   String des3 = JOptionPane.showInputDialog(null, "Descrição", "Entrada de descrição",
                 JOptionPane.QUESTION_MESSAGE);                                          
   String qtd3 = JOptionPane.showInputDialog(null, "Quantidade", "Entrada de quantidade",
                 JOptionPane.QUESTION_MESSAGE); 
   String pre3 = JOptionPane.showInputDialog(null, "Preço", "Entrada de preço",
                 JOptionPane.QUESTION_MESSAGE);
   
   // ===============================
   // Conversões de dados
   // ===============================
   
   prod1.codigo = Integer.parseInt(cod1);
   prod1.descricao = des1;
   prod1.quantidade = Integer.parseInt(qtd1);
   prod1.preco = Double.parseDouble(pre1);
   
   prod2.codigo = Integer.parseInt(cod2);
   prod2.descricao = des2;
   prod2.quantidade = Integer.parseInt(qtd2);
   prod2.preco = Double.parseDouble(pre2);
   prod3.codigo = Integer.parseInt(cod3);
   prod3.descricao = des3;
   prod3.quantidade = Integer.parseInt(qtd3);
   prod3.preco = Double.parseDouble(pre3);
   
   prod1.preco_total = prod1.preco * prod1.quantidade;
   prod2.preco_total = prod2.preco * prod2.quantidade;
   prod3.preco_total = prod3.preco * prod3.quantidade;
   
   prod1.calculaDesconto(); 
   prod2.calculaDesconto();
   prod3.calculaDesconto();
   
   prod1.mostraProduto();
   prod2.mostraProduto();
   prod3.mostraProduto();
        
 }
}


class Produto
{
  int codigo;
  String descricao;
  int quantidade;
  double preco;
  double desconto;
  double preco_total;
  
  
  Produto()
  {    
  }
  
  void mostraProduto()
  {
    //System.out.println("Produto....: " + codigo);
    //System.out.println("Descrição..: " + descricao);
    //System.out.println("Quantidade.: " + quantidade);
    //System.out.println("Preço......: " + preco);
    //System.out.println("Desconto...: " + desconto);
    //System.out.println("Preço Total: " + preco_total);
    //System.out.println("==================================");
    //System.out.println();
    String mensagem = "Código: " + codigo + "Descrição: " + descricao;
    JOptionPane.showMessageDialog(null, mensagem, "Lista produto", 
    JOptionPane.INFORMATION_MESSAGE);                              
  }
  
  void calculaDesconto()
  {
    if ((preco> 1.00) && (preco < 2.00))
       desconto = 0.05;
    if ((preco > 2.01) && (preco < 5))
       desconto = 0.1;
    if (preco >=5.0)
       desconto = 0.15;
   }
  
}

