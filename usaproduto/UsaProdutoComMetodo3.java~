import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class UsaProdutoComMetdodo
{
 public static void main (String args[])
 {
     
    Produto prod1 = new Produto();
    Produto prod2 = new Produto();
    Produto prod3 = new Produto();
   
   prod1.digitaProduto();
   prod2.digitaProduto();
   prod3.digitaProduto();
      
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
    String mensagem, titulo;
    titulo = "Dados do produto"; 
    mensagem = "Produto: " + codigo + "\nDescrição: " + descricao +
               "\nQuantidade.: " + quantidade + "\nPreço......: " + 
               preco + "\nDesconto...: " + desconto + "\nPreço Total: " +
               preco_total;
    JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.PLAIN_MESSAGE);
    
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
  
  void digitaProduto()
  {
   codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código", 
                "Digitação do código", JOptionPane.QUESTION_MESSAGE));
   descricao = JOptionPane.showInputDialog(null,"Digite o descrição", 
                "Digitação do descrição", JOptionPane.QUESTION_MESSAGE);
   quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o quantidade", 
                "Digitação do quantidade", JOptionPane.QUESTION_MESSAGE));
   preco = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço", 
                "Digitação do preço", JOptionPane.QUESTION_MESSAGE));
   
   preco_total = quantidade * preco;
  }
  
}

