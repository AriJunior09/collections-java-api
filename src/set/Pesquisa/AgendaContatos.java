package set.Pesquisa;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){ // StarWith é um metodo para pegar todos os contatos que
                contatosPorNome.add(c);       // começarem com a palavra pesquisada e adicione a lista de pesquisa

            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Ari", 1000);
        agendaContatos.adicionarContato("Ari", 2000); // Esse contato não será adicionado pois tem o mesmo nome!
        agendaContatos.adicionarContato("Ari Junior", 2000);
        agendaContatos.adicionarContato("Rute Anjos", 3000);
        agendaContatos.adicionarContato("Rute Pinheiro ", 4000);
        agendaContatos.adicionarContato("Cleene ", 3000);

        System.out.println("Lista de contatos: ");
        agendaContatos.exibirContato();

        System.out.println("Pesquisar por nome: \n" + agendaContatos.pesquisarPorNome("Rute"));   //Pesquisando pelo nome

        agendaContatos.atualizarNumeroContato("Rute Anjos", 8000);

        System.out.println("Lista de contatos: ");
        agendaContatos.exibirContato();




    }

}
