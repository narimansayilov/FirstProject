import java.util.Scanner;
public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] prime = new int[num];
        int sum =0;
        for (int i = 0; i < num; i++)
        {
            prime[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++)
        {
            boolean f = true;
            for (int j = 2; j*j <= prime[i]; j++)
            {
                if(prime[i]%j==0)
                {
                    f = false;
                    break;
                }
            }
            if(f)
                sum+=prime[i];
        }
        System.out.println(sum);
    }
}
