package exercicio01;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente g1 = new Cliente ("Vinicius Marques", 952456789, "Rua Joao Gomes, 123", "vinimp@gmail.com","0897645672");
		
		g1.visualizar();
		
		Cliente g2 = new Cliente ("Rihanna de Oliveira", 954675989, "Rua Erva das Virgens, 742", "ririfenty@gmail.com","758108447");
		
		g2.visualizar();
		
		PessoaFisica pf1 = new PessoaFisica ("Vinicius Marques", 952456789, "Rua Joao Gomes, 123", "vinimp@gmail.com","0897645672", "Pessoa Fisica");
		pf1.visualizar();
		
		PessoaJuridica pj1 = new PessoaJuridica ("Rihanna de Oliveira", 954675989, "Rua Erva das Virgens, 742", "ririfenty@gmail.com","758108447", "LTDA", "Pessoa Juridica");
		pj1.visualizar();
		

	}

}
