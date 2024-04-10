package View;

import javax.swing.JOptionPane;

import Controller.UsuarioController;
import model.Usuario;

public class login {
	private UsuarioController usuarioController;

    public void Login(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
    }

    public Usuario exibir() {
        String email = JOptionPane.showInputDialog(null, "Email:", "Login", JOptionPane.QUESTION_MESSAGE);
        String senha = JOptionPane.showInputDialog(null, "Senha:", "Login", JOptionPane.QUESTION_MESSAGE);

        Usuario usuarioLogado = usuarioController.autenticarUsuario(email, senha);
        if (usuarioLogado != null) {
            JOptionPane.showMessageDialog(null, "Login bem-sucedido!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return usuarioLogado;
        } else {
            JOptionPane.showMessageDialog(null, "email ou senha inválidos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }


}
