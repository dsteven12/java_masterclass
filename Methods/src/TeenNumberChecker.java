public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        boolean state = false;

        if((age1 >= 13) && (age1 <= 19)) {
            state = true;
        } else if ((age2 >= 13) && (age2 <= 19)) {
            state = true;
        } else if((age3 >= 13) && (age3 <= 19)) {
            state = true;
        }
        return state;
    }
}
