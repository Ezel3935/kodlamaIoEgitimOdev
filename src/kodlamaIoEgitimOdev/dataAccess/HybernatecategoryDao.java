package kodlamaIoEgitimOdev.dataAccess;

import java.util.ArrayList;

import kodlamaIoEgitimOdev.entities.Category;

public class HybernatecategoryDao implements CategoryDao{

ArrayList<Category> categoryArrayList =  new ArrayList<>();

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile");
	}

	@Override
	public ArrayList<Category> getAllCategories() {
		return categoryArrayList;
	}
	
	

}
