import javax.swing.JOptionPane;

public class pessoa {
// defini��o dos atributos, ou caracteristicas das pessoas
	public String nome;
	public String sexo;
	public String idade;
	public String estatura;
	// constru��o para inicializar os atributos com valores vazios
	public pessoa (){
		this("","","","");
	}
	// construtores para inicializar os atributos com valores passados por parametro 
	public pessoa (String p_nome, String p_sexo, String p_idade, String p_estatura){
		this.nome= p_nome;
		this.sexo=p_sexo;
		this.idade=p_idade;
		this.estatura=p_estatura;
	}
	//definindo um metodo ou a��o para o projeto pegando os valores que est�o nos atributos
	public void andar (){
		if(this.sexo.equals("F")){
			JOptionPane.showMessageDialog(null, this.nome + " est� falando");	
		}else{	
		JOptionPane.showMessageDialog(null, this.nome + " est� andando");	
}
}
}