import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        int favInt;
        double favDouble;
        Scanner in = new Scanner(System.in);
        favInt = SafeInput.getInt(in, "Please enter your favorite integer.");
        Scanner in1 = new Scanner(System.in);
        favDouble = SafeInput.getDouble(in1, "Please enter your favorite double!");
        System.out.println("Your favorite integer is " + favInt);
        System.out.println("Your favorite double is " + favDouble);
    }
}
