/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um 
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima 
o vetor C gerado. 
 */
package ExerciciosSecao10.ex06;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos valores vai ter em cada vetor? ");
        int quantidade = sc.nextInt();
        
        int A[] = new int[quantidade];
        int B[] = new int[quantidade];
        int soma[] = new int[quantidade];
        
        System.out.println("Digite os valores do Vetor A: ");
        
        for(int i = 0; i < quantidade; i++){
            A[i] = sc.nextInt();
        }
        
        System.out.println("Digite os valores do Vetor B: ");
        
        for(int i = 0; i < quantidade; i++){
            B[i] = sc.nextInt();
        }
        
        System.out.println("VETOR RESULTANTE:");
        
        for(int i = 0; i < soma.length; i++){
            soma[i] = A[i] + B[i];
            System.out.println(soma[i]);
        }
        
        sc.close();
    }
}
