/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
*/
package exerciciosSecao5;

import java.util.Scanner;

public class Exercicio2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite qualquer numero: ");
        int numero = sc.nextInt();
        
        boolean ehPar = numero % 2 == 0;
        
        if (ehPar)
        {
            System.out.printf("%d é par!%n",numero);
        }
        else
        {
            System.out.printf("%d não é par%n", numero);
        }
        
        sc.close();
    }
}
