package ss12_product.repository;

import ss12_product.entity.Product;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList<Product> findAll();
    boolean add(Product product);
    boolean delete(int id);
    boolean update(int id, Product newProduct);
    Product findbyId(int id);
}
