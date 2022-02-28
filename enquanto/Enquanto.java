package enquanto;

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int cont = 0;
		int i = 0;
		Scanner leia = new Scanner(System.in);
		
		while (cont <=10) {
			
			System.out.println(cont);
			cont = cont +1; 
		}
		
		cont = 1; 
		
		while(cont!= 0){
			System.out.println("Digite um numero ou 0 para sair");
			cont = leia.nextInt();
		}
		
		
		while (cont!=4){
			 System.out.println("Escolha a opção desejada:");
			 System.out.println("1- Cadastrar");
			 System.out.println("2- Alterar \n3 - Excluir \n4 - Sair");
			 cont = leia.nextInt();
		}
		
		System.out.println("Digite  a quantidade de numeros");
		i = leia.nextInt(); 
		

	do{
		
		System.out.println("cont");
		
		
		
}while (cont !=0);

	
}


}





	
	

