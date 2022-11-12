/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes 
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome 
da pessoa mais velha. 
 */
package ExerciciosSecao10.ex09;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas voce vai digitar? ");
        int quantidade = sc.nextInt();
        int maiorIdade = Integer.MIN_VALUE;
        int indiceMaiorIdade = 0;
        
        String nomes[] = new String[quantidade];
        int idades[] = new int[quantidade];
        
        for(int i = 0; i < quantidade; i++){
            System.out.printf("Dados da %da pessoa%n", i+1);
            System.out.print("Nome:");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }
        
        for(int i = 0; i < quantidade; i++){
             if (idades[i] > maiorIdade){
                 indiceMaiorIdade = i;
             }
        }
        
        System.out.printf("PESSOA MAIS VELHA: %s%n", nomes[indiceMaiorIdade]);
        
        sc.close();
    }
}
