import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        String SSN;
        String UCId;
        String menuChoice;

        Scanner in = new Scanner(System.in);
        //for some reason "\\d(3)-\\d(2)-\\d(4)" was not working, so I had to do some googling to figure out what would work. This one also has more parameters for what doesn't work!
        SSN = SafeInput.getRegExString(in, "Enter your SSN", "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$");

        Scanner in1 = new Scanner(System.in);
        UCId = SafeInput.getRegExString(in1, "Enter your UC student Id", "(M|m)\\d{5}");

        Scanner in2 = new Scanner(System.in);
        menuChoice = SafeInput.getRegExString(in2, "Enter a menu choice (O, S, V, Q)", "[OoSsVvQq]");

        System.out.println("SSN: " + SSN);
        System.out.println("UC Student Id: " + UCId);
        System.out.println("Menu Choice: " + menuChoice);
    }
}
