//import java.util.Scanner;
//public class Exercise14 {
//    public static void main(String[] args) {
//
//    }
//}


//import java.util.Scanner;
//
//public class Exercise14 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        double b = sc.nextDouble();
//        String c = sc.nextLine();
//        System.out.println("String: " + c );
//        System.out.println("Double: " + b);
//        System.out.println("Int: " + a);
//
//    }
//}

//import java.util.Scanner;
//
//class Solution{
//    public static void main(String []argh){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//
//        for(int i= 0; i < n; i++){
//            a[i] = sc.nextInt();
//        }
//        int k = 0;
//        for (int i = 0; i < n; i++) {
//            k=a[0];
//            for (int j = 1; j <= a[n-1] ; j++) {
//                k=k+a[j]*a[1];
//                System.out.print(k + " ");
//            }
//            System.out.print('\n');
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Exercise14 {
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] num = new int[n];
//        double positive = 0, zero = 0, negative = 0;
//        for (int i = 0; i < n; i++) {
//            num[i] = sc.nextInt();
//            if(num[i] > 0)
//                positive++;
//            else if(num[i] == 0)
//                zero++;
//            else if(num[i] < 0)
//                negative++;
//        }
//        System.out.println(positive/n);
//        System.out.println(negative/n);
//        System.out.println(zero/n);
//    }
//}

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int c =0;
        if(a%b==0)
            c=a;
        else if(b%a==0)
            c=b;
        else
        {
            int k=a*b;
            for (int i = a; i <= k; i++) {
                if(i % a == 0 && i % b == 0)
                {
                    c = i;
                    break;
                }
            }
        }

        int m= 1;
        for (int i = c; i <= n; i++) {
            if(i % c ==0)
            {
                m*=i;
                i+=c;
            }


        }
        System.out.println(m);
    }
}