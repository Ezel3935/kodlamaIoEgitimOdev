package kodlamaIoEgitimOdev.dataAccess;

import java.util.ArrayList;

import kodlamaIoEgitimOdev.entities.Category;

public interface CategoryDao {
	void add(Category category);

	ArrayList<Category> getAllCategories();

}
