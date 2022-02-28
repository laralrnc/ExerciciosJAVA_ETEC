import java.util.Scanner;

public class EXER2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);	
		double real = 0;
		double resul = 0;
		
		
		
		System.out.println("Digite algum valor em reais");
		real = leia.nextDouble();
		
			
		
		System.out.println( " 10% de  " + real + " é " + (real*0.10) );
	}

}
