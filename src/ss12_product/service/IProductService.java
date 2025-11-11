package ss12_product.service;

import ss12_product.entity.Product;

import java.util.ArrayList;

public interface IProductService {
    ArrayList<Product> findAll();
    boolean add(Product product);
    boolean delete(int id);
    boolean update(int id, Product newProduct);
    Product findbyId(int id);
}
