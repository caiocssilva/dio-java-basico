package Exemplo2POO;
public class Autodromo {
    public static void main(String[] args) {
        //Polimorfismo
        Carro jeep = new Carro();
        jeep.setChassi("52465");
        //jeep.ligar();

        //polimorfismo
        Moto z400 = new Moto();
        z400.setChassi("55654");
        //z400.ligar();

        Veiculo coringa = jeep;

        coringa.ligar();
    }
}
