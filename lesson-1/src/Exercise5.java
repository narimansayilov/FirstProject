import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for( int i=n;i<=m;i++)
        {
            boolean k = true;
            for( int j=2;j*j<=i;j++)
            {
                if(i%j==0)
                {
                    k = false;
                    break;
                }
            }
            if(k)
                System.out.print(i + " ");
        }
    }
}
