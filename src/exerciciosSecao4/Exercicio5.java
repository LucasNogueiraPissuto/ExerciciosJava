/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/

package exerciciosSecao4;

import java.util.Scanner;

public class Exercicio5 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        float valorTotal;
        
        int codPeca1;
        int qtdPecas1;
        float vlrUnitarioPeca1;
        
        int codPeca2;
        int qtdPecas2;
        float vlrUnitarioPeca2;
        
        codPeca1 = sc.nextInt();
        qtdPecas1 = sc.nextInt();
        vlrUnitarioPeca1 = sc.nextFloat();
        
        codPeca2 = sc.nextInt();
        qtdPecas2 = sc.nextInt();
        vlrUnitarioPeca2 = sc.nextFloat();
        
        
        valorTotal = qtdPecas1 * vlrUnitarioPeca1 + qtdPecas2 * vlrUnitarioPeca2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
        
        sc.close();
    }
}
