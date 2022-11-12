/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela 
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, 
considerando a primeira posição como 0 (zero). 
 */
package ExerciciosSecao10.ex05;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int maior = Integer.MIN_VALUE;
    int indiceMaior = -1;
    
    System.out.print("Qauntos numeros voce quer digitar? ");
    int quantidade = sc.nextInt();
    
    int inteiros[] = new int[quantidade];
    
    for(int i = 0; i < inteiros.length; i++){
        System.out.print("Digite um numero: ");
        inteiros[i] = sc.nextInt();
        if (inteiros[i] > maior) {
            maior = inteiros[i];
            indiceMaior = i;
        }
    }
    
    System.out.printf("MAIOR VALOR: %d%n", maior);
    System.out.printf("POSICAO DO MAIOR VALOR = %d%n", indiceMaior);
    
    sc.close();   
    }
}
