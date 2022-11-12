/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */
package exerciciosSecao6;

import java.util.Scanner;

public class exercicioFor4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int qtdRepeticoes = sc.nextInt();
        int n1, n2;
        for (int i = 1; qtdRepeticoes >= i; i++){            
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            
            if (n2 == 0){
                System.out.println("divisao impossivel");
            }
            else{
                float quociente = (float) n1/n2;
                System.out.printf("%.1f%n", quociente);
            }
        }
        sc.close();
    }
}
