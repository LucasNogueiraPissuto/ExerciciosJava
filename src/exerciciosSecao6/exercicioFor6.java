/*
Ler um número inteiro N e calcular todos os seus divisores.
*/
package exerciciosSecao6;

import java.util.Scanner;

public class exercicioFor6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        
        for (int i = 1; numero>=i; i++){
            if (numero % i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
