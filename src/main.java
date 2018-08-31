import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int userChoice;


        do {
            System.out.println("Choose an item from the list below: ");
            System.out.println("------------------------------------");
            System.out.println("1.  Rat Pinky");
            System.out.println("2.  Rat Pup");
            System.out.println("3.  Weaned Rat");
            System.out.println("4.  Small Rat");
            System.out.println("5.  Medium Rat");
            System.out.println("5.  Large Rat");
            userChoice = userInput.nextInt();
        } while (userChoice != 1 && userChoice != 2 && userChoice != 3 && userChoice != 4 && userChoice != 5);

        switch (userChoice) {
            case 1:
                System.out.println("You chose a Rat Pinky");
                break;
            case 2:
                System.out.println("You chose a Rat Pup");
                break;
            case 3:
                System.out.println("You chose a Weaned Rat");
                break;
            case 4:
                System.out.println("You chose a Small Rat");
                break;
            case 5:
                System.out.println("You chose a Medium Rat");
                break;
            case 6:
                System.out.println("You chose a Large Rat");
                break;
            default:
                System.out.println("Happy feeding!");
                break;
        }
    }
    }
