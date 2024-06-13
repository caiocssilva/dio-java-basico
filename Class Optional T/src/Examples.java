import java.util.Optional; // Importa a classe Optional do pacote java.util

public class Examples {
    public static void main(String[] args) {
        // Método: of(value)
        // Descrição: Cria um Optional contendo o valor fornecido. Se o valor for nulo, lançará uma exceção NullPointerException.
        Optional<String> optionalValue = Optional.of("Hello");
        System.out.println(optionalValue.get()); // Imprime o valor contido no Optional
        
        // Método: ofNullable(value)
        // Descrição: Cria um Optional contendo o valor fornecido, mas permite que o valor seja nulo.
        String nullableValue = null;
        Optional<String> optionalValueNullable = Optional.ofNullable(nullableValue);
        System.out.println(optionalValueNullable.isPresent()); // Verifica se o Optional contém um valor
        
        // Método: empty()
        // Descrição: Retorna um Optional vazio (sem valor).
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty.isPresent()); // Verifica se o Optional está presente
        
        // Método: isPresent()
        // Descrição: Verifica se o Optional contém um valor não nulo.
        Optional<String> optionalPresent = Optional.of("Hello");
        System.out.println(optionalPresent.isPresent()); // Verifica se o valor está presente no Optional
        
        // Método: isEmpty() (A partir do Java 11)
        // Descrição: Verifica se o Optional está vazio (não contém um valor não nulo).
        Optional<String> optionalEmptyCheck = Optional.ofNullable(null);
        System.out.println(optionalEmptyCheck.isEmpty()); // Verifica se o Optional está vazio
        
        // Método: get()
        // Descrição: Obtém o valor contido no Optional. Se o valor for nulo, lançará uma exceção NoSuchElementException.
        Optional<String> optionalGetValue = Optional.of("Hello");
        System.out.println(optionalGetValue.get()); // Obtém o valor do Optional
        
        // Método: orElse(defaultValue)
        // Descrição: Obtém o valor contido no Optional, ou retorna um valor padrão se o Optional estiver vazio
        Optional<String> optionalOrElse = Optional.ofNullable(null);
        String resultOrElse = optionalOrElse.orElse("Default"); 
        System.out.println(resultOrElse); // Obtém o valor do Optional ou um valor padrão
        
        // Método: orElseGet(supplier)
        // Descrição: Obtém o valor contido no Optional, ou retorna um valor fornecido por um Supplier se o Optional estiver vazio.
        Optional<String> optionalOrElseGet = Optional.ofNullable(null);
        String resultOrElseGet = optionalOrElseGet.orElseGet(() -> "Value from Supplier");
        System.out.println(resultOrElseGet); // Obtém o valor do Optional ou um valor do Supplier
        
        // Método: orElseThrow(exceptionSupplier)
        // Descrição: Obtém o valor contido no Optional, ou lança uma exceção fornecida por um Supplier se o Optional estiver vazio.
        Optional<String> optionalOrElseThrow = Optional.ofNullable(null);
        String resultOrElseThrow = optionalOrElseThrow.orElseThrow(() -> new RuntimeException("Value not present"));
        
        // Método: ifPresent(consumer)
        // Descrição: Executa uma ação fornecida por um Consumer se o Optional contiver um valor.
        Optional<String> optionalIfPresent = Optional.of("Hello");
        optionalIfPresent.ifPresent(value -> System.out.println("Valor presente: " + value));
    }
}
