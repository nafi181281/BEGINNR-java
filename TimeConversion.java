import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int hours = N / 3600;
        N %= 3600;
        int minutes = N / 60;
        int seconds = N % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
