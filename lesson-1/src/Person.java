import java.time.LocalDate;
public class Person {
    String name;
    String surname;
    String university;
    LocalDate born;

    void display()
    {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(university);
        System.out.println(born);
    }

}
