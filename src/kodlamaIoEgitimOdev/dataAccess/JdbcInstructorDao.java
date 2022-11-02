package kodlamaIoEgitimOdev.dataAccess;

import java.util.ArrayList;

import kodlamaIoEgitimOdev.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor intsructor) {
		System.out.println("JDBC");
		
		
	}

	@Override
	public ArrayList<Instructor> getAllInstructors() {
		// TODO Auto-generated method stub
		return getAllInstructors();
	}

}
