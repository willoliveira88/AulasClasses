package Models;
     import java.util.ArrayList;
     import java.util.List;
public class GerenciadorUsuario {

    private List<Usuario> usuarios;

    public GerenciadorUsuario() {
        this.usuarios = new ArrayList<>();
    }

    // Método para adicionar um novo usuário à lista
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // Método para obter todos os usuários da lista
    public List<Usuario> obterTodosUsuarios() {
        return usuarios;
    }

    // Método para obter um usuário pelo seu ID
    public Usuario obterUsuarioPorId(String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null; // Retorna null se o usuário não for encontrado
    }

    // Método para atualizar os dados de um usuário pelo seu ID
    public void atualizarUsuario(String id, String novoNome, String novoEmail) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                usuario.setNome(novoNome);
                usuario.setEmail(novoEmail);
                return; // Retorna após atualizar o usuário
            }
        }

    }
    public void removerUsuario(String id) {
        usuarios.removeIf(usuario -> usuario.getId().equals(id));
    }
}