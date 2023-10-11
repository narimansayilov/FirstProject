import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char c = sc.next().charAt(0);
        int b = sc.nextInt();
        if(c=='+')
            System.out.println(a+b);
        else if(c=='-' && a>=b)
            System.out.println(a-b);
        else if(c=='*')
            System.out.println(a*b);
        else if(c=='/' && b!=0 && a%b==0)
            System.out.println(a/b);
        else
            System.out.println("Your choice is incorrect");

    }
}
