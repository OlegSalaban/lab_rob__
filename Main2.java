import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N > ");
        int n = scanner.nextInt();

        int d1 = n % 10;
        int d2 = n / 10 % 10;
        int d3 = n / 100;

        if(d1 >= d2 && d1 >= d3){
            System.out.println("Max: " + d1);
        }else if(d2 >= d3){
            System.out.println("Max: " + d2);
        }else{
            System.out.println("Max: " + d3);
        }

        scanner.close();
    }
}
