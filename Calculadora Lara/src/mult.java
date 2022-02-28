

import javax.swing.JOptionPane;

public class mult {
	public double n1,n2,res;
	
	
	public mult (){
		this (0.0,0.0,0.0);
	}
	
	public mult(double s2_n1, double s2_n2, double s2_res){
		this.n1 = s2_n1;
		this.n2 = s2_n2;
		this.res = s2_res;
	}

	public void multiplicar (){
		res= n1*n2;
		JOptionPane.showMessageDialog(null, this.n1+" * "+ this.n2 +" = "+ res);
	}
	
}