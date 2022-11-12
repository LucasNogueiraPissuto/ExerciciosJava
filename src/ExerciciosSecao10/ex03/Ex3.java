/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
bem como os nomes dessas pessoas caso houver. 
*/

package ExerciciosSecao10.ex03;

import java.util.Scanner;
import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int quantity, ages_less_sixteen = 0;
        double percentage_ages_less_sixteen, avg_heights;
                
        System.out.print("Quantas pessoas serão digitadas? ");
        quantity = sc.nextInt();
        
        String names[] = new String[quantity];
        int ages[] = new int[quantity];
        double heights[] = new double[quantity];
        
        for (int i = 0; i < quantity; i++){
            System.out.printf("Dados da %da peossa: %n", i+1);
            
            System.out.print("Nome: ");
            names[i] = sc.next();
            
            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
            
            System.out.print("Altura: ");
            heights[i] = sc.nextDouble();
            
        }        
        
        for(int i = 0; i < quantity; i++){
            if (ages[i] < 16){
                ages_less_sixteen++;
            }
        }
        
        percentage_ages_less_sixteen = ages_less_sixteen*100 / ages.length;
        
        avg_heights = Arrays.stream(heights).sum() / heights.length;
        
        System.out.println("");
        
        System.out.printf("Altura Media: %.2f%n", avg_heights);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\\n", percentage_ages_less_sixteen);
        
        for (int i = 0; i < quantity; i++){
            if (ages[i] < 16){
                System.out.println(names[i]);
            }
        }
        
        sc.close();
    }
}
