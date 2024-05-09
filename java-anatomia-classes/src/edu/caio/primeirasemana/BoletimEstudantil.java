package edu.caio.primeirasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int medialFinal = 7;

        if (medialFinal < 6)
            System.out.println("REPROVADO");
        else if (medialFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
}