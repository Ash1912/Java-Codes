//Program to print the corresponding week day for the given day no. of the current month using switch...case statement in java.
import java.util.Scanner;
public class weekday {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weekday no. :");
        int weekday = scan.nextInt();
        switch (weekday) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default :
            System.out.println("Invalid Number");
            break;
        }
    }
    
}
