import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        System.out.println("=== SISTEMA DE AGENDA TELEFONICA ===");


        while(true){
            System.out.println("==== Menu da Agenda Telefônica ====");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Remover Contato");
            System.out.println("3. Listar Contatos");
            System.out.println("4. Buscar contato");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do sc

            switch (opcao){
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.next();
                    System.out.print("Digite o numero de telefone agora: ");
                    String telefone = scanner.next();
                    System.out.print("Digite o email agora: ");
                    String email = scanner.next();

                    Contato novoContato = new Contato(nome,telefone,email);
                    agenda.adicionarContato(novoContato);
                    break;
                case 2:
                    System.out.println("Digite nome do contato á ser removido");
                    nome = scanner.next();
                    agenda.RemoverContato(nome);
                    break;
                case 3:
                    agenda.ListarContato();
                    break;
                case 4:
                    System.out.println("Digite o nome do contato para buscar");
                    nome = scanner.nextLine();
                    Contato contatoBuscar = agenda.buscarContato(nome);
                    if (contatoBuscar != null){
                        contatoBuscar.ExibirContato();
                    }else{
                        System.out.println("Contato não encontrado");
                    }
            }
        }
    }
}
