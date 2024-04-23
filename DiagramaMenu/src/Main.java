import Models.GerenciadorUsuario;
import Models.Usuario;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GerenciadorUsuario gerenciadorUsuario = new GerenciadorUsuario();
        Scanner read = new Scanner(System.in);
        boolean escolha = false;

        while (escolha== false) {
            System.out.println("\nMenu de Usuários:"     );
            System.out.println("1. Adicionar Usuário"    );
            System.out.println("2. Listar Usuários      ");
            System.out.println("3. Buscar Usuário por ID");
            System.out.println("4. Atualizar Usuário"    );
            System.out.println("5. Remover Usuário"      );
            System.out.println("0. Sair"                 );
            System.out.print  ("Digite sua opção: "      );

                int Menu = read.nextInt();
           

            switch (Menu) {
                case 1:
                    System.out.println("Infomre Usuario");

                    break;
                case 2:
                     //*or
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 0:
                    escolha = true;
                    break;
                default:
                    System.out.println("Opção inválida ");


            }


        }
        read.close();
    }
}

