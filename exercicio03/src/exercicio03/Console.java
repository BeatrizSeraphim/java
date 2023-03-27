package exercicio03;

import java.time.LocalDate;

public class Console extends Produto {

	private int tipo;

	public Console(int id, String nome, int versao, String produtora, LocalDate dataLancamento, float preço, int tipo) {
		super(id, nome, versao, produtora, dataLancamento, preço);
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo do Console: " + this.tipo);
		
	}
	
}
