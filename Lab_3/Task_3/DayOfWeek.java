import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the day (1-7) and we will tell you its name.");
        int day = -1;

        try {
            day = input.nextInt();
        } catch (Exception e) {
        }

        input.close();
        System.out.println(method(day));

    }

    public static String method(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Out-Of-Range Error: Please enter an Integer Between 1-7. ";
        }
    }
}
