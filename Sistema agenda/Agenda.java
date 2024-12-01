import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }


    public void adicionarContato(Contato contato) {  // Recebe um objeto Contato
        contatos.add(contato);  // Adiciona o contato à lista
        System.out.println("Contato adicionado com sucesso!");
    }

    public void RemoverContato(String nome) {
        boolean encontrado = false;
        for (Contato contato02 : contatos) {
            if (contato02.getNome().equalsIgnoreCase(nome)) {
                contatos.remove(contato02);
                System.out.println("Contato removido com sucesso!");
                encontrado = true;
                break;
            }
        }
    }

    public void ListarContato() {
        if (contatos.isEmpty()) {
            System.out.println("Contato não encontrado");
        } else {
            for (Contato contato : contatos) {
                contato.ExibirContato();
                System.out.println("-----------------------------");
            }
        }
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null; // Se não encontrar o contato
    }
}