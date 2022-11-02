package kodlamaIoEgitimOdev.dataAccess;

import java.util.ArrayList;

import kodlamaIoEgitimOdev.entities.Instructor;

public interface InstructorDao {
	void add(Instructor intsructor);
	
	ArrayList<Instructor> getAllInstructors();

}
