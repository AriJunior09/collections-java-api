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
//        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 10);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 20);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 30);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 40);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados dentro do Set de Convidados");
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(20);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados dentro do Set de Convidados");
        conjuntoConvidados.exibirConvidados();


    }

}
