import java.util.Scanner;

public class newMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number #1: ");
        boolean hasNextInt = scanner.hasNextInt();

        int total = scanner.nextInt();

        if(hasNextInt) {
            for (var i = 2; i < 11; i++) {
                System.out.print("Enter a number #" + i + ": ");
                total += scanner.nextInt();
            }
        } else {
                System.out.println("Invalid Number");
        }
        System.out.println("The sum is " + total);

        scanner.close();
        }
}

