package SecondsAndMinutesChallenge;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(150, 25));
        System.out.println(getDurationString(185));

    }

    public static String getDurationString(int minutes, int seconds) {

        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            return "Invalid value";
        }
        long hours = minutes / 60;
        long remainMinutes = minutes % 60;
        return hours + "h " + remainMinutes + "m " + seconds + "s";


    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        long minutes = seconds / 60;
        long remainSeconds = seconds % 60;
        return minutes + "m " + remainSeconds + "s";
    }

}
