package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println("Lista de Convidados: \n" + convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
//        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 10);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 20);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 10);  // Esse convidado não será criado pois estamos usando
        conjuntoConvidados.adicionarConvidado("Convidado 4", 40);  // o equals and hashcode para impedir a duplicidade de codigo

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidado(s) dentro do Set de Convidados");
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(40);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidado(s) dentro do Set de Convidados");
        conjuntoConvidados.exibirConvidados();

    }
}
