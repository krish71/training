package repo;

import java.util.List;

import entity.Product;

public interface ProductRepository {

	public void add(Product product);
	public Product get(int productId);
	public List<Product>getAll();
}
