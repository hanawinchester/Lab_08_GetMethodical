public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        double F;
        for (int col=-100; col<=100; col++)
        {
            F = CtoF(col);
            System.out.printf("%-20.5s %-20.7s%n", col, F);
        }
    }

    public static double CtoF(double Celsius)
    {
        double Fahrenheit;
        Fahrenheit = Celsius * 9/5 + 32;
        return Fahrenheit;
    }
}
