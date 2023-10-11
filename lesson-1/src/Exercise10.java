import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        short[] single = new short[num];
        for (int i = 0; i < num; i++) {
            single[i] = sc.nextShort();
        }
        for (int i = 0; i < num; i++) {
                System.out.print(single[i] % 2 != 0 ? single[i] + " " : "");
        }
    }
}
