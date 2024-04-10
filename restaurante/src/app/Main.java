package app;

import javax.swing.JOptionPane;

import Controller.UsuarioController;
import model.Restaurante;
import model.Usuario;
import View.CadastroUsuario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurante restaurante = new Restaurante();
		 UsuarioController usuarioController = new UsuarioController();
	
	   while (true) {
           Object[] options = {"Login", "Cadastrar","Sair"};
           int escolha = JOptionPane.showOptionDialog(null, "Bem-vindo ao Restaurante! Escolha uma opção:",
                   null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                   null, options, options[0]);
           switch (escolha) {
           case 0: // Login
        	   String Email = JOptionPane.showInputDialog(null,"Digte seu Email:");
        	   String Senha = JOptionPane.showInputDialog(null,"Digite sua senha:");
        	  
        	   boolean login = UsuarioController.login(Email,Senha);
        	   boolean usuarioLogado = false;
			if (usuarioLogado) {
        		   JOptionPane.showMessageDialog(null, "login Efetuado com sucesso");
        		   
        	   }else {
        		   JOptionPane.showMessageDialog(null,"Email ou senha incorretos");
        		   break;
        	   }
        		
                 break;
           case 1: // Cadastrar
          	 CadastroUsuario cadastroUsuario = new CadastroUsuario(usuarioController);
               cadastroUsuario.exibir();
               break;
      
               
           case 2:
           default:
               System.exit(0);
       

}
	   }
	}
}
