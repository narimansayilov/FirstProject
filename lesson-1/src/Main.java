import java.util.Scanner;

//public class Polindrom {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Bir kelime veya ifade girin: ");
//        String input = scanner.nextLine();
//
//
//        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
//
//        boolean isPalindrome = true;
//
//        int length = cleanedInput.length();
//        for (int i = 0; i < length / 2; i++) {
//            if (cleanedInput.charAt(i) != cleanedInput.charAt(length - 1 - i)) {
//                isPalindrome = false;
//                break;
//            }
//        }
//
//        if (isPalindrome) {
//            System.out.println("Bu bir palindromedir!");
//        } else {
//            System.out.println("Bu bir palindrom değildir.");
//        }
//
//        scanner.close();
//    }
//}
//import java.util.Scanner;
//
//public class Polindrom {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        int num = s.length();
//        StringBuilder reversed = new StringBuilder();
//
//        // Reverse the input string
//        for (int i = num - 1; i >= 0; i--) {
//            reversed.append(s.charAt(i));
//        }
//
//        if (s.equals(reversed.toString()))
//            System.out.println("Palindrome");
//        else
//            System.out.println("Not palindrome");
//
//        sc.close();
//    }
//}

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car();
        Car lexus = new Car();

        toyota.model = "Prius";
        lexus.model = "S200";

        toyota.start();
    }
}


