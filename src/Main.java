public class Main {
    public static void main(String[] args)

    {
        int numberOne = 3;
        int numberTwo = 4;

        if (numberOne == numberTwo)

        {
            System.out.println("Number One and Number Two are the same number!");
        }

        else if (numberOne > numberTwo)
        {
            System.out.println("Number Two is less than Number One!");
        }

        else if (numberOne < numberTwo)
        {
            System.out.println("Number One is less than Number Two!");
        }

        else
        {
            System.out.println("Invalid input. Please input an integer.");
        }


    }
}