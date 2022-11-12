/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio^2
Considere o valor de π = 3.14159
*/

package exerciciosSecao4;

import java.util.Scanner;

public class Exercicio2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        double pi = 3.14159, area, raio;
        
        raio = sc.nextDouble();
        
        area = pi * Math.pow(raio, 2.0);
        
        System.out.printf("A= %.4f%n", area);
        
        sc.close();
    }
}
