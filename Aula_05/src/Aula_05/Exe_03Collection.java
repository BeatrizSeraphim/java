package Aula_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exe_03Collection {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Set<Integer> setInteiros = new HashSet<Integer>();
		
		System.out.println("Não digite números repetidos!\n");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número inteiro: ");
			setInteiros.add(entrada.nextInt());
		}
		
		Iterator<Integer> isetInteiros = setInteiros.iterator();
		
		while(isetInteiros.hasNext()) {
			System.out.println("Listar dados do Set: " + isetInteiros.next());
		}
		
		entrada.close();

	}

}
