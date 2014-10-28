/**
 * Created by dmanzelmann on 10/28/14.
 */
public class MainStudentDatabase {
    public static void main(String[] args) {
        UOA<StudentDatabase> students = new UOA<StudentDatabase>(10);
        StudentDatabase bob = new StudentDatabase("bob", "123", 3.4);
        StudentDatabase frank = new StudentDatabase("frank", "124", 3.9);
        StudentDatabase boobie = new StudentDatabase("boobie", "125", 1.0);

        students.insert(bob);
        students.insert(frank);
        students.insert(boobie);


        System.out.println(bob);
        System.out.println(frank);
        System.out.println(boobie);
    }
}
