package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        return "Código=" + codigo +
                ", Nome='" + nome + '\'' +
                ", Preco=" + preco +
                ", Quantidade=" + quantidade +
                '\n';
    }

    static class ComparatorPorPreco implements Comparator<Produto>{

        @Override
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    }

    static class ComparatorPorQuantidade implements Comparator<Produto> {
        @Override
        public int compare(Produto p1, Produto p2) {
            int quantidadeCompare = Integer.compare(p1.getQuantidade(), p2.getQuantidade());
            if (quantidadeCompare != 0) {
                return quantidadeCompare;
            } else {
                int nomeCompare = p1.getNome().compareToIgnoreCase(p2.getNome());
                if (nomeCompare != 0) {
                    return nomeCompare;
                } else {
                    int precoCompare = Double.compare(p1.getPreco(), p2.getPreco());
                    if (precoCompare != 0) {
                        return precoCompare;
                    } else {
                        return Long.compare(p1.getCodigo(), p2.getCodigo());
                    }
                }
            }
        }
    }


}
