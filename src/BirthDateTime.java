import java.util.Scanner;

public class BirthDateTime {
        public static void main(String[] args)
        {
            int year;
            int month;
            int hour;
            int minute;
            int date;

            Scanner in = new Scanner(System.in);
            year = SafeInput.getRangedInt(in, "Please input your birth year: ", 1950, 2010);

            Scanner in1 = new Scanner(System.in);
            month = SafeInput.getRangedInt(in1, "Please input your birth month: ", 1, 12);

            int daysInMonth = switch(month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> 29;
                default -> 31;
            };

            Scanner in4 = new Scanner(System.in);
            date = SafeInput.getRangedInt(in4, "Please input your birth date: ", 1, daysInMonth);

            Scanner in2 = new Scanner(System.in);
            hour = SafeInput.getRangedInt(in2, "Please input your birth hour: ", 1, 24);

            Scanner in3 = new Scanner(System.in);
            minute = SafeInput.getRangedInt(in3, "Please input your birth minute: ", 1, 59);

            System.out.println("Birth Year: " + year);
            System.out.println("Birth Month: " + month);
            System.out.println("Birth Date: " + date);
            System.out.println("Birth Hour: " + hour);
            System.out.println("Birth Minute: " + minute);

        }
}
