/*
1. Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os 
valores lidos.
*/

import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetores =  new int[6];

        /*for (int i = 0; i < 6 ; i++) {
            System.out.print("Digite o valor" + (i+1) + ": ");
            valores[i] = scanner.nextInt();
        }
        */


        for (int i = 0; i < 6 ; i++) {
         vetores[ i] = (int)(Math.random() * 101);
         

        }
        System.out.println("valores :");
        for (int i = 0; i < 6; i++) {
            System.out.println( vetores[i]);
        }
    }
}
