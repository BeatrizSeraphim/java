import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade,sexo, genero = 0, esporte, contador = 0, futebolFeminino=0, maiores18Voleibol = 0, gamesTNBF = 0;
		char continua = 'S';
		
		while(continua == 'S') {
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		do {
			
			System.out.println("Digite o sexo (1-M/2-F/3-T/4-NB): ");
			sexo = leia.nextInt();
			
		}while(sexo < 1  || sexo >4);
		
		if(sexo == 3 || sexo == 4 ) {
			System.out.println("Digite o Gênero com o qual se identifica (1-M/2-F): ");
			genero = leia.nextInt();
		}
			
		System.out.println("Digite a seu Esporte favorito (1-Futebol/2-Voleibol/3-Basquete/4-Games): ");
		esporte = leia.nextInt();
		
		contador ++;
		
		if(sexo == 2 && esporte == 1)
			futebolFeminino ++;
		
		if(idade >= 18 && esporte == 2)
			maiores18Voleibol ++;
		
		if((sexo == 3 || sexo == 4) && genero == 2 && esporte == 4)
			gamesTNBF ++;
		
		genero = 0;
		
		System.out.println("Deseja continuar (S/N)? ");
		continua = leia.next().toUpperCase().charAt(0);
		}
		
		System.out.println("Total de fichas preenchidas: " + contador);
		System.out.println("Total de pessoas do sexo feminino que gostam de Futebol: " + futebolFeminino);
		System.out.println("Total de pessoas +18 que gostam de voleibol:: " + maiores18Voleibol);
		System.out.println("Total de pessoas Trans e Não Binárias que se identificam com o gênero feminino e gostam de Games: " + gamesTNBF);
	}

}
