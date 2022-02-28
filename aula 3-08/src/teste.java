import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner (System.in);		
		int num = 0 ;
		double valor = 0;
		String nome ="";
		float n = 0; 
		boolean op = true;
			System.out.println("Digite um numero");
			num = leia.nextInt();
			
			System.out.println("Digite um numero");
			n = leia.nextFloat();	
			
			System.out.println("Digite seu nome");
			nome = leia.next();	
			
			System.out.println("Digite um numero");
			valor = leia.nextDouble();	
			
			System.out.println( nome + " recebeu " + (num+n+valor));
		
	
	}

}
 