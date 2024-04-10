package Controller;

import java.util.ArrayList;


import model.Usuario;

		public class UsuarioController {
        	
		private ArrayList <Usuario> usuarios;
		
		
		public String CriarUsuario(String Nome, String CPF, String Email, String Celular, String Senha, String Endereco, String categoria ) {
    			Usuario usuarioNovo = new Usuario( Nome, CPF, Email, Celular, Senha, Endereco, categoria);
    			usuarios.add(usuarioNovo);
    			return "Funcionou!";
    		}


		public Usuario autenticarUsuario(String cpf, String senha) {
			// TODO Auto-generated method stub
			return null;
		}


		public static boolean login(String email, String senha) {
			// TODO Auto-generated method stub
			return false;
		}
		}
		
