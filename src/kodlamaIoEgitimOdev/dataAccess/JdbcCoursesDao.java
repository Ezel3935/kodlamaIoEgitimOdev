package kodlamaIoEgitimOdev.dataAccess;

import java.util.ArrayList;

import kodlamaIoEgitimOdev.entities.Courses;

public class JdbcCoursesDao implements CoursesDao{

	@Override
	public void add(Courses courses) {
		System.out.println("JDBC");
		
	}

	@Override
	public ArrayList<Courses> getAllCourses() {
		// TODO Auto-generated method stub
		return getAllCourses();
	}

}
