package homework.Task3;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//
        Course course1 = new Course(4,"History", "Sam");
        Course course2 = new Course(5,"Biology", "Susen");
        Course course3 = new Course(7,"Geography", "Andy");
        Course course4 = new Course(9,"English","Adam");
        Course course5 = new Course(new Date(),"Kop");

        Student student1 = new Student("Jack","Williams", 3);
        Student student2 = new Student("Roberts", new Course[] {course1, course2, course3, course4});

        CollegeStudent collegeStudent1 = new CollegeStudent("Max","Grace", 4);
        CollegeStudent collegeStudent2 = new CollegeStudent("Irons",new Course[] {course1, course2, course3, course4});
        CollegeStudent collegeStudent3 = new CollegeStudent("Ann", "Simons", 5, "Harvard", 1, 4);

        SpecialStudent specialStudent1 = new SpecialStudent("Kate","Anderson", 2);
        SpecialStudent specialStudent2 = new SpecialStudent("Jons",new Course[] {course1, course2, course3, course4});
        SpecialStudent specialStudent3 = new SpecialStudent("Bill","Murrey", 1,"Yelle", 2, 10, 34);

    }
}
