package ExerciciosSecao8.exercicio3;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student st1 = new Student();
        
        st1.name = sc.nextLine();
        st1.grade1 = sc.nextDouble();
        st1.grade2 = sc.nextDouble();
        st1.grade3 = sc.nextDouble();
        
        System.out.println("FINAL GRADE = " + st1.finalGrade());
        System.out.println(st1.hasPassed());
        
        if (st1.hasPassed() == "FAILED"){
            System.out.println("MISSING " + st1.missing() + " POINTS");
        }
        
        sc.close();
    }
}
