import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//criando uma nova instancia na classe pessoa
		pessoa p = new pessoa();
		//definindo valores para Jo�o
		p.nome="Jo�o";
		p.idade="20";
		p.sexo="masculino";
		p.estatura="1,70";
		
		p.nome=JOptionPane.showInputDialog(null, "Digite o nome");
		p.idade=JOptionPane.showInputDialog(null, "Digite a idade");
		p.sexo=JOptionPane.showInputDialog(null, "Digite o sexo");
		p.estatura=JOptionPane.showInputDialog(null, "Digite a altura");

		//utilizando uma a��o ou metodo para o jo�o
		p.andar();

	}

}
