package coffeeSalesSystem.dataAccess.abstracts;

import coffeeSalesSystem.entities.concretes.Category;

import java.util.ArrayList;

public interface ICategoryDao {
	void add(Category category);

	void update(Category category);

	void delete(Category category);

	ArrayList<Category> getAll();
}
