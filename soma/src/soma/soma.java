package soma;

import javax.swing.JOptionPane;

public class soma {
	public double n1,n2,res;
	
	
	public soma(){
		this (0.0,0.0,0.0);
	}
	
	public soma(double s_n1, double s_n2, double s_res){
		this.n1 = s_n1;
		this.n2 = s_n2;
		this.res = s_res;
	}

	public void soma (){
		res= n1+n2;
		JOptionPane.showMessageDialog(null, this.n1+" + "+ this.n2 +" = "+ res);
	}
	public void subtrair(){
		res= n1-n2;
		JOptionPane.showMessageDialog(null, this.n1+" - "+ this.n2 +" = "+ res);
	}
	public void multiplicar(){
		res= n1*n2;
		JOptionPane.showMessageDialog(null, this.n1+" * "+ this.n2 +" = "+ res);
	}
	public void dividir(){
		res= n1/n2;
		JOptionPane.showMessageDialog(null, this.n1+" / "+ this.n2 +" = "+ res);
	}
}
