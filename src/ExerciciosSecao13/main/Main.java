package main;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the client data:");
        
        System.out.print("Name: ");
        String name = sc.nextLine();
        
        System.out.print("Email: ");
        String email = sc.next();
        
        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        
        Client client = new Client(name, email, birthDate);
        
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.next();
        
        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
        
        System.out.print("How many items to this order? ");
        int qtd = sc.nextInt();
        
        for(int i = 0; i < qtd; i++){
            System.out.println("Enter #" + (i+1) + " item data: ");
            System.out.print("Product name: ");
            String productName = sc.next();
            
            System.out.print("Product Price: ");
            Double productPrice = sc.nextDouble();
            
            Product product = new Product(productName, productPrice);
            
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
            
            order.addItem(orderItem);
        }
        
        System.out.println();
	System.out.println("ORDER SUMMARY:");
	System.out.println(order);
        
        sc.close();
    }
}
