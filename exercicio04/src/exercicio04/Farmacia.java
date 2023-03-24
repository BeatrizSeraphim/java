package exercicio04;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Farmacia {
	
	private String nome;
	private String fabricante;
	private float preço;
	private LocalDate dataValidade;
	private String quantidade;
	
	public Farmacia(String nome, String fabricante, float preço, LocalDate dataValidade, String quantidade) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.preço = preço;
		this.dataValidade = dataValidade;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public float getPreço() {
		return preço;
	}

	public void setPreço(float preço) {
		this.preço = preço;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
	public void visualizar() {
		
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		
		System.out.println("\n**********************************");
		System.out.println("Dados do Produto");
		System.out.println("\n**********************************");
		System.out.println("\nNome do remédio: " + this.nome);
		System.out.println("\nFabricante: " + this.fabricante);
		System.out.println("\nQuantidade: " + this.quantidade);
		System.out.println("\nData de Validade: " + this.dataValidade.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("\nPreço: " + nfMoeda.format(this.preço));
		
		
	}
	

}
