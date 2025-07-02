/*
7. Faça um programa que receba 6 numeros inteiros e mostre: 
• Os numeros pares digitados; 
• A soma dos numeros pares digitados; 
• Os numeros ımpares digitados; 
• A quantidade de numeros ımpares digitados;
*/



public class Exercicio7 {
    public static void main(String[] args) {
        int[] numeros = new int[6];
        int somaPares = 0, qtdImpares = 0;

      for (int i = 0; i < 6 ; i++) {
         numeros[i] = (int)(Math.random() * 101);
         
        }

        System.out.println("Numeros pares:");
        for (int n : numeros) {
            if (n % 2 == 0) {
                System.out.println(n);
                somaPares += n;
            }
        }

        System.out.println("Soma dos pares: " + somaPares);

        System.out.println("Numeros impares:");
        for (int n : numeros) {
            if (n % 2 != 0) {
                System.out.println(n);
                qtdImpares++;
            }
        }

        System.out.println("Quantidade de impares: " + qtdImpares);
    }
}
