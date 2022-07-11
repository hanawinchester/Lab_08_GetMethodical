import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        double itemPrice;
        double total = 0;
        boolean b = true;
        do {
            Scanner in = new Scanner(System.in);
            itemPrice = SafeInput.getRangedDouble(in, "Please input the price of your item: ", 0.50, 9.99);
            total = total + itemPrice;
            Scanner in1 = new Scanner(System.in);
            b = SafeInput.getYNConfirm(in1, "Continue shopping? ");
        }while(!b);
        System.out.printf("Your total item cost is: $ %.2f", total);
    }
}
