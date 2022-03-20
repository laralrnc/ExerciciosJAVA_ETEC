import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class UsaProdutoComMetodo 
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
  
  Produto ()
  {
  }
  
  void mostraProduto()
  {
    String mensagem, titulo;
    titulo = "Dados do produt";
    mensagem = "Produto:" + codigo + "\nDescri��o:" + descricao + "\nQuantidade.:" + quantidade + "\nPre�o....:" + preco + "\nDesconto...:" + desconto + "\nPre�o Total:" 
      + preco_total;
 JOptionPane.showMessageDialog(null, mensagem, titulo, JoptionPane.PLAIN_MESSAGE);
  }
  void calculaDesconto()
  {
  if ((preco>1.00) && (preco<2.00))
    desconto = 0.05;
  if ((preco>2.01) && (preco<5))
    desconto = 0.1;
  if (preco>=5.0)
    desconto = 0.15;
  }
  
  
  void digitaProduto()
  {
    
    codigo = Integer.parseInt(JOptionPane.showImputDialog(null,"Digite o codigo" , "Digita��o do c�digo" , JOptionPane.QUESTION_MESSAGE ));
    desconto = JOptionPane.showImputDialog(null,"Digite a descri��o" , "Digita��o da descri��o" , JOptionPane.QUESTION_MESSAGE );
    quantidade = Integer.parseInt(JOptionPane.showImputDialog(null,"Digite a quantidade" , "Digita��o da quantidade" , JOptionPane.QUESTION_MESSAGE ));
    preco = Double.parseDouble(JOptionPane.showImputDialog(null,"Digite o pre�o" , "Digita��o do pre�o" , JOptionPane.QUESTION_MESSAGE ));
  
  preco_total = quantidade * preco;
  }
}
  
  
  
      
      
    