package exercicio03;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Produto {

	private int id;
	private String nome;
	private int versao;
	private String produtora;
	private LocalDate dataLancamento;
	private float preço;
	
	public Produto(int id, String nome, int versao, String produtora, LocalDate dataLancamento, float preço) {
		this.id = id;
		this.nome = nome;
		this.versao = versao;
		this.produtora = produtora;
		this.dataLancamento = dataLancamento;
		this.preço = preço;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVersao() {
		return versao;
	}

	public void setVersao(int versao) {
		this.versao = versao;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public float getPreço() {
		return preço;
	}

	public void setPreço(float preço) {
		this.preço = preço;
	}
	
	public void visualizar() {
		
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		
		System.out.println("\n**********************************");
		System.out.println("Dados do Produto");
		System.out.println("\n**********************************");
		System.out.println("\nId: " + this.id);
		System.out.println("\nNome: " + this.nome);
		System.out.println("\nVersâo: " + this.versao);
		System.out.println("\nData de lançameto: " + this.dataLancamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("\nPreço: " + nfMoeda.format(this.preço));
		System.out.println("\nProdutora: " + this.produtora);
		
	}
	
}
