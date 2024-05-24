public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23.765-064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Erro ao formatar CEP: " + e.getMessage());
        }
    }
    
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 9) {
            throw new CepInvalidoException("CEP inválido. O formato correto é 'XX.YYY-ZZZ'");
        }

        // simulando um cep formatado
        return "23.765-064";
    }
}