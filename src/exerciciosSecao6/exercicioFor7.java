/*
Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
exemplo.
*/
package exerciciosSecao6;

import java.util.Scanner;

public class exercicioFor7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int cubo = 0, quadrado = 0;
        for (int i = 1; numero >= i; i++){
            quadrado = (int) Math.pow(i, 2);
            cubo = (int) Math.pow(i, 3);
            
            System.out.printf("%d, %d, %d%n", i, quadrado, cubo);
        }
        sc.close();
    }
}
