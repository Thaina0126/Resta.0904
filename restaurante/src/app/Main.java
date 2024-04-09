package app;

import javax.swing.JOptionPane;

import Controller.UsuarioController;
import model.Restaurante;
import model.Usuario;
import View.CadastroUsuario;
import View.login;

import javax.swing.*;

public class Main {

	private static final String UsuarioController = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurante restaurante = new Restaurante();
		 UsuarioController usuarioController = new UsuarioController();
	
	   while (true) {
           Object[] options = {"Login", "Cadastrar"};
           int escolha = JOptionPane.showOptionDialog(null, "Bem-vindo ao Restaurante! Escolha uma opção:",
                   null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                   null, options, options[0]);
           
           switch (escolha) {
           case 0: // Login
           	 
                 break;
           case 1: // Cadastrar
          	 CadastroUsuario cadastroUsuarioView = new CadastroUsuario(usuarioController);
               cadastroUsuarioView.exibir();
               break;
           default:
               System.exit(0);
       

}
	   }
	}
}
