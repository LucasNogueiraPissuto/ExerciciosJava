/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosSecao8.exercicioFixacao;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        
        System.out.print("How many dollars will be bought? ");
        double dollarQuantity = sc.nextDouble();
        
        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.TotalPayment(dollarPrice, dollarQuantity));

        sc.close();
    }
}
