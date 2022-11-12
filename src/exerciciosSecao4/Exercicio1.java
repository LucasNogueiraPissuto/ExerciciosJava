/*
Faça um programa para ler dois valores inteiros, 
e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
*/

package exerciciosSecao4;

import java.util.Scanner;

public class Exercicio1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int numero1, numero2, soma;
        
        System.out.printf("Digite o primeiro numero: %n");
        numero1 = sc.nextInt();
        System.out.printf("Digite o segundo numero: %n");
        numero2 = sc.nextInt();
        
        soma = numero1 + numero2;
        
        System.out.println("SOMA = " + soma);
        
        sc.close();
    }
}
