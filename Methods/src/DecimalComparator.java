public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // return true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); // return false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); // return true
    }


    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        num1 = (int)(num1 * 1000);
        num2 = (int)(num2 * 1000);

        if(num1 == num2) {
            return true;
        }
        return false;
    }
}
