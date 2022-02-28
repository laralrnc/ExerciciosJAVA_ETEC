

import javax.swing.JOptionPane;

public class div {
	public double n1,n2,res;
	
	
	public div (){
		this (0.0,0.0,0.0);
	}
	
	public div(double s3_n1, double s3_n2, double s3_res){
		this.n1 = s3_n1;
		this.n2 = s3_n2;
		this.res = s3_res;
	}

	public void dividir (){
		res= n1/n2;
		JOptionPane.showMessageDialog(null, this.n1+" / "+ this.n2 +" = "+ res);
	}
	
}
