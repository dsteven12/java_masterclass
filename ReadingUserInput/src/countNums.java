import java.util.Scanner;

public class countNums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(counter != 10) {
            int order = counter + 1;
            System.out.print("Enter number #" + order + ": ");

            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int num = scanner.nextInt();
                counter++;
                sum += num;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("The sum is " + sum);
        scanner.close();
    }
}
