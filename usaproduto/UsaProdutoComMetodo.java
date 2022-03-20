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
    mensagem = "Produto:" + codigo + "\nDescrição:" + descricao + "\nQuantidade.:" + quantidade + "\nPreço....:" + preco + "\nDesconto...:" + desconto + "\nPreço Total:" 
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
    
    codigo = Integer.parseInt(JOptionPane.showImputDialog(null,"Digite o codigo" , "Digitação do código" , JOptionPane.QUESTION_MESSAGE ));
    desconto = JOptionPane.showImputDialog(null,"Digite a descrição" , "Digitação da descrição" , JOptionPane.QUESTION_MESSAGE );
    quantidade = Integer.parseInt(JOptionPane.showImputDialog(null,"Digite a quantidade" , "Digitação da quantidade" , JOptionPane.QUESTION_MESSAGE ));
    preco = Double.parseDouble(JOptionPane.showImputDialog(null,"Digite o preço" , "Digitação do preço" , JOptionPane.QUESTION_MESSAGE ));
  
  preco_total = quantidade * preco;
  }
}
  
  
  
      
      
    