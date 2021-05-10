import java.util.Scanner;
public class Execute
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("To EnCode press 1");
        System.out.println("To DeCode press 2");
        System.out.print("Choice : ");
        int choice = scn.nextInt();
        scn.nextLine();
        String st;
        switch(choice)
        {
            case 1 :
            System.out.println("Enter a String ");
            st = scn.nextLine();
            EncoderAndDecoder.OK.encodeThis(st);
            break;

            case 2:
            System.out.println("Enter a String ");
            st = scn.nextLine();
            EncoderAndDecoder.OK.decodeThis(st);
            break;

            default :
            System.out.println("Invalid choice!!!");
            scn.close();
        }

    }
}
