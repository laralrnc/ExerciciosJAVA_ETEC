
import java.util.Scanner;


public class exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um numero de 1 a 4");
		num= leia.nextInt();
		
		
		if (num  == 1 ) {
			 System.out.println (" INCLUSÃO ");
		}if (num == 2){
			System.out.println (" ALTERAÇÃO ");
	}if (num == 3){
		System.out.println ("EXCLUSÃO ");
	} if (num == 4){
		System.out.println (" SAIR ");
	}else{
		System.out.println ("ERRO ");
		
	}
	}
	
	
	}
	