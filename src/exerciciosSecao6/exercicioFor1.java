/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
 */
package exerciciosSecao6;

import java.util.Scanner;

public class exercicioFor1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int numero = sc.nextInt();
        
        for (int i = 1; numero >= i; i++){          
            if (i % 2 != 0){
                System.out.println(i); 
            }
        }
        
        sc.close();
    }
}
