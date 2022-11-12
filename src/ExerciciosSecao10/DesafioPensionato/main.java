package ExerciciosSecao10.DesafioPensionato;

import ExerciciosSecao10.DesafioPensionato.entities.Estudantes;
import ExerciciosSecao10.DesafioPensionato.entities.Pensionato;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pensionato pens = new Pensionato();
        System.out.print("Quantos quartos vão ser alugados? ");
        int qtdQuartosAlugados = sc.nextInt();
        
        System.out.println("");
        
        for(int i = 0; i < qtdQuartosAlugados; i++){
            System.out.println("Aluguel #" + (i+1));
            sc.nextLine();
            
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Email: ");
            String email = sc.next();
            
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            
            Estudantes est = new Estudantes(nome, email, quarto);
            
            pens.alugarQuarto(est, quarto);
            
            System.out.println("");
        }
        
        System.out.println("Quartos ocupados: ");
        for(int i = 0; i < pens.nrQuartos.length ; i++){
            if (pens.nrQuartos[i] != null){
                System.out.println(i + ": " + pens.nrQuartos[i].nome + ", " + pens.nrQuartos[i].email);
            }
        }     
    }
}
