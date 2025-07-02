/*
2. Crie um programa que leia um vetor de 10 posições. Contar e escrever quantos 
valores pares e quantos valores ímpares ele possui.
*/


public class Exercicio2 {
    public static void main(String[] args) {
        int[] vetores  = new int[10];
        int contPares = 0 ;
        int contImpares = 0;

     
        for (int i = 0; i < 10; i++) {
         vetores[ i] = (int)(Math.random() * 101);

        }

        for (int i = 0; i < 10 ; i++) {
            if (vetores[i] % 2 == 0)contPares++;
            else  contImpares++;
        }

        System.out.println("Quantidade de pares: " +  contPares);
        System.out.println("Quantidade de impares: " +  contImpares);
        for (int i = 0; i < 10 ; i++) {
             System.out.println(vetores[i]);
    }
}
}