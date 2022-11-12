/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
 */
package exerciciosSecao6;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int qtdAlcool = 0, qtdGasolina = 0, qtdDiesel = 0;
        
        int voto = sc.nextInt(); 
        
        while(voto != 4){
            if (voto == 1){
                qtdAlcool ++;
            }
            else if (voto == 2){
                qtdGasolina ++;
            }
            else if (voto == 3){
                qtdDiesel ++;
            }
            else{
                System.out.println("Codigo Invalido digite um novo codigo:");
            }
            voto = sc.nextInt();
        }
        
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n", qtdAlcool);
        System.out.printf("Gasolina: %d%n", qtdGasolina);
        System.out.printf("Diesel: %d%n", qtdDiesel);
        
        sc.close();
    }
}
