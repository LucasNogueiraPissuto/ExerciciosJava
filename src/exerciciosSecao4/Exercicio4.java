/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
*/

package exerciciosSecao4;

import java.util.Scanner;

public class Exercicio4 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int nrFuncionario;
        float hrsTrabalhadas, vlrHora;
        
        nrFuncionario = sc.nextInt();
        hrsTrabalhadas = sc.nextFloat();
        vlrHora = sc.nextFloat();
        
        float salario = hrsTrabalhadas * vlrHora;
        
        System.out.println("NUMBER = " + nrFuncionario);
        System.out.printf("SALARY = %.2f%n", salario);
        
        sc.close();
    }
}
