package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        return new TreeSet<>(produtoSet);
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPorPrecos = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtosPorPrecos.addAll(produtoSet);
        return produtosPorPrecos;
    }

    public Set<Produto> exibirPorQuantidade() {
        Set<Produto> produtosPorQuantidade = new TreeSet<>(new Produto.ComparatorPorQuantidade());
        produtosPorQuantidade.addAll(produtoSet);
        return produtosPorQuantidade;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto(10, "Banana", 2.19, 8);
        cadastroProduto.adicionarProduto(11, "Abacaxi", 7.90, 1);
        cadastroProduto.adicionarProduto(12, "Arroz", 3.59, 3);
        cadastroProduto.adicionarProduto(13, "Manga", 2.29, 4);
        cadastroProduto.adicionarProduto(14, "Feijão", 8.49, 4);
        cadastroProduto.adicionarProduto(15, "Limão", 4.29, 5);
        cadastroProduto.adicionarProduto(16, "Maracuja", 5.90, 3);
        cadastroProduto.adicionarProduto(17, "Perfume", 9.99, 1);
        cadastroProduto.adicionarProduto(18, "Sabonete", 1.29, 2);

        System.out.println("Produtos cadastrados:");
        System.out.println(cadastroProduto.produtoSet);

        System.out.println("Ordenando por Nome:");
        System.out.println(cadastroProduto.exibirProdutosPorNome());

        System.out.println("Ordenando por Preço:");
        System.out.println(cadastroProduto.exibirPorPreco());

        System.out.println("Ordenando por Quantidade:");
        System.out.println(cadastroProduto.exibirPorQuantidade());
    }
}
