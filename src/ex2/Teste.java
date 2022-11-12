package ex2;

import java.util.Scanner;

public class Teste 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int x;
        String y, z;
    
        x = sc.nextInt();
        sc.nextLine();
        y = sc.nextLine();
        z = sc.next();
        System.out.println("Dados digitados");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
        sc.close();
    }
}
