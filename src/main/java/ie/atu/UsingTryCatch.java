package ie.atu;
import java.util.InputMismatchException;
import java.util.Scanner;
public class UsingTryCatch {
    public static void main(String[] args) {
        keepGoing();
    }

    public static void keepGoing()
    {

    try

    {
        System.out.println("Please enter a number between 0 - 9:");
        Scanner myscan = new Scanner(System.in);
        int myNum = myscan.nextInt();
        if(myNum <= 9 && myNum > 0) {
            System.out.println("You entered " + myNum);
        }
        else {
            System.out.println("Not a valid number");
            keepGoing();
        }

        }


      catch(InputMismatchException e)

    {
        System.out.println("Error caught");
        keepGoing();
    }
    }

}

