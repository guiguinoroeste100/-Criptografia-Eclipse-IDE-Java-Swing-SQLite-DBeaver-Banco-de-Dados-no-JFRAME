package model;

public class Cliente {
	protected String id;
	protected String nome;
	protected String cpfCpnj;
	protected String email;
	protected String telefone;
	protected String endereço;
	
	public Cliente() {
		
	}
	
	public Cliente(String id, String nome, String cpfCpnj, String email, String telefone, String endereço) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpfCpnj = cpfCpnj;
		this.email = email;
		this.telefone = telefone;
		this.telefone = endereço;
	}

	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpfCpnj() {
		return cpfCpnj;
	}


	public void setCpfCpnj(String cpfCpnj) {
		this.cpfCpnj = cpfCpnj;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEndereço() {
		return endereço;
	}

	
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
}

	
