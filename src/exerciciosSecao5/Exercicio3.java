/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
ordem crescente ou decrescente
*/
package exerciciosSecao5;

import java.util.Scanner;

public class Exercicio3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int A;
        int B;
        boolean ehMultiplo;
        
        System.out.println("Digite o segundo numero: ");
        A = sc.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        B = sc.nextInt();
        
        if (A > B)
        {
            ehMultiplo = A % B == 0;
        }
        else
        {
            ehMultiplo = B % A == 0;
        }
        
        if (ehMultiplo)
        {
            System.out.printf("Os numeros %d e %d SÃO multiplos entre si!", A, B);
        }
        else
        {
            System.out.printf("Os numeros %d e %d NÃO são multiplos entre si!", A, B);
        }
        
        sc.close();
    }
}
