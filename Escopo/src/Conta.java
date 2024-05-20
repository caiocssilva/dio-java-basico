public class Conta {
    // variavel da classe conta
    double saldo = 10.0;

    public void sacar(double valor) {
        // variavel local de método 
        double novoSaldo = saldo - valor;
    }
    public void imprimirSaldo () {
        // disponivel em toda a classe
        System.out.println(saldo);
        //somente o método sacar conhece esta variavel
        System.out.println(novoSaldo);
    }

    public double calcularDividaExponencial () {
        // variavel local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0; // começando a varialvel com valor zero
        for (int x=1; x<5; x++) { // x variavel de escopo de fluxo 
            // estavariavel será reiniciada a cada execução for
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        // escopo de fluxo
        // x e valorCalculado nunca estrão disponiveis fora do for

        return valorMontante
    }
}
