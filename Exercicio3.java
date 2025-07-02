/*
3. Faça um programa que receba do usuário um vetor com 10 posições. Em seguida 
deverá ser impresso o maior e o menor elemento do vetor.
*/

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um valor: ");
            vetor[i] = scanner.nextInt();
        }

        int maior = vetor[0];
        int menor = vetor[0];

        for (int valor : vetor) {
            if (valor > maior) maior = valor;
            if (valor < menor) menor = valor;
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
