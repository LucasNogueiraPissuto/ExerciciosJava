/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, 
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos 
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 
 */
package ExerciciosSecao10.ex07;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos elementos o vetor vai ter? ");
        int quantidade = sc.nextInt();
        int cont = 0;
        
        double numeros[] = new double[quantidade];
        
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }
        
        System.out.println(" ");
        
        double media_vetor = Arrays.stream(numeros).sum() / numeros.length;
        
        System.out.printf("MEDIA VETOR = %.3f%n", media_vetor);   
        
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < media_vetor){
                System.out.println(numeros[i]);
                cont = 1;
            }
        }
        
        if(cont < 0){
            System.out.println("Não existem numeros abaixo da media");
        }
        
        sc.close();
    }
}
