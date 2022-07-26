package Workshop;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");

        Lesson lesson1 = new Lesson();
        lesson1.setId(1);
        lesson1.setName("Java&React");
        lesson1.setDescription("Bu dersin içeriği javadır.");
        lesson1.setInstructor(instructor);

        Lesson lesson2 = new Lesson();
        lesson2.setId(2);
        lesson2.setName("C#&Angular");
        lesson2.setDescription("Bu dersin içeriği C#.");
        lesson2.setInstructor(instructor);

        Lesson lesson3 = new Lesson();
        lesson3.setId(3);
        lesson3.setName("Javascript");
        lesson3.setDescription("Bu dersin içeriği javascript.");
        lesson3.setInstructor(instructor);

        Category category = new Category();
        category.setId(1);
        category.setName("Programlama");

        System.out.println(lesson1.getName()+ " " + lesson1.getDescription()+" "+ lesson1.getInstructor().getFirstName());
        System.out.println(lesson2.getName()+ " " + lesson2.getDescription()+" "+ lesson2.getInstructor().getFirstName());
        System.out.println(lesson3.getName()+ " " + lesson3.getDescription()+" "+ lesson3.getInstructor().getFirstName());

	}

}
