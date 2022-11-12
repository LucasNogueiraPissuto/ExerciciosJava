package ex1;

import java.util.Locale;

public class Main
{    
    public static void main(String[] args) 
    {
        String product1 = "Computer", product2 = "Office desk";
        
        int age = 30, code = 5290;
        char gender = 'F';
        
        double price1 = 2100.0, price2 = 650.50, measure = 53.234567;
        
/*

%f - Ponto Flutuante

%d - inteiro

%s - texto

%n - Quebra de linha
        
Em seguida separar a string com virgula (,)
e colocar, na ordem em que vão aparecer, as variaveis
que sairão no print
        
*/
        
        System.out.printf
        (
            "Products:%n%s, which price is $ %.2f %n%s, which price is $ %.2f %n %nRecord: %d years old, code %d and gender: %s %n %nMeasue with eight decimal places: %.8f %nRouded (three decimal places): %.3f %n",
            product1, price1, product2, price2, age, code, gender, measure, measure
        );
        Locale.setDefault(Locale.US);
        System.out.printf
        (
            "US decimal point: %.3f %n", measure
        );
    }
    
}
