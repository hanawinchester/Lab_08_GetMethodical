import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args)
    {
        String message = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a message for your pretty header: ");
        message = in.nextLine();

        SafeInput.prettyHeader(message);
    }
}
