package View;


import javax.swing.JOptionPane;

import Controller.UsuarioController;

public class CadastroUsuario {
	 private UsuarioController UsuarioController;

	    public CadastroUsuario(UsuarioController usuarioController) {
	        this.setUsuarioController(usuarioController);
	    }

	    public void exibir() {
	        String nome = JOptionPane.showInputDialog(null, "Nome Completo:", "Cadastro de Usuário", JOptionPane.QUESTION_MESSAGE);
	        String cpf = JOptionPane.showInputDialog(null, "CPF:", "Cadastro de Usuário", JOptionPane.QUESTION_MESSAGE);
	        String senha = JOptionPane.showInputDialog(null, "Crie uma Senha:", "Cadastro de Usuário", JOptionPane.QUESTION_MESSAGE);
            String email = JOptionPane.showInputDialog(null, "E-mail:", "Cadastro de Usuário" , JOptionPane.QUESTION_MESSAGE);
            String endereco = JOptionPane.showInputDialog(null, "Digite seu endereço: ", "Cadastro de Usuário" , JOptionPane.QUESTION_MESSAGE);
	        String celular  = JOptionPane.showInputDialog(null, "Digite seu celular: ", "Cadastro de Usuário" , JOptionPane.QUESTION_MESSAGE);
	        String categoria = JOptionPane.showInputDialog(null,"categoria","Cadastro de Usuário",JOptionPane.QUESTION_MESSAGE);
	        
	        JOptionPane.showMessageDialog(null, UsuarioController.CriarUsuario(nome, cpf, email, celular, senha, endereco,categoria));
	       
	    }

		public UsuarioController getUsuarioController() {
			return UsuarioController;
		}

		public void setUsuarioController(UsuarioController usuarioController) {
			UsuarioController = usuarioController;
		}
	}

