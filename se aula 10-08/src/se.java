import java.util.Scanner;


public class se {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um numero");
		num= leia.nextInt();
		
		
		if (num % 2 == 0 ) {
			 System.out.println (" O numero " + num + " � par ");
		}else{
			System.out.println (" O numero " + num + " � impar ");
}
		
	if (num > 0 ){
		System.out.println (" O numero " + num + " � positivo ");
	}else if (num == 0){
		System.out.println (" O numero " + num + " � neutro ");
	}else{
		System.out.println (" O numero " + num + " � negativo ");
		
	}
	if  (num >=50 && num<=100){
		System.out.println (" O numero " + num + " esta entre 50 e 100 ");
	
	
	}
	}
}




	


