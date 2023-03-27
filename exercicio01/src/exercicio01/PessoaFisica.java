package exercicio01;

public class PessoaFisica extends Cliente {
	
	private String tipoLegal;

	public PessoaFisica(String nome, int numero, String endereço, String email, String documento, String tipoLegal) {
		super(nome, numero, endereço, email, documento);
		this.tipoLegal = tipoLegal;
	}

	public String getTipoLegal() {
		return tipoLegal;
	}

	public void setTipoLegal(String tipoLegal) {
		this.tipoLegal = tipoLegal;
	}
	
	public void visualizar() {
	super.visualizar();
	System.out.println("Atua como: " + this.tipoLegal);
}
}
