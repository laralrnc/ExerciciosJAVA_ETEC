
import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		
		calculo s = new calculo();
		sub s1 = new sub();
		mult s2 = new mult();
		div s3 = new div();
		
		String op ="";
		
		
		op = JOptionPane.showInputDialog(null, "Digite a operação (+, -, *, /)");
		s.n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um numero"));
		s.n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um numero"));
		
		
		if(op.equals("+")){
			s.soma();
}
		if (op.equals("-")){
		s1.subtrair();
}
		if(op.equals("*")){
		s2.multiplicar();
}
		if(op.equals("/")){
		s3.dividir();	
}
}
}
