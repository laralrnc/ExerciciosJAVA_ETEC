
public class Conta {
  private int numero; 
  private String nomeTitular;
  private double saldo;
  public Conta(){ 
  }
  public double getSaldo(){ 
   return saldo;
  }
  public void depositar(double valor){
   if(valor >= 0){ 
    saldo+=valor;
   }else{
    System.out.print("\nValor invalido\n\n");
   }
  }
  public void sacar(double valor){
   if(valor < getSaldo() && valor > 0){ 
    saldo-=valor;
   }else{
    if(valor < 0){
     System.out.println("\nValor invalido\n\n"); 
    }else{
     System.out.println("Saldo Insuficiente\n\n"); 
    }
   }
  }

 public String getNome(){
   return nomeTitular;
  }
  public void setNome(String nome){
    nomeTitular = nome;
  }
  public int getNumero(){
   return numero;
  }
  public void setNumero(int num){
   numero = num;
  }
  public void imprimirEstado(){
   System.out.println("\nConta..: " + numero);
   System.out.println("\nTitular: " + nomeTitular);
   System.out.println("\nSaldo..: " + saldo);
  }
}
