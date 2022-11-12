/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
*/
package exerciciosSecao6;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        int senha = 2002;
        int senhaUsuario = sc.nextInt();
        
        while (senhaUsuario != senha){
            System.out.println("Senha Invalida");
            senhaUsuario = sc.nextInt();
        }
        
        System.out.println("Acesso Permitido");
        
        sc.close();
    }
}
