import java.sql.SQLOutput;
import java.util.*;

public class Task2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        while ((a!=b))
        {
            System.out.println("Daxil olan deyisenler beraber olmalidir, Zehmet olmasa qiymetleri yeniden daxil edin");
            a = sc.nextInt();
            b = sc.nextInt();
        }
        Multidimensional multi = new Multidimensional(a,b);
        multi.enterValuesFromConsole();
        multi.findFirstDiagonalElements();
        multi.findSecondDiagonalElements();

    }
}
