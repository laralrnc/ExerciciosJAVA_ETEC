
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class ContaCorrente{
 public static void main(String args []){
        final int TotalDeContas = 50;
  Conta ct[] = new Conta[TotalDeContas]; 
  for(int i = 0; i < TotalDeContas; i++){
            do{
    System.out.print("\n[1] - Criar Conta");
    System.out.print("\n[2] - Depositar");
    System.out.print("\n[3] - Sacar");
    System.out.print("\n[4] - Imprimir");
    System.out.print("\n[5] - Sair");
    Scanner sc = new Scanner(System.in);
    int opcao;
    System.out.print("\n\nQual a opcao escolhida? ");
                opcao = sc.nextInt();
    switch(opcao){
     case 1: ct[i] = new Conta();
          if(i == TotalDeContas + 1){
             System.out.print("ERRO! Numero de contas atingido!\n\n");
             break;
             }
          BufferedReader brc = new BufferedReader(new InputStreamReader(System.in)); //
          int numeroConta;
             String numConta ="";
             System.out.print("\nDigite o numero da conta: ");
             try{
                 numConta = brc.readLine(); 
             }catch (IOException e){
              System.out.print("\nERRO! Conta Invalida");
             }
             numeroConta = Integer.parseInt(numConta); 
             ct[i].setNumero(numeroConta); 
             String nomeUsuario ="";
             Scanner nm = new Scanner(System.in);
             System.out.print("\nDigite o nome do requerente: ");
             nomeUsuario = nm.nextLine();
             ct[i].setNome(nomeUsuario);
             i++;
             break;
     case 2:if(i == 0){
             System.out.print("\nERRO! Nenhuma conta cadastrada\n");
             break;
             }
             ct[i] = new Conta();
             int nConta = 0;
             System.out.print("\nInforme o numero da conta: ");
             nConta = sc.nextInt();
             double dep = 0;
             System.out.printf("Insira o valor do deposito:R$ ");
             dep = sc.nextDouble();
             ct[i].depositar(dep);
             break;
     case 3: System.out.print("\nAinda nao fiz");
             break;
     case 4: if (i == 0){
           System.out.print("\nERRO! Nenhuma conta cadastrada!\n");
           break;
        }
       System.out.print("\nInforme o numero da conta: ");
       int nCta = 0;
       nCta = sc.nextInt();
       ct[nCta].imprimirEstado();
       break;
     case 5: System.exit(0);
     default : System.out.print("\nOpcao Invalida\n\n");
    }
   }while (true);
  }
 }
}
