package exercicio01;

public class Cliente {
	
	
	private String nome;
	private int numero;
	private String endereço;
	private String email;
	private String documento;
	
	public Cliente(String nome, int numero, String endereço, String email, String documento) {
		this.nome = nome;
		this.numero = numero;
		this.endereço = endereço;
		this.email = email;
		this.documento = documento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	public void visualizar() {
		
		System.out.println("\n***********************************");
		System.out.println("Dados do Cliente");
		System.out.println("\n***********************************");
		System.out.println("\nNome: " + this.nome);
		System.out.println("\nNumero: " + this.numero);
		System.out.println("\nEndereço: " + this.endereço);
		System.out.println("\nEmail: " + this.email);
		System.out.println("\nDocumento: " + this.documento);
		
		
	}
	
	
}
