/*
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média 
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for 
digitado, mostrar a mensagem "NENHUM NUMERO PAR" 
 */
package ExerciciosSecao10.ex08;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos elementos o vetor vai ter? ");
        int quantidade = sc.nextInt();
        int quantidadePares = 0;
        int somaPares = 0;
        double mediaPares;
        
        int numeros[] = new int[quantidade];
            
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }
        
        for(int i = 0; i < quantidade; i++){
            if(numeros[i] % 2 == 0){
                somaPares += numeros[i];
                quantidadePares++;
            }
        }
        
        if(quantidadePares == 0){
            System.out.println("NENHUM NUMERO PAR ");
        }
        else{
            mediaPares = somaPares / quantidadePares;
            System.out.printf("MEDIA DOS PARES = %.1f%n", mediaPares);
            
        }
        
        sc.close();
    }
}
