import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner userName = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = userName.nextLine();
        userName.close();
        System.out.println("Hello " + name + "!");
    }
}
