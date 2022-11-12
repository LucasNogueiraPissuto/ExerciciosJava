/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */
package exerciciosSecao6;

import java.util.Scanner;

public class exercicioFor2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int quantidade = sc.nextInt();
        int qtdIn = 0;
        int qtdOut = 0;
        
        for (int i = 1; quantidade >= i; i++){
            int numero = sc.nextInt();
            if (numero >= 10 && numero <= 20){
                qtdIn++;
            }
            else{
                qtdOut++;
            }
        }
        System.out.printf("%d in%n", qtdIn);
        System.out.printf("%d out%n", qtdOut);
        
        sc.close();
    }
}
