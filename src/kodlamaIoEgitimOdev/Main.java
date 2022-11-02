package kodlamaIoEgitimOdev;

import kodlamaIoEgitimOdev.business.CategoryManager;
import kodlamaIoEgitimOdev.business.CoursesManager;
import kodlamaIoEgitimOdev.business.InstructorManager;
import kodlamaIoEgitimOdev.dataAccess.HybernateCoursesDao;
import kodlamaIoEgitimOdev.dataAccess.HybernateInstructorDao;
import kodlamaIoEgitimOdev.dataAccess.HybernatecategoryDao;
import kodlamaIoEgitimOdev.entities.Category;
import kodlamaIoEgitimOdev.entities.Courses;
import kodlamaIoEgitimOdev.entities.Instructor;
import kodlamaIoEgitimOdev.logging.DataBaseLogger;
import kodlamaIoEgitimOdev.logging.Logger;

public class Main {

	public static void main(String[] args) throws Exception {
		Category category1 = new Category(0, "Diller");
		
		Instructor instructor1 = new Instructor(1, "Ezel", "İnan");
		
		Courses courses1 = new Courses(1, "İngilizce", 100);
		Courses courses2 = new Courses(1, "Fransızca", 150);
		Courses courses3 = new Courses(1, "İspanyolca", 100);
		
		Logger[] loggers = {new DataBaseLogger()};
		
		CategoryManager categoryManager = new CategoryManager(new HybernatecategoryDao(), loggers);
		categoryManager.add(category1);
		
		System.out.println("*********************************");
		
		CoursesManager coursesManager = new CoursesManager(new HybernateCoursesDao(), loggers);
		coursesManager.add(courses1);
		coursesManager.add(courses2);
		coursesManager.add(courses3);
		
		System.out.println("*********************************");
		
		InstructorManager instructorManager = new InstructorManager(new HybernateInstructorDao(), loggers);
		instructorManager.add(instructor1);
	}

}
