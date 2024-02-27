import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a Grade Calculator.\tEnter Your Marks and know your Grade:");
        int score = -1;
        try {
            score = input.nextInt();
        } catch (Exception e) {
        }
        input.close();

        switch ((score <= 100 & score >= 0) ? score / 10 : -1) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            case 5:
                System.out.println("Grade: A");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Grade: A");
                break;
            default:
                System.out.println("Please Enter an Integer Value Between 0-100");
                break;
        }
    }
}
