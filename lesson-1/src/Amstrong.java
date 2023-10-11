import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            int copy = number;
            String word = Integer.toString(number);
            int numdigit = word.length();
            int sum=0;
            for(int i=0; i<numdigit; i++)
            {
                int digit=number%10;
                sum+=Math.pow(digit,numdigit);
                number/=10;
            }
            if(copy==sum)
                System.out.println("Amstrong");
            else
                System.out.println("Not amstrong");

//            int a =sc.nextInt();
//            if(a>=100 && a<=999)
//            {
//                int b=a%10;
//                int c=a/10%10;
//                int d=a/100;
//                if(a==(b*b*b + c*c*c + d*d*d))
//                    System.out.println("Yes");
//                else System.out.println("No");
//            }


    }
}
