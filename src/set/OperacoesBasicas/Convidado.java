package set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o) { // equals and hashcode para não deixar ser criado
        if (this == o) return true;   // dois convidados com o mesmo codigo de convite
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvite);
    }

    @Override
    public String toString() {
        return "Convidado>" +
                "nome:'" + nome +
                ", codigoConvite: " + codigoConvite +
                '\n';
    }
}
