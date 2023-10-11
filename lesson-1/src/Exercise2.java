import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        short a = sc.nextShort();
        short b = sc.nextShort();
        short c = sc.nextShort();
        short min=0;
        min = a<=b && a<=c ? a : b<=a && b<=c ? b : c;

        System.out.println(min);

    }

}
