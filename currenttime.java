public class currenttime {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();

        long totalSecond = totalMilliseconds/1000;
        long currentSecond = totalMilliseconds%60;
        long totalMinutes = totalSecond/60;
        long currentMinutes = totalMinutes%60;
        long totalHour = totalMinutes/60;
        long currentHour =totalHour%24;

        System.out.println("current time is "+ currentHour+":"+currentMinutes+":"+currentSecond+"GMT");
    }
}
