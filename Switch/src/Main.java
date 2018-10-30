public class Main {
    public static void main(String[] args) {
        System.out.println(newTest(3));
        System.out.println(newTest("B"));
        System.out.println(newTest("F"));

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
}
