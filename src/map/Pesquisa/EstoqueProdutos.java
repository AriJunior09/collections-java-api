package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, Double preco, int quantidade) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade);
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
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco() > maiorPreco){
                    p = produtoMaisCaro;
                }
            }
        }
        return produtoMaisCaro;
    }
}
