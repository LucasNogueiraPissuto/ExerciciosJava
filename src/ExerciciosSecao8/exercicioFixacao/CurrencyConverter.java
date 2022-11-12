/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosSecao8.exercicioFixacao;

/**
 *
 * @author lucas
 */
public class CurrencyConverter {
    public static double IOF = 6;
    
    public static double TotalPayment(double dollarPrice, double dollarQuantity){
        double value = dollarQuantity * dollarPrice;
        double tax = value * IOF/100;
        return value + tax;
    } 
}
