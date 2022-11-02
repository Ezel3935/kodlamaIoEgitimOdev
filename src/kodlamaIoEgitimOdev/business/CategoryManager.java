package kodlamaIoEgitimOdev.business;

import kodlamaIoEgitimOdev.dataAccess.CategoryDao;
import kodlamaIoEgitimOdev.entities.Category;
import kodlamaIoEgitimOdev.logging.Logger;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] logger) {
		this.categoryDao = categoryDao;
		this.loggers = logger;
	}
	
	public void add(Category category) throws Exception {
		for (Category c: categoryDao.getAllCategories()) {
			if (c.getName() == category.getName())
			{
				throw new Exception("Kategory ismi zaten var!");
			}
		}
		
		categoryDao.add(category);
		for(Logger logger: loggers)
		{
			logger.log(category.getName());
		}
		
	}
	

}
