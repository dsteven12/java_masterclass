public class Main {
    public static void main(String[] args) {
        System.out.println(newTest(3));
        System.out.println(newTest("B"));
        System.out.println(newTest("F"));
        printDayOfTheWeek(4);
        printDayOfTheWeek(-1);

        int count = 0;
        for(int i = 10; i < 50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println(i + " number is a prime number.");
                if(count == 3) {
                    break;
                }
            }
        }
        System.out.println("There are at least " + count + " prime numbers between 10 and 50");
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static String newTest(int val){
        String s;
        switch (val) {
            case 1: case 2: case 3:
                s = "Your Rank " + val;
                break;
            default:
                s = "Rank is undisclosed.";
                break;
        }
        return s;
    }

    public static String newTest(String val){
        String s;
        switch (val) {
            case "A": case "B": case "C": case "D": case "E":
                s = "Your grade is " + val;
                break;
            default:
                s = "Your grade is undisclosed.";
                break;
        }
        return s;
    }

    public static void printDayOfTheWeek(int day) {
        String dayOfWeek = "Invalid day selected.";
        if ((day < 0 || day > 6)) {
            System.out.println(dayOfWeek);
        } else {
            switch (day) {
                case 0:
                    dayOfWeek = "Sunday";
                    break;
                case 1:
                    dayOfWeek = "Monday";
                    break;
                case 2:
                    dayOfWeek = "Tuesday";
                    break;
                case 3:
                    dayOfWeek = "Wednesday";
                    break;
                case 4:
                    dayOfWeek = "Thursday";
                    break;
                case 5:
                    dayOfWeek = "Friday";
                    break;
                case 6:
                    dayOfWeek = "Saturday";
                    break;
                default:
                    dayOfWeek = "Invalid day";
                    break;
            }
            System.out.println("The day is " + dayOfWeek);
        }
    }
}
