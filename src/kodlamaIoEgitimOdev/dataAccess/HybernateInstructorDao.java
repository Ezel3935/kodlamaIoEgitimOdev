package kodlamaIoEgitimOdev.dataAccess;

import java.util.ArrayList;

import kodlamaIoEgitimOdev.entities.Instructor;

public class HybernateInstructorDao implements InstructorDao{
	ArrayList<Instructor> instructorArrayList = new ArrayList<>();
	@Override
	public void add(Instructor intsructor) {
		System.out.println("Hibernate ile");
	}

	@Override
	public ArrayList<Instructor> getAllInstructors() {
		// TODO Auto-generated method stub
		return instructorArrayList;
	}
	

}
