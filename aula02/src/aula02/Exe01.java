package aula02;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int nA,nB,nC,RESULT;
		
		System.out.println("Digite o valor de A: ");
		nA = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		nB = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		nC = leia.nextInt();
		
		RESULT = (nA + nB);
		if (RESULT == nC)
			System.out.println("A soma de A + B é Igual a C. ");
		else if(RESULT > nC)
			System.out.println("A soma de A + B é Maior do que C. ");
		else if(RESULT < nC)
			System.out.println("A soma de A + B é Menor do que C. ");

	}

}
