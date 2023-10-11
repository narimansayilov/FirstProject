import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i1=0, i2=1, k=0, i;
        while(k<n)
        {
            if(k<=1)
                System.out.print(k + " ");
            else
            {
                i = i1 + i2;
                System.out.print(i + " ");
                i1 = i2;
                i2 = i;
            }
            k++;
        }
    }

}
