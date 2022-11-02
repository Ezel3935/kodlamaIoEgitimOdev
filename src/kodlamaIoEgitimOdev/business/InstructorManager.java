package kodlamaIoEgitimOdev.business;

import java.util.List;

import kodlamaIoEgitimOdev.dataAccess.InstructorDao;
import kodlamaIoEgitimOdev.entities.Instructor;
import kodlamaIoEgitimOdev.logging.Logger;

public class InstructorManager {

	private InstructorDao instructorDao;
	private Logger[] loggers;
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) 
	{
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor)
	{
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getLastname()+ " "+ instructor.getLastname());;
		}
	}
	public List<Instructor>getAllInstructors(){
		return getAllInstructors();
		
	}
}
