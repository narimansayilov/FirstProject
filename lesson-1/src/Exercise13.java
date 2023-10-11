import java.util.Scanner;
public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int copy = num;
        int digit;
        int Num=0;

        while(num>0)
        {
            digit = num%10;
            Num = Num*10 + digit;
            num/=10;
        }
//        while(num>0)
//        {
//            digit = num%10;
//            k++;
//            num/=10;
//        }
//        int digit2;
//        while(copy>0){
//            digit2 = copy%10;
//            Num += digit2*Math.pow(10,(k-1));
//            copy/=10;
//            k--;
//        }
        if(copy == Num)
        {
            int a,sum2=0;
            while(Num>0)
            {
                a=Num%10;
                sum2+=a;
                Num/=10;
            }
            System.out.println(sum2);
        }
        else
            System.out.println("Number is not palindrome");

    }
}
