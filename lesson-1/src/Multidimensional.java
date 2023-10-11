import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Multidimensional {
    Scanner sc = new Scanner(System.in);
    public static int rowSize;
    public static int columnSize;
    public static int[][] arr;

    public Multidimensional(int MyRowSize, int MyColumnSize) {
        rowSize = MyRowSize;
        columnSize = MyColumnSize;
        arr = new int[rowSize][columnSize];
    }

    public void enterValuesFromConsole() {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public void findFirstDiagonalElements()
    {
        System.out.print("1ci diqonal ");
        for (int i = 0; i < rowSize; i++)
        {
            for (int j = 0; j < columnSize; j++)
            {
                if (i == j)
                    System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }
    public void findSecondDiagonalElements()
    {
        System.out.print("2ci diaqonal ");
        for (int i = 0; i < rowSize; i++) {
            System.out.print(arr[i][rowSize-i-1] + " ");
        }
    }

}
