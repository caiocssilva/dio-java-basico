public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "REBEKA", "MIGUEL", "MARA", "CAIO"};

        // Forma abreviada
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

        /* 
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
        */
    }
}
