package aula02;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        int idade;
	        String nome;
	        char pergunta;
	        boolean doacao = false;

	        System.out.println("Digite o Nome do Doador: ");
	        nome = leia.nextLine();

	        System.out.println("Digite a Idade do Doador: ");
	        idade = leia.nextInt();

	        System.out.println("Primeira doação de Sangue? (S/N): ");
	        leia.skip("\\R?");
	        pergunta = leia.nextLine().charAt(0);

	        if (pergunta == 's')
	            doacao = true;

	        if (idade >= 60 && idade <= 69) {
	            if (doacao)
	                System.out.println(nome + " você não está apto(a) para doar sangue!");

	            else
	                System.out.println(nome + " você está apto(a) para doar sangue!");
	        } else if (idade < 18 || idade > 69)
	            System.out.println(" você não está apto(a) para doar sangue!");

	        else if (idade >= 18 && idade <= 59)
	            System.out.println(nome + " você está apto(a) para doar sangue!");

	    }
	}
