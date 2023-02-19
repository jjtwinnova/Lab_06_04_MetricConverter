import java.util.Scanner;
public class metric {
    public static void main(String[] args)
    {
        //Declare Variables
        Scanner in = new Scanner(System.in);
        double meter = 0;
        String trash;

        //Get input
        System.out.print("Enter your measurement in meters: ");
        if (in.hasNextDouble()) {
            // OK safe to read in a double
            meter = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        } else {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("You said your distance was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);

        }

        //Declare New Variables and Print

        double miles = meter / 1609.344;

        double feet = meter * 3.28084;

        double inches = feet * 12;

        System.out.print("Your conversion is " + miles + " in miles, " + feet + " in feet, and " + inches + " in inches.");
    }
}