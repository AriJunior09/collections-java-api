package list.OpercoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : listaItens){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        listaItens.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double totalDoCarrinho = 0.0;
        for(Item i : listaItens){
            double totalDoItem = i.getPreco() * i.getQuantidade();
            totalDoCarrinho += totalDoItem;

        }
        return totalDoCarrinho;
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Caju", 3.99, 10);
        carrinhoDeCompras.adicionarItem("Manga", 2.39, 8);
        carrinhoDeCompras.adicionarItem("Melancia", 4.69, 1);

        carrinhoDeCompras.exibirItens();
        System.out.printf("\n O Valor total do Carrinho é: R$ %.2f%n", carrinhoDeCompras.calcularValorTotal());

    }
}
