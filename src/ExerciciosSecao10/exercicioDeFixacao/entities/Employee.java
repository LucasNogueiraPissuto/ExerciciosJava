package ExerciciosSecao10.exercicioDeFixacao.entities;


public class Employee {
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }
    
    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public void IncreaseSalary(double percentege){
        double increase = (salary*percentege) / 100;
        salary += increase;
    }
    
}
