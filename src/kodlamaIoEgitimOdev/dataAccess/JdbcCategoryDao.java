package kodlamaIoEgitimOdev.dataAccess;

import java.util.ArrayList;

import kodlamaIoEgitimOdev.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBC");
		
	}

	@Override
	public ArrayList<Category> getAllCategories() {
		return getAllCategories();
	}

}
