package ss12_product.repository;

import ss12_product.entity.Product;

import java.util.ArrayList;

public class ProductRepository implements IProductRepository {
    private static ArrayList<Product> productList = new ArrayList<>();
    static {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
    }
    @Override
    public ArrayList<Product> findAll() {
        return productList;
    }

    @Override
    public boolean add(Product product) {
        productList.add(product);
        return true;
    }

    @Override
    public boolean delete(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                productList.remove(product);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean update(int id, Product newProduct) {
        return false;
    }

    @Override
    public Product findbyId(int id) {
        return null;
    }
}
