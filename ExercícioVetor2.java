package br.com.generation.javaplataforma0607;

import java.util.Scanner;

public class ExercícioVetor2 {

	public static void main(String[] args) {
		
		int[] vet1 = new int[10];
		int pontuacao = 0, soma = 0, totpont = 0, n = 0;
		double media = 0;
		
		int c = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite os 10 valores lançados do dado: ");
		
		for(; c <= 9; c++) {
			vet1[c] = ler.nextInt();
			soma = soma + vet1[c]; 
			
			if (vet1[c] > pontuacao) {
				pontuacao = vet1[c];
				totpont = pontuacao;
			}
			else if (pontuacao == totpont) {
					n = n++;
			}
			if (vet1[c] <= 0 && vet1[c] > 6) {
				System.out.println("Lançamento inválido!");
				c = 20;
		}
		media = soma / 10;
		}
		System.out.println("O maior número lançado foi " + pontuacao);
		System.out.println("O maior lançamento saiu " + n + "vezes");
		System.out.println("A média aritimética dos valores foi " + media);
		
	ler.close();
	}
}
	

