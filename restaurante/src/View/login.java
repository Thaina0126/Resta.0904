package View;

import javax.swing.JOptionPane;

import Controller.UsuarioController;
import model.Usuario;

public class login {
	private UsuarioController usuarioController;

    public void LoginView(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
    }

    public Usuario exibir() {
        String cpf = JOptionPane.showInputDialog(null, "CPF:", "Login", JOptionPane.QUESTION_MESSAGE);
        String senha = JOptionPane.showInputDialog(null, "Senha:", "Login", JOptionPane.QUESTION_MESSAGE);

        Usuario usuarioLogado = usuarioController.autenticarUsuario(cpf, senha);
        if (usuarioLogado != null) {
            JOptionPane.showMessageDialog(null, "Login bem-sucedido!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return usuarioLogado;
        } else {
            JOptionPane.showMessageDialog(null, "CPF ou senha inválidos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }


}
