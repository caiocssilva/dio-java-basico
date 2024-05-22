public class ResultadosEscolar {
    public static void main(String[] args) {
        /*int nota = 6;

        if(nota >= 7)
            System.err.println("APROVADO");

        else if (nota >= 5 && nota < 7)
            System.err.println("RECUPERAÇÃO");

        else
            System.err.println("REPROVADO");
        

        int nota = 6;
        String resultado = nota >= 7 ? "APROVADO" : "REPROVADO";
        System.out.println(resultado);
        */

        int nota = 4;
        String resultado = nota >= 7 ? "APROVADO" : nota >= 5 && nota < 7 ? "RECUPERAÇÃO" : "REPROVADO";
        System.out.println(resultado);

    }
}
