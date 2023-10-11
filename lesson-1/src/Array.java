import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

//        byte[] ages = new byte[7];
//        int[] ages = {23, 24, 19 ,118};
//        String[] names = {"Elxan" ,"Ucal" ,"Peyman", "Eltun"};

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] digit = new int[num];

        for (int i = 0; i < num; i++) {
            digit[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        for (int i = 0; i < num; i++) {
            if(digit[i] == a)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
