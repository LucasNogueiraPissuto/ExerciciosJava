package exerciciosSecao6;

import java.util.Scanner;

public class exemploAula45 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int numero = 1;
        int soma = 0;
        
        while (numero != 0){
            numero = sc.nextInt();
            soma += numero;
        }
        System.out.println(soma);
        
        sc.close();
    }
}
