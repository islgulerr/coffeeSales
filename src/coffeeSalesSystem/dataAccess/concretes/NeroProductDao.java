package coffeeSalesSystem.dataAccess.concretes;

import java.util.ArrayList;

import coffeeSalesSystem.dataAccess.abstracts.IProductDao;
import coffeeSalesSystem.entities.concretes.Product;

public class NeroProductDao implements IProductDao {
	@Override
	public void add(Product product) {
		System.out.println(product.getProductName() + " veritabanina eklendi.");
	}

	@Override
	public void update(Product product) {
		System.out.println(product.getProductName() + " veritabani guncellendi.");
	}

	@Override
	public void delete(Product product) {
		System.out.println(product.getProductName() + " veritabanindan silindi.");
	}

	@Override
	public ArrayList<Product> getAllDrinks() {
		ArrayList<Product> drinks = new ArrayList<>();
		drinks.add(new Product("Strawberry Frappe Nero", 12));
		drinks.add(new Product("Lemonade", 11));
		drinks.add(new Product("Hot Chocolate", 17));
		drinks.add(new Product("Raspberry & Hibiscus Iced Tea", 11));
		return drinks;
	}

	@Override
	public ArrayList<Product> getAllFoods() {
		ArrayList<Product> foods = new ArrayList<>();
		foods.add(new Product("Bal Kabakli Pasta", 15));
		foods.add(new Product("Kat Kat Cikolata", 14));
		foods.add(new Product("Annemin Pogacasi", 8));
		foods.add(new Product("Fume Hindi Cheddar Peynirli", 18));
		return foods;
	}

}
