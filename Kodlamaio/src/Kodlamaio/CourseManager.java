package Kodlamaio;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
	

    public void addCourse (Courses course ){
    	System.out.println(course.getName()+"eklendi");
    }

    public void update(Courses course){
    	System.out.println(course.getName()+"güncellendi");
   
    }
    public void delete(Courses course) {
    	System.out.println(course.getName()+"Silindi");
    }
    public List<Courses> getAll()
    {
    	return new ArrayList<Courses>();
    }
}
