package br.com.generation.javaplataforma0607;

import java.util.Scanner;

public class Exerc�cioVetor2 {

	public static void main(String[] args) {
		
		int[] vet1 = new int[10];
		int pontuacao = 0, soma = 0, totpont = 0, n = 0;
		double media = 0;
		
		int c = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite os 10 valores lan�ados do dado: ");
		
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
				System.out.println("Lan�amento inv�lido!");
				c = 20;
		}
		media = soma / 10;
		}
		System.out.println("O maior n�mero lan�ado foi " + pontuacao);
		System.out.println("O maior lan�amento saiu " + n + "vezes");
		System.out.println("A m�dia aritim�tica dos valores foi " + media);
		
	ler.close();
	}
}
	

