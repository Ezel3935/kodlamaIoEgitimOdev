package kodlamaIoEgitimOdev.dataAccess;

import java.util.ArrayList;

import kodlamaIoEgitimOdev.entities.Courses;

public interface CoursesDao {
	void add(Courses courses);

	ArrayList<Courses> getAllCourses();
}
