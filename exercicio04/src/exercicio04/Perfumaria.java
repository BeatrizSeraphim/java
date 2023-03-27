package exercicio04;

import java.time.LocalDate;

public class Perfumaria extends Farmacia {
	
	private String cosmetico;

	public Perfumaria(String nome, String fabricante, float preço, LocalDate dataValidade, String quantidade,
			String cosmetico) {
		super(nome, fabricante, preço, dataValidade, quantidade);
		this.cosmetico = cosmetico;
	}

	public String getCosmetico() {
		return cosmetico;
	}

	public void setCosmetico(String cosmetico) {
		this.cosmetico = cosmetico;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo: " + this.cosmetico);
	}
}
