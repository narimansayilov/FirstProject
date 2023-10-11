import java.util.Scanner;
public class Overload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter yhe type:");
        String input = sc.nextLine();

        while (true)
        {
            switch (input)
            {
                case "int":
                    System.out.println("Enter 3 variables of type int");
                    MultiplyMaxMin(sc.nextInt(), sc.nextInt(), sc.nextInt());
                    break;
                case "short":
                    System.out.println("Enter 3 variables of type short");
                    MultiplyMaxMin(sc.nextShort(), sc.nextShort(),sc.nextShort());
                    break;
                case "float":
                    System.out.println("Enter 3 variables of type float");
                    MultiplyMaxMin(sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
                    break;
            }
            break;
        }

    }
    public static int MultiplyMaxMin(int a, int b, int c)
    {
        int max = (a >= b) ? (a >= c ? a : c) : (b >= c ? b : c);
        int min = (a <= b) ? (a <= c ? a : c) : (b <= c ? b : c);
        return (int) (max * min);
    }
    public  static short MultiplyMaxMin(short a, short b, short c)
    {
        short max = (a >= b) ? (a >= c ? a : c) : (b >= c ? b : c);
        short min = (a <= b) ? (a <= c ? a : c) : (b <= c ? b : c);
        return (short) (max * min);
    }
    public static float MultiplyMaxMin(float a, float b, float c)
    {
        float max = (a >= b) ? (a >= c ? a : c) : (b >= c ? b : c);
        float min = (a <= b) ? (a <= c ? a : c) : (b <= c ? b : c);
        return (float) (max * min);
    }
}
