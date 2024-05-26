package map.Pesquisa;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, Double preco, int quantidade){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade);
    }

    public void exibirProduto(){
        System.out.println(estoqueProdutosMap);
    }
}
