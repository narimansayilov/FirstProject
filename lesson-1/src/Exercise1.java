import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float max=0 ;
        if(a > b && a > c)
            max = a;
        else if(b > a && b > c)
            max = b;
        else if(c > a && c > b)
            max = c;

        System.out.println(max);
    }

}
