import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto acanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura em centímetros:");
        double altura = scanner.nextDouble();

        // imprimindo os dados obtidos pelos o usuario
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");

        scanner.close();
    }
}

