/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
seguir, calcule e mostre o valor da conta a pagar
 */
package exerciciosSecao5;

import java.util.Scanner;

public class Exercicio5 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int codigoItem = sc.nextInt();
        int quantidadeItem = sc.nextInt();
        double valorTotal;
        double valorItem = 00.00;
        
        if (codigoItem == 1)
        {
            valorItem = 4.00;
        }
        
        if (codigoItem == 2)
        {
            valorItem = 4.50;
        }
        
        if (codigoItem == 3)
        {
            valorItem = 5.00;
        }
        
        if (codigoItem == 4)
        {
            valorItem = 2.00;
        }
        
        if (codigoItem == 5)
        {
            valorItem = 1.50;
        }
        else
        {
            System.out.println("Codigo de item invalido!");
        }
        
        valorTotal = valorItem * quantidadeItem;
        System.out.printf("Total: R$%.2f%n", valorTotal);
        
    }
}