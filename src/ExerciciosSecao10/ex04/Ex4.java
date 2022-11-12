/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na 
tela todos os números pares, e também a quantidade de números pares. 
 */
package ExerciciosSecao10.ex04;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int quantity, quantity_pares = 0;
        
        System.out.print("Quantos numeros voce quer digitar? ");
        quantity = sc.nextInt();
        
        int inteiros[] = new int[quantity];
        
        for(int i=0; i < inteiros.length; i++){
            System.out.print("Digite um numero: ");
            inteiros[i] = sc.nextInt();
        }
        System.out.println(" ");
        
        System.out.println("NUMEROS PARES:");
        
        for(int i=0; i < inteiros.length; i++){
            boolean eh_par = inteiros[i] % 2 == 0;
            if (eh_par){
                System.out.print(inteiros[i] + " ");
                quantity_pares++;
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.print("Quantidade pares = ");
        System.out.println(quantity_pares);
        
        sc.close();
    }
}
