
import java.util.Scanner;

public class MultidimensionalClass {
    private int rawSize;
    private int columnSize;
    private int[][] array;

    public MultidimensionalClass() {
        // Kullanıcıdan rawSize ve columnSize değerlerini al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sütun (column) sayısını girin: ");
        this.columnSize = scanner.nextInt();
        System.out.print("Sıra (row) sayısını girin: ");
        this.rawSize = scanner.nextInt();
        scanner.close();

        // Eğer sütun ve sıra sayıları farklı ise hata mesajı ver ve işlemi sonlandır
        if (rawSize != columnSize) {
            System.out.println("Sütun ve sıra sayıları aynı olmalıdır.");
            return;
        }

        // rawSize ve columnSize'a göre 2D diziyi oluştur
        array = new int[rawSize][columnSize];
    }

    // Diziyi doldurmak için bir metot ekleyebilirsiniz
    public void fillArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2D diziyi doldurun:");
        for (int i = 0; i < rawSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print("Dizi elemanını girin (" + i + ", " + j + "): ");
                array[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    // Diziyi görüntülemek için bir metot ekleyebilirsiniz
    public void printArray() {
        System.out.println("2D Dizi:");
        for (int i = 0; i < rawSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MultidimensionalClass multidimensionalClass = new MultidimensionalClass();
        if (multidimensionalClass.rawSize == multidimensionalClass.columnSize) {
            multidimensionalClass.fillArray();
            multidimensionalClass.printArray();
        }
    }
}
