package ExerciciosSecao8.exercicio2;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome: ");
        employee.name = sc.nextLine();
        
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        
        System.out.println("Employee: " + employee.name + ", $ " + String.format("%.2f",employee.NetSalary()));
        
        System.out.print("Wich percentege to incresed salary? ");
        double addition = sc.nextDouble();
        employee.IncreseSalary(addition);
        
        System.out.println("Update data: " + employee.name + ", $ " + String.format("%.2f",employee.NetSalary()));
        
        sc.close();
    }
}
