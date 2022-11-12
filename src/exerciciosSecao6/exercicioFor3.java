/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
 */
package exerciciosSecao6;

import java.util.Scanner;

public class exercicioFor3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int qtdCasosTeste = sc.nextInt();
        float media;
        
        for (int i = 0; qtdCasosTeste >= i; i++){
            float n1 = sc.nextFloat();
            float n2 = sc.nextFloat();
            float n3 = sc.nextFloat();
            
            n1 *= 2;
            n2 *= 3;
            n3 *= 5;
            
            media = (n1 + n2 + n3)/10;
            System.out.printf("%.1f%n", media);
        }
        
        sc.close();
    }
}
