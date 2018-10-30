public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if((barking == true) && (hourOfDay < 8) && (hourOfDay >= 0)) {
            barking = true;
        } else if ((barking == true) && (hourOfDay > 22) && (hourOfDay <= 23)) {
            barking = true;
        } else
            barking = false;
        return barking;
    }
}
