package db;

import java.util.List;

import model.Product;

public interface ProductDBIF {
	public Product insert(Product p);
	public Product delete(Product p);
	public Product update(Product p);
	public Product addStock(int amount, Product p);
	public Product findById(int id);
	public List<Product> findAll();
}
