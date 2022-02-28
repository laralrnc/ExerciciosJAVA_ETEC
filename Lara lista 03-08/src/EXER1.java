import java.util.Scanner;

public class EXER1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);		
			double nota1 = 0;
			double nota2 = 0;
			double nota3 = 0;
			String nome = "";
			System.out.println("Digite a primeira nota");
			nota1 = leia.nextDouble();
			
			System.out.println("Digite a segunda nota");
			nota2 = leia.nextDouble();	
			
			System.out.println("Digite a terceira nota");
			nota3 = leia.nextDouble();	
			
			System.out.println("Digite seu nome");
			nome = leia.next();	
			
			System.out.println( "O aluno " + nome + " teve como media " + (nota1+nota2+nota3)/3);
	}

}
