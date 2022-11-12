/*
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
*/

package ExerciciosSecao10.ex01;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int qtd = sc.nextInt();
        while (qtd > 10){
            System.out.println("Quantidade não pode ser maior que 10");
            System.out.print("Quantos numeros voce vai digitar? ");
            qtd = sc.nextInt();
        }
        int numbers[] = new int[qtd];
        
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();
                    
        }
        
        
        System.out.println("NUMEROS NEGATIVOS:");
        for (int i =0; i<numbers.length; i++){
            if (numbers[i] < 0){
                System.out.println(numbers[i]);
            }
        }
        
        sc.close();
    }
    
}
