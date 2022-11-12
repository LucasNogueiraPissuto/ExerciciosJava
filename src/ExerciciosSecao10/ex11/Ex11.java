/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa 
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número 
de homens.
 */
package ExerciciosSecao10.ex11;

import java.util.Scanner;
import java.util.Arrays;

public class Ex11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serão digitadas? ");
        int quantidade = sc.nextInt(),
            quantidadeMulheres = 0,
            quantidadeHomens = 0;
        
        char generos[] = new char[quantidade];
        double alturas[] = new double[quantidade];
        
        double somaAlturas = 0;
        
        for(int i = 0; i < quantidade; i++){
            System.out.printf("Altura da %da pessoa: ", i + 1);
            alturas[i] = sc.nextDouble();
            System.out.printf("Generos da %da pessoa: ", i + 1);
            generos[i] = sc.next ().charAt(0);
        }
        
        for(int i = 0; i < quantidade; i++){
            if(generos[i] == 'F'){
                somaAlturas += alturas[i];
                quantidadeMulheres++;
            }
            else{
                quantidadeHomens++;
            }
        }
        
        double mediaAlturaMulheres = somaAlturas / quantidadeMulheres;
        
        Arrays.sort(alturas);
        
        System.out.printf("Menor altura = %.2f%n", alturas[0]);
        System.out.printf("Maior altura = %.2f%n", alturas[quantidade - 1]);
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
        System.out.printf("Numero de homens = %d%n", quantidadeHomens);
        
        sc.close();
    }
}
