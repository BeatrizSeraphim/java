package exercicio04;

import java.time.LocalDate;

public class Medicamento extends Farmacia {
	
	private String recomendacao;

	public Medicamento(String nome, String fabricante, float preço, LocalDate dataValidade, String quantidade,
			String recomendacao) {
		super(nome, fabricante, preço, dataValidade, quantidade);
		this.recomendacao = recomendacao;
	}

	public String getRecomendacao() {
		return recomendacao;
	}

	public void setRecomendacao(String recomendacao) {
		this.recomendacao = recomendacao;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Recomendação: " + this.recomendacao);
	}

}
