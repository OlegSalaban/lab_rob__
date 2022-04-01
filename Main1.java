import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть N > ");
        int n = scanner.nextInt();

        if(n > 50 && n < 100) {
            System.out.println("Число " + n + " міститься в проміжку (50; 100)");
        }else{
            System.out.println("Число " + n + " не міститься в проміжку (50; 100)");
        }

        scanner.close();
    }
}
