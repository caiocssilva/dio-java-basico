package edu.caio.segundasemana;

public class MinhaClasse {

    public static void main (String [] args) {
        String primeiroNome = "Caio";
        String segundoNome = "César";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}