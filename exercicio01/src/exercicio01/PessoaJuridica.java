package exercicio01;

public class PessoaJuridica extends Cliente {
	
	private String porteEmpresa;
	private String tipolegal;
	public PessoaJuridica(String nome, int numero, String endereço, String email, String documento, String porteEmpresa,
			String tipolegal) {
		super(nome, numero, endereço, email, documento);
		this.porteEmpresa = porteEmpresa;
		this.tipolegal = tipolegal;
	}
	public String getPorteEmpresa() {
		return porteEmpresa;
	}
	public void setPorteEmpresa(String porteEmpresa) {
		this.porteEmpresa = porteEmpresa;
	}
	public String getTipolegal() {
		return tipolegal;
	}
	public void setTipolegal(String tipolegal) {
		this.tipolegal = tipolegal;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Porte empresa: " + this.porteEmpresa);
		System.out.println("Atua como: " + this.tipolegal);
	}

}
