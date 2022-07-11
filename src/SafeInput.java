import java.util.Scanner;

public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    public static int getInt(Scanner pipe, String prompt)
    {
        boolean done = false;
       int retInt = 0;
       String trash = "";
        do
        {
            Scanner in = new Scanner(System.in);
            System.out.print("\n" + prompt + ": ");
            if (in.hasNextInt())
            {
                retInt = in.nextInt();
                done = true;

            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid integer. Please enter an integer.");
                //retInt = pipe.nextInt();
            }

        } while (!done);
        return retInt;
    }


    public static double getDouble(Scanner pipe, String prompt)
    {
        boolean done = false;
        double retDouble = 0;
        String trash1 = "";
        do
        {
            Scanner in = new Scanner(System.in);
            System.out.print("\n" + prompt + ": ");
            if (in.hasNextDouble())
            {
                retDouble = in.nextDouble();
                done = true;

            }
            else
            {
                trash1 = in.nextLine();
                System.out.println(trash1 + " is not a valid double. Please enter a double.");
                //retInt = pipe.nextInt();
            }

        } while (!done);
        return retDouble;
    }


    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        boolean done = false;
        int retRangedInt = 0;
        String trash2 = "";
        do
        {
            Scanner in = new Scanner(System.in);
            System.out.print("\n" + prompt + " [in range " + low + "-" + high + " inclusive]: ");
            if (in.hasNextInt())
            {
                retRangedInt = in.nextInt();
                if (retRangedInt >= low && retRangedInt <= high)
                {
                    done = true;
                }
                else
                {
                    trash2 = in.nextLine();
                    System.out.println("Int " + trash2 + " is not in range [" + low + "-" + high + " inclusive].");
                }
            }
            else
            {
                trash2 = in.nextLine();
                System.out.println(trash2 + " is not a valid number. Please enter a valid number.");
                //retInt = pipe.nextInt();
            }

        } while (!done);
        return retRangedInt;
    }



    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        boolean done = false;
        double retRangedDouble = 0;
        String trash3 = "";
        do
        {
            Scanner in = new Scanner(System.in);
            System.out.print("\n" + prompt + " [in range " + low + "-" + high + " inclusive]: ");
            if (in.hasNextDouble())
            {
                retRangedDouble = in.nextDouble();
                if (retRangedDouble >= low && retRangedDouble <= high)
                {
                    done = true;
                }
                else
                {
                    trash3 = in.nextLine();
                    System.out.println("Double " + trash3 + " is not in range [" + low + "-" + high + " inclusive].");
                }
            }
            else
            {
                trash3 = in.nextLine();
                System.out.println(trash3 + " is not a valid Double. Please enter a valid Double.");
                //retInt = pipe.nextInt();
            }

        } while (!done);
        return retRangedDouble;
    }


    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String playAgain = "";
        boolean answer = false;
        String trash4 = "";
        String done5 ="false";
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("\n" + prompt + ": ");
           if (in.hasNextLine()) {
            playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("Y"))
                {
                    answer = true;
                    done5 = "false";
                }
                else if (playAgain.equalsIgnoreCase("N"))
                {
                    answer = true;
                    done5 = "true";

                }}
               // else
                //{
                    //trash4 = in.nextLine();
                  //  System.out.println(trash4 + " is not a valid answer.");
                  //  answer = false;
                //}

            // else
            //  {
            //     trash4 = in.nextLine();
            //    System.out.println(trash4 + " is not a valid answer Please choose Y or N.");
            //     //retInt = pipe.nextInt();
            // }

        } while (!answer);
        return Boolean.parseBoolean(done5);

    }


    public static String getRegExString(Scanner pipe, String prompt, String regExPattern)
    {
        String value = "";
        boolean gotAValue = false;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println(prompt + ": ");
            value = in.nextLine();
            if (value.matches(regExPattern)){
                gotAValue = true;
            }
            else {
                System.out.println("\ninvalid input: " + value);
            }
        } while (!gotAValue);
        return value;
    }

    public static void prettyHeader(String msg)
    {
        String rowOne = "";
        int msgLength;
        int halfSpacesNum;
        String rowTwoSpaces = "";
        for (int col=0; col<=60; col++)
        {
            rowOne = rowOne + "*";
        }
        System.out.println(rowOne);
        msgLength = msg.length();
        halfSpacesNum = (54 - msgLength)/2;
        for (int col=0; col<= halfSpacesNum; col++)
        {
            rowTwoSpaces = rowTwoSpaces + " ";
        }

        System.out.println("***" + rowTwoSpaces + msg + rowTwoSpaces + "***");
        System.out.println(rowOne);
    }

}
