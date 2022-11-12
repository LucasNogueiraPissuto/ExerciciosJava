/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
- Imprimir todos os elementos do vetor 
- Mostrar na tela a soma e a média dos elementos do vetor
 */
package ExerciciosSecao10.ex02;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        int qtd, sum = 0;
        double avg;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos numeros voce vai digitar: ");
        qtd = sc.nextInt();
        
        double numbers[] = new double[qtd];
        
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }
        
        avg = sum / numbers.length;
        
        System.out.print("VALORES = ");
        
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.printf("%n");
        System.out.println("SOMA = " + sum);
        System.out.println("MEDIA = " + avg);
        
        sc.close();
    }
    
}
