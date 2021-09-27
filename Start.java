import java.util.Scanner;
/**
 * The class from which the execution must start.
 * @author   Abhishek Yadav 10C
 * @since    24th September 2021
 * @version  2.0.21
 */
public class Start
{
    /**
     * The main method.
     * Execution starts here.
     * @param args To receive the command line arguments.
     */
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("To EnCode press 1");
        System.out.println("To DeCode press 2");
        System.out.print("Choice : ");
        int choice = scn.nextInt();
        scn.nextLine();
        String st;
        switch (choice) {
            case 1 -> {
                System.out.println("Enter a String ");
                st = scn.nextLine();
                EncoderAndDecoder.OK.encodeThis(st);
            }
            case 2 -> {
                System.out.println("Enter a String ");
                st = scn.nextLine();
                EncoderAndDecoder.OK.decodeThis(st);
            }
            default -> {
                System.out.println("Invalid choice!!!");
                scn.close();
            }
        }

    }
}
