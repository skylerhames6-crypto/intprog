import java.util.Scanner;
public class Timebreaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Value in Seconds: ");

        long totalSeconds = scanner.nextLong();
        long hours = totalSeconds / 3600;
        long remainingSecondsAfterHours = totalSeconds % 3600;
        long minutes = remainingSecondsAfterHours / 60;
        long seconds = remainingSecondsAfterHours % 60;

        System.out.println("\nHour(s): " + hours);
        System.out.println("Minute(s): " + minutes);
        System.out.println("Second(s): " + seconds);

        scanner.close();
    }
}
