class UsaVeiculo {

public static void main (String args[])
{
  Veiculo carro = new Veiculo();
  //criando objeto e insere valor/
carro.marca = "volkswagen";
carro.modelo="fox";
carro.velocidade=0;
System.out.println(carro.marca );
  System.out.println(carro.modelo );
  System.out.println(carro.velocidade );
  
  for(int i = 1; i <=5; i++){
    carro.acelera();
  
  carro.mostraVelocidade();
}
}
}
class Veiculo {
String marca, modelo;
int velocidade;

Veiculo() {
marca="";
modelo = "";
velocidade =0;
}
public void acelera()
{
if(velocidade <=10)
  velocidade++;
}
void frea(){
if(velocidade >0)
  velocidade--;
}
void mostraVelocidade(){
  System.out.println(velocidade);
}
}