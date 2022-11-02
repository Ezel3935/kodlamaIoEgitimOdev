package kodlamaIoEgitimOdev.business;



import kodlamaIoEgitimOdev.dataAccess.CoursesDao;
import kodlamaIoEgitimOdev.entities.Courses;
import kodlamaIoEgitimOdev.logging.Logger;

	public class CoursesManager {
		private CoursesDao coursesDao;
		private Logger[] loggers;
		

		public CoursesManager(CoursesDao categoryDao, Logger[] loggers) {
			this.coursesDao = categoryDao;
			this.loggers = loggers;
		}
		
		public void add(Courses courses) throws Exception {
			for (Courses s: coursesDao.getAllCourses()) {
				if (s.getName() == courses.getName())
				{
					throw new Exception("kurs ismi zaten var!");
				}
			}
			
			coursesDao.add(courses);
			for(Logger logger: loggers)
			{
				logger.log(courses.getName());
			}
			
		}
		
	}
