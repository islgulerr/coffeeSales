package coffeeSalesSystem.dataAccess.abstracts;

import coffeeSalesSystem.entities.concretes.Product;

import java.util.ArrayList;

public interface IProductDao {
	void add(Product product);

	void update(Product product);

	void delete(Product product);

	ArrayList<Product> getAllDrinks();

	ArrayList<Product> getAllFoods();
}
