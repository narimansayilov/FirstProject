import java.util.Scanner;
import java.util.Arrays;
public class Unboyuk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
//        Arrays.sort(num);
//        for(int i = n-1; i >=0; i--)
//        {
//            System.out.print(num[i]);
//        }
        int max =0;
        int sum = 0;
        int k = 0;
        for (int i = 0; i <n ; i++) {
            max =0;
            for (int j = 0; j < n; j++) {
                if(num[j] >= max){
                    max=num[j];
                    k=j;
                }
            }
            num[k]=0;
            sum=(sum + max)*10;

        }
        System.out.println(sum/10);
    }
}
