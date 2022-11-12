package ExerciciosSecao8.exercicio2;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    
    public double NetSalary(){
        return grossSalary - tax;
    }
    
    public void IncreseSalary(double percentege){
        double addition = (grossSalary * percentege) / 100;
        
        this.grossSalary += addition;
    }
}
