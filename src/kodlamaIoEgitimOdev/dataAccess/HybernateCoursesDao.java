package kodlamaIoEgitimOdev.dataAccess;

import java.util.ArrayList;

import kodlamaIoEgitimOdev.entities.Category;
import kodlamaIoEgitimOdev.entities.Courses;

public class HybernateCoursesDao implements CoursesDao{
	
	ArrayList<Courses> coursesArrayList =  new ArrayList<>();

	@Override
	public void add(Courses courses) {
		System.out.println("Hibernate");
	}

	@Override
	public ArrayList<Courses> getAllCourses() {
		// TODO Auto-generated method stub
		return coursesArrayList;
	}

}
