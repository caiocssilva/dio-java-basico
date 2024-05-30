//Veiculo Herança
public class Carro extends Veiculo {   
    //Encapsulamento
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void confereCombustivel(){
        System.out.println("Coferindo combustivel");
    }
    private void confereCambio(){
        System.out.println("Coferindo cambio em P");
    }

}
