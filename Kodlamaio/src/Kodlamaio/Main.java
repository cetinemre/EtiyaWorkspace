package Kodlamaio;

public class Main {

	public static void main(String[] args) {
		Category category = new Category(1," Programlama ");
        Instructor instructor = new Instructor (1," HinduMan ");
        Courses course1 = new Courses(1," Java ",category,instructor);
        Courses course2 = new Courses(2," React ",category,instructor);

        
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course2);

        Courses[] courses = new Courses[]{course1,course2 };

        
        courseManager.update(course2);
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);

        
        
	}

}
