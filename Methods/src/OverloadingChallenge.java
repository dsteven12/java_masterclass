public class OverloadingChallenge {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCm(6, 0));
        System.out.println(calcFeetAndInchesToCm(7,5));
        System.out.println(calcFeetAndInchesToCm(-1,1));
        System.out.println(calcFeetAndInchesToCm(1,-1));
        System.out.println(calcFeetAndInchesToCm(157));
        System.out.println(calcFeetAndInchesToCm(26));

    }

    public static double calcFeetAndInchesToCm(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) && (inches > 12))) {
                System.out.println("Invalid feet or inches parameters!");
                return -1;
        }

        double cm = ((feet * 12) + inches) * 2.54;
        return cm;

    }

    public static double calcFeetAndInchesToCm(double inches) {
        if (inches < 0) {
            System.out.println("Invalid inches parameter!");
            return -1;
        }

        double cm = inches * 2.54;
        return cm;
    }
}

