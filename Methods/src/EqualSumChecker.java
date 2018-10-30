public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1)); // return false
        System.out.println(hasEqualSum(1,1,2)); // return true
        System.out.println(hasEqualSum(1,-1,0)); // return true
    }


    public static boolean hasEqualSum(int int1, int int2, int int3) {
        if((int1 + int2) == int3) {
            return true;
        }
        return false;
    }
}
