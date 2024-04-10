package model;

import Controller.UsuarioController;

public class Usuario {

	private String Nome, Celular, Email, Senha, CPF,Endereco,categoria;
	
	private boolean EstaLogado = false;			
	
	
public Usuario (String Nome, String Celular,
	String Email, String Senha, String CPF,String Endereco,String categoria) {
		this.Nome = Nome;
		this.Celular = Celular;
		this.Email = Email;
		this.Senha = Senha;
		this.CPF = CPF;
		this.Endereco = Endereco;
		this.categoria = categoria;
	}
	
	public Usuario(UsuarioController usuarioController) {
	// TODO Auto-generated constructor stub
}

	void Autenticacao(String Email, String Senha) {
		if(this.Email == Email
				&& this.Senha == Senha) {
			EstaLogado = true;
		}
		
	
	}
	public String getNome() {
		return Nome;
	}
	
	
	public String getUsuario() {
		return (
				"\nNome" + this.Nome
				+ "\nCelular" + this.Celular
				+ "\nEmail" + this.Email
				+ "\nSenha" + this.Senha
				+ "\nCPF" + this.CPF
				+ "\nEndereço" +this.Endereco
				+ "\nEstaLogado" + this.EstaLogado
				+ "\ncategoria" + this.categoria
				);
	}

	public Object getSenha() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void exibir() {
		// TODO Auto-generated method stub
		
	}

	
}

