package ExerciciosSecao8.exercicio3;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;
    
    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }
    
    public String hasPassed(){
        if (finalGrade() > 60.00){
            return "PASS";
        }
        else{
            return "FAILED";
        }            
    }
    
    public double missing(){
        return 60 - (finalGrade());
    }
}
