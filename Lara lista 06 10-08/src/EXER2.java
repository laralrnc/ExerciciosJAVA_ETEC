import java.util.Scanner;


public class EXER2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int id= 0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um numero");
		num= leia.nextInt();
		
		
		if (num  == 1 ) {
			 System.out.println (" JHJHJ");
		}else if (num == 2){
			System.out.println("Digite um valor");
			num= leia.nextInt();
			System.out.println ("10% de  " + num + " é " +(num*0.10) );
		}else if (num == 3 ){
		System.out.println ("Digite sua idade ");
		id= leia.nextInt();
		if (id >= 1 && id<= 10){
		System.out.println ("infantil");
		}else if (id >=11 && id <= 13 ){
			System.out.println ("infanto juvenil");
		}else if(id >=14 && id <=17 ){
			System.out.println ("pre adolescente");
		}else if (id >18){
			System.out.println ("adulto");
		}
		}
		if (num == 4){
			System.out.println ("sair");
		}
		}
	
	
}
