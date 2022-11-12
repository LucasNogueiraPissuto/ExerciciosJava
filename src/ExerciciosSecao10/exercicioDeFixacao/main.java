package ExerciciosSecao10.exercicioDeFixacao;

import java.util.Scanner;
import ExerciciosSecao10.exercicioDeFixacao.entities.Employee;
import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<Employee>();
        
        
        System.out.print("How many employees will be registered? ");
        int quantity = sc.nextInt();
        
        for(int i = 0; i < quantity; i++){
            System.out.println("");
            System.out.println("Emplyoee #" + (i+1));
            
            System.out.print("Id: ");
            int id = sc.nextInt();
            while(hasId(employees, id) != null){
                System.out.print("This id alredy taken! Try again: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            
            Employee employe = new Employee(id, name, salary);
            employees.add(employe);
        }
        
        System.out.println("");
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = hasId(employees, id);
        if (emp != null){
            System.out.print("Enter the percentage:");
            double percentege = sc.nextDouble();
            emp.IncreaseSalary(percentege);
        }
        else{
            System.out.println("This id does not exist!");
        }
        
        System.out.println("");
        System.out.println("List of employees:");
        for(Employee empl : employees){
            System.out.println(empl.getId() + ", " + empl.getName() + ", " + String.format("%.2f", empl.getSalary()));
        }
        
        sc.close();
    }
    
    public static Employee hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        
        return emp;
    }
}
