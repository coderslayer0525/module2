package ss12_product.service;

import ss12_product.entity.Product;

import java.util.ArrayList;

public class ProductService  implements  IProductService{

    @Override
    public ArrayList<Product> findAll() {
        return null;
    }

    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public boolean delete(int id) {
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
