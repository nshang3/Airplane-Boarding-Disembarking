package LA5Q;
import java.util.*;
/**
 This driver method has a user-friendly interface as it clearly provides the functions of the application
 in a simple menu. It takes into account of incorrect integer input and asks the user to enter again.
 **/

/**
 OVERALL LIMITATIONS/CONSTRAINTS
 The application does not take into account of passengers that need special needs, i.e. seniors.
 Thus, the application could be improved by potentially using 2 other stacks.
 A prioritized stack for special needs where a condition of a certain age filters out the passengers, and
 the new stack that takes the elements from both stacks, with the prioritized stack pushed last.
 Moreover, the user interface does not take into account of inputMismatch
 and could utilize a try catch block.
 Finally, the user interface face could be improved by using a JOptionsPanel for a cleaner look.
 **/

/**
 O(n) COMPLEXITY
 The overall time complexity is O(n) due to the do while loop where the user could enter multiple data.
 The overall space complexity is O(n) since the passenger class can have multiple instances that are
 pushed into the stack
 **/
public class BoardDisembarkSim {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int user;

        BoardDisembark airplane = new BoardDisembark();

        do {
            System.out.println("\nMain Menu: Boarding Application ");
            System.out.println("\t1: Board Passengers\n\t2: Disembark Passengers\n\t3: Exit");
            System.out.print("\tEnter your choice: ");
            user = keyboard.nextInt();

            switch(user){

                case 1:

                    System.out.println("\nBoarding passengers...");

                        System.out.print("Enter name ");
                        keyboard.nextLine();
                        String name = keyboard.nextLine();

                        System.out.print("Enter seat number ");
                        int seatNum = keyboard.nextInt();

                        System.out.print("Enter age ");
                        int age = keyboard.nextInt();

                        airplane.boardPassengers(new Passenger(name,seatNum, age));

                        System.out.printf("%s aged %d is now sitting at seat %d\n", name, age, seatNum);
                        System.out.println(airplane.toString());
                break;

                case 2:
                    System.out.println("Disembarking Passengers...");

                        if(airplane.checkEmptyPlane()){
                            System.out.println("The plane is empty");
                        } else {
                    Passenger leavingPassenger = airplane.disembarkPassengers();

                    System.out.println(leavingPassenger + " seat is empty");
                    System.out.println(airplane.toString());
                }
                break;

                case 3:
                    System.out.println("\nExiting Application");
                break;

                default:
                    System.out.println("\nInvalid choice, enter 1, 2 or 3");
            }
        }
        while (user != 3);

    }
}
