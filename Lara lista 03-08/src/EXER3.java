import java.util.Scanner;

public class EXER3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);	
		double a = 0;
		double b = 0;
		double c = 0;
		
		
		
		System.out.println("Digite um numero (a)");
		a = leia.nextDouble();
		
		System.out.println("Digite um numero (b)");
		b = leia.nextDouble();	
		
		
		
		System.out.println( " (A)+(b)= (C) "  + " " + ( a + b ));
		System.out.println( "(A)*(b)=(c)"  + " "  +( a * b ));
		System.out.println( "(A)/(b)= (c)" + "" + ( a / b)) ;
		System.out.println( "(A)-(b)= (c)" + ( a - b ));
	}

}
