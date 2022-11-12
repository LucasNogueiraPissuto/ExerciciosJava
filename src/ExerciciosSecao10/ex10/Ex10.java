/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram 
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir 
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou 
igual a 6.0 (seis). 
 */
package ExerciciosSecao10.ex10;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos alunos serão digitados? ");
        int quantidade = sc.nextInt();
        
        String nomes[] = new String[quantidade];
        double notas1[] = new double[quantidade], 
               notas2[] = new double[quantidade];
        
        for(int i = 0; i < quantidade; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n", i + 1);
            sc.nextLine();
            nomes[i] = sc.nextLine();
            notas1[i] = sc.nextDouble();
            notas2[i] = sc.nextDouble();
        }
        
        System.out.println("Alunos aprovados:");
        
        for(int i = 0; i < quantidade; i++){
            double media = (notas1[i] + notas2[i]) / 2;
            if(media >= 6){
                System.out.println(nomes[i]);
            }
        }
        
        sc.close();
    }
}
