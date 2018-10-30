public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(72,30));
        System.out.println(getDurationString(-1,45));
        System.out.println(getDurationString(2,-1));
        System.out.println(getDurationString(61,0));
        System.out.println(getDurationString(142));
        System.out.println(getDurationString(3600));

    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || ((seconds < 0) || (seconds >= 60))) {
            return "Invalid Value";
        }

        int hours = minutes / 60;
        minutes = minutes % 60;
        return hours + "h " + minutes + "m " + seconds + "s.";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid Value";
        }

        int minutes = seconds / 60;
        seconds = seconds % 60;
        return getDurationString(minutes, seconds);
    }

}

