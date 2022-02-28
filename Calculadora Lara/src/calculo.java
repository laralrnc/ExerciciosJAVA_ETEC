
import javax.swing.JOptionPane;

public class calculo {
	public double n1,n2,res;
	
	
	public calculo(){
		this (0.0,0.0,0.0);
	}
	
	public calculo(double s_n1, double s_n2, double s_res){
		this.n1 = s_n1;
		this.n2 = s_n2;
		this.res = s_res;
	}

	public void soma (){
		res= n1+n2;
		JOptionPane.showMessageDialog(null, this.n1+" + "+ this.n2 +" = "+ res);
	}

}