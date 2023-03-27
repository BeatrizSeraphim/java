package exercicio04;

import java.time.LocalDate;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		LocalDate data = LocalDate.of(2024,9,20);
		LocalDate data2 = LocalDate.of(2013,3,17);
		
		Farmacia g1 = new Farmacia ("Dipirona", "CIMED", 08.f, data, "10 comprimidos");
		g1.visualizar();
		
		Farmacia g2 = new Farmacia ("Paracetamol", "CIMED", 010.f, data2, "15 comprimidos");
		g2.visualizar();
		
		Medicamento m1 = new Medicamento ("Dipirona", "CIMED", 08.f, data, "10 comprimidos", "Dores leves no geral");
		m1.visualizar();

		Perfumaria p1 = new Perfumaria ("Kaiak", "AVON", 55.f, data2, "80 ML", "Perfume");
		p1.visualizar();

	}

}
