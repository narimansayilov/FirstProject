import java.util.Scanner;
public class Consturctor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name0 = sc.next();
        String surname0 = sc.next();
        String university0 = sc.next();
        short age0 = sc.nextShort();
        short examResult0 = sc.nextShort();


        People Student1 = new People(name0, surname0, examResult0);

        Student1.age = age0;
        Student1.university = university0;

        Student1.display();
        Student1.showExamResultWithAlphabet();
    }
}
