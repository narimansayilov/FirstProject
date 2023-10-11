import java.time.LocalDate;
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Person Student1 = new Person();

        Student1.name = "Nariman";
        Student1.surname = "Sayilov";
        Student1.university = "Baku Engineering Univerity";
//        Student1.born = LocalDate.of(2004, 08, 29);
        Student1.display();
    }
}
