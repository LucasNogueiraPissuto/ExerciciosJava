/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
*/
package exerciciosSecao5;

import java.util.Scanner;

public class Exercicio1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        
        if (numero < 0)
        {
            System.out.println("Esse numero é negativo!");
        }
        else
        {
            System.out.println("Esse numero não é negativo");
        }
        
        sc.close();
    }
}
