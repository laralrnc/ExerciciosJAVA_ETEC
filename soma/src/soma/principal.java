package soma;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		
		soma s = new soma();
		
		String op ="";
		
		s.n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um numero"));
		s.n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um numero"));	
		
		op = JOptionPane.showInputDialog(null, "Digite a operação (+, -, *, /)");
		
		if(op.equals("+")){
		s.soma();
		}else if (op.equals("-")){
		s.subtrair();
		}else if(op.equals("*")){
		s.multiplicar();
		}else{
		s.dividir();
		}
			
		
		
	}
}
