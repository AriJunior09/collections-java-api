package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        Scanner sc = new Scanner(System.in);

        agendaContatos.adicionarContato("CAMILA", 889990949);
        agendaContatos.adicionarContato("BRUNO", 12345);
        agendaContatos.adicionarContato("ARI", 10000);
        agendaContatos.adicionarContato("ARI JUNIOR", 900);
        agendaContatos.adicionarContato("RUTE", 554421);

        agendaContatos.exibirContato();

        System.out.print("Faça a Pesquisa: ");
        String nomePesquisa = sc.nextLine().toUpperCase();
        Integer telefone = agendaContatos.pesquisarPorNome(nomePesquisa);

        if (telefone != null) {
            System.out.printf("O Telefone do %s é %d%n", nomePesquisa, telefone);
        } else {
            System.out.println("Contato não encontrado!");
        }

        sc.close();


    }
}
