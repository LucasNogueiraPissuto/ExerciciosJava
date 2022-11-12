package ExerciciosSecao8.exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Rectangle retangle = new Rectangle();
        
        
        System.out.println("Enter rectangle width and height: ");;
        retangle.height = sc.nextDouble();
        retangle.width = sc.nextDouble();
        
        System.out.println("AREA = " + String.format("%.2f", retangle.Area()));
        System.out.println("PERIMETER = " + String.format("%.2f", retangle.perimeter()));
        System.out.println("DIAGONAL = " + String.format("%.2f", retangle.diagonal()));
        sc.close();
    }
    
}
