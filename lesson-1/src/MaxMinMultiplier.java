import java.util.Scanner;
public class MaxMinMultiplier
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        int Result = (int) MultiplyMaxMin(num1, num2, num3);
        System.out.println(Result);
//        short shortResult = (short) MultiplyMaxMin(num1, num2, num3);
//        System.out.println(shortResult);
//        float floatResult = MultiplyMaxMin((float) num1, (float) num2, (float) num3);
//        System.out.println(floatResult);
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










































//import java.util.Scanner;
//
//public class MaxMinMultiplier {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Input three numbers
//        System.out.print("Enter the first number: ");
//        short num1 = scanner.nextShort();
//        System.out.print("Enter the second number: ");
//        float num2 = scanner.nextFloat();
//        System.out.print("Enter the third number: ");
//        int num3 = scanner.nextInt();
//
//        // Calculate and print the product of max and min for different data types
//        short shortResult = multiplyMaxMin(num1, num2, num3);
//        System.out.println("Product of max and min (short): " + shortResult);
//
//        float floatResult = multiplyMaxMin(num1, num2, num3);
//        System.out.println("Product of max and min (float): " + floatResult);
//
//        int intResult = multiplyMaxMin(num1, num2, num3);
//        System.out.println("Product of max and min (int): " + intResult);
//    }
//
//    public static short multiplyMaxMin(short a, float b, int c) {
//        // Find maximum and minimum using ternary operators
//        short max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
//        short min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
//        // Calculate the product of max and min
//        return (short) (max * min);
//    }
//
//    public static float multiplyMaxMin(short a, float b, int c) {
//        // Find maximum and minimum using ternary operators
//        float max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
//        float min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
//        // Calculate the product of max and min
//        return max * min;
//    }
//
//    public static int multiplyMaxMin(short a, float b, int c) {
//        // Find maximum and minimum using ternary operators
//        int max = (a > b) ? (a > c ? a : c) : (b > c ? (int) b : c);
//        int min = (a < b) ? (a < c ? a : c) : (b < c ? (int) b : c);
//        // Calculate the product of max and min
//        return max * min;
//    }
//}
