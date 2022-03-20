class UsarProduto
{
  public static void main (String args[])
  {
    Produto produto1,produto2,produto3;
    produto1 = new Produto();
    produto2 = new Produto();
    produto3 = new Produto();
    
    System.out.print(produto1.codigo +"" + produto1.nome +"");
    System.out.print(produto1.quantidade + "" + produto1.preco);
    System.out.println();
    produto1.codigo= 10;
    produto1.nome="Sabonete";
    produto1.quantidade= 5;
    produto1.preco=2.32;
    System.out.print(produto1.codigo +"" + produto1.nome + "");
    System.out.print(produto1.quantidade +"" + produto1.preco + "");
    System.out.println();
    
     System.out.print(produto2.codigo +"" + produto2.nome +"");
    System.out.print(produto2.quantidade + "" + produto2.preco); 
    System.out.println();
    produto2.codigo= 1;
    produto2.nome="Shampoo";
    produto2.quantidade= 3;
    produto2.preco=10.35;
    System.out.print(produto2.codigo +"" + produto2.nome + "");
    System.out.print(produto2.quantidade +"" + produto2.preco + "");
    System.out.println();
    
     System.out.print(produto3.codigo +"" + produto3.nome +"");
    System.out.print(produto3.quantidade + "" + produto3.preco);
    System.out.println();
    produto3.codigo= 6;
    produto3.nome="Pasta de dente";
    produto3.quantidade= 9;
    produto3.preco=1.35;
    System.out.print(produto3.codigo +"" + produto3.nome + "");
    System.out.print(produto3.quantidade +"" + produto3.preco + "");
    System.out.println();
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
 }
   
   
   
 
 
  
 
 
 
 
 
 
 
 
 
 
 