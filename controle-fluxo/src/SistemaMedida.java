// import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "G";

        switch (sigla) {
            case "P": {
                System.err.println("PEQUENO");
                break;
            }
            case "M": {
                System.err.println("MÉDIO");
                break;
            }case "G": {
                System.err.println("GRANDE");
                break;
            }
            default:
                System.err.println("INVÁLIDO");
        }    
    }

        /* 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma sigla: ");
        String sigla = scanner.nextLine();

        if ( sigla.equals("P") )
            System.out.println("PEQUENO");
        else if ( sigla.equals("M"))
            System.out.println("MÉDIO");
        else if ( sigla.equals("G") )
            System.out.println("GRANDE");
        else
            System.err.println("INDEFINIDO");

        scanner.close();  
        */
}