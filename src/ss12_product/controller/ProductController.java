package ss12_product.controller;

import ss12_product.entity.Product;
import ss12_product.service.IProductService;
import ss12_product.service.ProductService;
import ss12_product.view.ProductView;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    private final IProductService iProductService = new ProductService();
    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        final int DISPLAYPRODUCTLIST = 1;
        final int REPAIRPRODUCT = 2;
        final int SEARCHPRODUCT = 3;
        final int ADDPRODUCT = 4;
        final int REMOVEPRODUCT = 5;
        final int ARRANGEPRODUCT = 6;
        boolean flag = true;
        while (flag){
            System.out.println("<----->PRODUCTMANAGERMENT<----->");
            System.out.println("+++OPTION+++" +
                    "\n 1. Product list " +
                    "\n 2. Repair product" +
                    "\n 3. Search product" +
                    "\n 4. Add new product" +
                    "\n 5. Del/remove product" +
                    "\n 6. Arrange product list " );
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case DISPLAYPRODUCTLIST :
                    System.out.println("List of Product");
                    ArrayList<Product> productArrayList = iProductService.findAll();
                    ProductView.display(productArrayList);
                    break;
                case REPAIRPRODUCT:
                    System.out.println("repairing product");
                    break;
                case SEARCHPRODUCT:
                    System.out.println("Searching product");
                    Product product = ProductView.inputData();
                    if (iProductService.findbyId(product.getId()) != null){
                        System.out.println("--------");
                    }
                    break;
                case ADDPRODUCT:
                    System.out.println(" Add new product");
                    Product product1 = ProductView.inputData();
                    if (iProductService.add(product1)){
                        System.out.println("added");
                    }
                    break;
                case REMOVEPRODUCT:
                    System.out.println("Remove product");
                    Product product2 = ProductView.inputData();
                    if (iProductService.delete(product2.getId())){
                        System.out.println("done");
                    }
                    break;
                case ARRANGEPRODUCT:
                    System.out.println("Arranger Product");
                    break;
                default:
                    flag = false;
            }
        }
    }
}
