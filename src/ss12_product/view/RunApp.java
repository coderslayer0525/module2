package ss12_product.view;

import ss12_product.controller.ProductController;

import java.util.Scanner;

public class RunApp {
    public static void main(String[] args){
        displayMain();
    }
    public static void displayMain(){
        ProductController productController = new ProductController();
        Scanner sc = new Scanner(System.in);
        final int DISPLAYFACTORY = 1;
        final int PRODUCT = 2;
        final int EXIT = 3;
        boolean flag = true;
        while (flag){
            System.out.println("PRODUCTMANAGERMENT");
            System.out.println("----SELECT OPTION----" +
                    "\n 1. Display Main Menu" +
                    "\n 2. Poduct List" +
                    "\n 3. EXIT");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case DISPLAYFACTORY :
                    System.out.println("iiiiiiiii");
                    productController.displayMenu();
                    break;
                case PRODUCT:
                    System.out.println("aaaaaaaa");
                    break;
                case EXIT:
                    System.out.println("exited");
                default:
                    flag = false;
            }
        }
    }
}
