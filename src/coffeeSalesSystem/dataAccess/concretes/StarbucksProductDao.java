package coffeeSalesSystem.dataAccess.concretes;

import coffeeSalesSystem.entities.concretes.Product;
import coffeeSalesSystem.dataAccess.abstracts.IProductDao;

import java.util.ArrayList;

public class StarbucksProductDao implements IProductDao {
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
        drinks.add(new Product("Latte Macchiato", 16));
        drinks.add(new Product("Caffe Americano", 12));
        drinks.add(new Product("Java Chip Frappuccino", 10));
        drinks.add(new Product("Cold Brew", 13));
        return drinks;
    }

    @Override
    public ArrayList<Product> getAllFoods() {
        ArrayList<Product> foods = new ArrayList<>();
        foods.add(new Product("Izgara Tavuklu Salata", 25));
        foods.add(new Product("Fit Corek", 9));
        foods.add(new Product("Ahududulu Cheesecake", 13));
        foods.add(new Product("Peynirli Mucverli Sandvic", 17));
        return foods;
    }
}