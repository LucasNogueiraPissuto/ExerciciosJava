/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosSecao10.DesafioPensionato.entities;

public class Pensionato {
    public Estudantes nrQuartos[] = new Estudantes[10];
    
    public void alugarQuarto(Estudantes estudante, int nrQuarto){
        this.nrQuartos[nrQuarto] = estudante;
    }
        
}
