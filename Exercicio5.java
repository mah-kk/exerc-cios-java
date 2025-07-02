/*
5. Faça um programa para ler a nota da prova de 15 alunos e armazene num vetor, 
calcule e imprima a média geral.
*/

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[15];
        double soma = 0;

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / 15;
        System.out.println("Media geral: " + media);
    }
}
