package br.com.generation.javaplataforma0607;

import java.util.Scanner;

public class ExercícioVetorMatrizes1 {

	public static void main(String[] args) {
		
		int[] vet1 = new int[5];
		int pontuacao = 0, n;
		
		int c = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite 5 valores");
		
		for(; c <= 4; c++) {
			
			vet1[c] = ler.nextInt();
			
			if (vet1[c] > pontuacao) {
				pontuacao = vet1[c];
			}
		for(; c<=4; c++) {
			System.out.print(vet1[c] + " | ");
			}
		}
		System.out.println("A maior pontuação foi: " + pontuacao);
	}

}
