import java.util.Scanner;
public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] digit = new int[n][m];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                digit[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(max <= digit[i][j])
                    max = digit[i][j];
                if(min >= digit[i][j])
                    min = digit[i][j];
            }
        }
        System.out.println(min + " " + max);
    }
}
