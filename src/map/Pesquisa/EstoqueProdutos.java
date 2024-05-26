package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, Double preco, int quantidade) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto() {
        System.out.println(estoqueProdutosMap);
    }

    public Double calcularValorTotalEstoque() {
        double ValorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                ValorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return ValorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.NEGATIVE_INFINITY;
        for (Produto p : estoqueProdutosMap.values()) {
            if (p.getPreco() > maiorPreco) {
                maiorPreco = p.getPreco();
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(100L, "Manga", 3.00, 1);
        estoqueProdutos.adicionarProduto(101L, "Abacaxi", 5.00, 1);
        estoqueProdutos.adicionarProduto(102L, "Melão", 8.00, 1);
        estoqueProdutos.adicionarProduto(103L, "Caju", 90.20, 2);
        estoqueProdutos.adicionarProduto(103L, "Caja", 10.80, 1);

        estoqueProdutos.exibirProduto();
        System.out.printf("O valor total do estoque é: R$ %.2f%n", estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("O Produto mais caro é: " + estoqueProdutos.obterProdutoMaisCaro());


    }


}
