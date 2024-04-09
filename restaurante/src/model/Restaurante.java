package model;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
	    private List<Usuario> usuarios = new ArrayList<>();

	    public void adicionarUsuario(Usuario usuario) {
	        usuarios.add(usuario);
	    }

	    public Usuario buscarUsuario(String CPF, String senha) {
	        for (Usuario usuario : usuarios) {
	            if (usuario.getClass().equals(CPF) && usuario.getSenha().equals(senha)) {
	                return usuario;
	            }
	        }
	        return null;
	    }

	    public List<Usuario> getUsuarios() {
	    	return usuarios;
}
}
