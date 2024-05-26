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

        agendaContatos.adicionarContato("Camila", 889990949);
        agendaContatos.adicionarContato("Bruno", 12345);
        agendaContatos.adicionarContato("Ari", 10000);
        agendaContatos.adicionarContato("Ari Junior", 900);
        agendaContatos.adicionarContato("Rute", 554421);

        agendaContatos.exibirContato();

//        agendaContatos.removerContato("Ari Junior");
        System.out.print("Faça a Pesquisa: ");
        String nomePesquisa = sc.next();

        System.out.printf("O Telefone do %s é %d", nomePesquisa, agendaContatos.pesquisarPorNome(nomePesquisa) );
//        agendaContatos.exibirContato();




    }
}
