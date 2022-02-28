

import javax.swing.JOptionPane;

public class sub {
	public double n1,n2,res;
	//Construtores
			public sub(){
				this(0.0,0.0,0.0);
				}

			
			public sub(double s1_n1,double s1_n2, double s1_res){
				this.n1 = s1_n1;
				this.n2 = s1_n2;
				this.res = s1_res;
				}
			
			public void subtrair(){
				res=n1-n2;
				JOptionPane.showMessageDialog(null, this.n1+" - "+this.n2+" = "+(n1-n2));
			}
}