import Models.GerenciadorUsuario;
import Models.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorUsuario gerenciadorUsuario = new GerenciadorUsuario();

        boolean executando = true;

        while (executando) {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1. Adicionar usuário");
            System.out.println("2. Obter todos os usuários");
            System.out.println("3. Obter usuário por ID");
            System.out.println("4. Atualizar usuário");
            System.out.println("5. Remover usuário");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o ID do usuário:");
                    String id = scanner.nextLine();
                    // Verifica se o ID já existe
                    if (gerenciadorUsuario.obterUsuarioPorId(id) != null) {
                        System.out.println("Erro: ID de usuário já existe.");
                        break; // Encerra o caso 1 sem adicionar ID que ja exista
                    }
                    System.out.println("Digite o nome do usuário:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o email do usuário:");
                    String email = scanner.nextLine();
                    gerenciadorUsuario.adicionarUsuario(new Usuario(id, nome, email));
                    break;
                case 2:
                    System.out.println("Lista de todos os usuários:");
                    for (Usuario usuario : gerenciadorUsuario.obterTodosUsuarios()) {
                        System.out.println("ID: " + usuario.getId() + ", Nome: " + usuario.getNome() + ", Email: " + usuario.getEmail());
                    }
                    break;
                case 3:
                    System.out.println("Digite o ID do usuário:");
                    String idBusca = scanner.nextLine();
                    Usuario usuario = gerenciadorUsuario.obterUsuarioPorId(idBusca);
                    if (usuario != null) {
                        System.out.println("Usuário encontrado:");
                        System.out.println("ID: " + usuario.getId() + ", Nome: " + usuario.getNome() + ", Email: " + usuario.getEmail());
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Digite o ID do usuário que deseja atualizar:");
                    String idAtualizacao = scanner.nextLine();
                    System.out.println("Digite o novo nome do usuário:");
                    String novoNome = scanner.nextLine();
                    System.out.println("Digite o novo email do usuário:");
                    String novoEmail = scanner.nextLine();
                    gerenciadorUsuario.atualizarUsuario(idAtualizacao, novoNome, novoEmail);
                    System.out.println("Usuário atualizado com sucesso!");
                    break;
                case 5:
                    System.out.println("Digite o ID do usuário que deseja remover:");
                    String idRemocao = scanner.nextLine();
                    gerenciadorUsuario.removerUsuario(idRemocao);
                    System.out.println("Usuário removido com sucesso!");
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        scanner.close();
    }
}



