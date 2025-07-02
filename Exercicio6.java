/*
6. Faça um programa que receba do usuário dois vetores, A e B, com 10 números 
inteiros cada. Crie um novo vetor denominado C calculando C = A - B. Mostre na 
tela os dados do vetor C.
*/
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        for (int i = 0; i < 10; i++) {
            A[i] = (int)(Math.random() * 101); 
            B[i] = (int)(Math.random() * 101);
        }

      
        for (int i = 0; i < 10; i++) {
            C[i] = A[i] - B[i];
        }

    
        System.out.println("Vetor C (A - B):");
        for (int i = 0; i < 10; i++) {
        System.out.println(A[i] + "\t|\t" + B[i]+"\t|\t" + C[i] );
        }
    }
}


  