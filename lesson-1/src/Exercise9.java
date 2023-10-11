import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            char c = ' ';
            if(s1.charAt(i)>=65 && s1.charAt(i)<=90)
                c=(char)(s1.charAt(i)+32);
            else if(s1.charAt(i)>=97 && s1.charAt(i)<=122)
                c=(char)(s1.charAt(i)-32);
            s2+=c;
        }
        System.out.println(s2);

    }
}
