package list.operacoesBasicas.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // Atributo
    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        for (Livro livro : listaLivros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(livro);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        for (Livro livro : listaLivros) {
            if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                livrosPorIntervaloAnos.add(livro);
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        for (Livro livro : listaLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogo.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogo.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogo.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogo.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogo.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalogo.pesquisarPorTitulo("Livro 1"));
    }
}
