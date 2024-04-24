package Models;
     import java.util.ArrayList;
     import java.util.List;
public class GerenciadorUsuario {

    private List<Usuario> usuarios;

    public GerenciadorUsuario() {
        this.usuarios = new ArrayList<>();
    }

    // Adicionar um novo usuário à Lista
    public void adicionarUsuario(Usuario usuario) {

        // Verifica se o ID já existe na Lista

        if (obterUsuarioPorId(usuario.getId()) == null) {
            usuarios.add(usuario);
            System.out.println("Usuário adicionado com sucesso!");
        } else {
            System.out.println("Erro: ID de usuário já existe.");
        }
    }

    // Verificar todos os usuários da Lista
    public List<Usuario> obterTodosUsuarios() {
        return usuarios;
    }

    //  Obtendo um usuário pelo seu ID
    public Usuario obterUsuarioPorId(String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null; // Retorna nulo se o usuário não for encontrado
    }

    //  Atualizar os dados de um usuário pelo ID
    public void atualizarUsuario(String id, String novoNome, String novoEmail) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                usuario.setNome(novoNome);
                usuario.setEmail(novoEmail);
                System.out.println("Usuário atualizado com sucesso!");
                return; // Retorna após atualizar o usuário
            }
        }
        System.out.println("Erro: Usuário não encontrado.");
    }

    // Remover um usuário pelo ID
    public void removerUsuario(String id) {
        usuarios.removeIf(usuario -> usuario.getId().equals(id));
        System.out.println("Usuário removido com sucesso!");
    }
}