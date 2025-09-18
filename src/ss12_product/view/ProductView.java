package ss12_product.view;

import ss12_product.entity.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
    private static Scanner scanner = new Scanner(System.in);
    public static void display(ArrayList<Product> productArrayList){
        for(Product product : productArrayList){
            System.out.println(product);
        }
    }
    public static Product inputData(){
        System.out.println("enter Id of Product :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name of Product");
        String name = scanner.nextLine();
        System.out.println("enter price of Product");
        double price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        return product;
    }
}
