package LA5Q;
import java.util.*;

/**
 The application requires a simulation of people boarding and disembarking from a plane.
 Usually, passengers entering first will be the last to leave, in other words, the last to enter
 the plane are the passengers that leave first. The passengers entering last will naturally
 be at the front of the plane, and closer to the forward cabin door.
 **/

/**
 As a result of this natural order of boarding/disembarking planes, it is intuitive to use
 a stack data structure which is a linear data structure. A stack data structure
 follows the principle of first in last out which follows how disembarking planes work, assuming that
 the jet gate links to the forward cabin door.
 **/

/**
 Using the ADTs and the concrete Stack class from the Collections interface in java is practical
 since overriding pre-exisitng methods from Stack class is easier to read and requires less code writing.**/

/**
 The time complexity of boardPassengers(), disembarkPassengers() have time complexity
 O(1) since they are just adding/removing elements. The size of the stack is not
 dependent on these direct operations.
 checkEmptyPlane() and toString() have time complexity O(n) since they iterate through the stack
 and worst case, go through the entire stack. Therefore, overall the time complexity is O(n)
 **/

/**
 The space complexity is dominated by boardPassengers() and toString(),
 which are both O(n) since they are proportional to the number of items in the stack.
 boardPassengers() assigns data to the stack, and thus, depends on how much data is inserted.
 toString() iterates through the entire stack with all the data items and this is also O(n).
 **/
public class BoardDisembark extends Stack<Passenger>{
   Stack<Passenger> airplaneSeats;//create a Stack ref with Passenger generic parameter
   //This ref will be used for all methods
   public BoardDisembark(){
      airplaneSeats = new Stack<>();//constructor that creates a new Stack
   }
   public Passenger boardPassengers (Passenger seat){
      Passenger newPassenger = seat;
      airplaneSeats.push(newPassenger);
      return newPassenger;}//using the push method from Stack
   public Passenger disembarkPassengers (){
      Passenger removePassenger;
      removePassenger = airplaneSeats.pop();//using the pop method from Stack
      return removePassenger;
   }
   public boolean checkEmptyPlane(){
      return airplaneSeats.empty();
      //used to prevent executing the disembarkPassenger when there is no passengers in the plane
   }

   public String toString(){
      String list ="";
      for (int i=0; i < airplaneSeats.size(); i++){//iterate through the stack, until the size is reached
         list += airplaneSeats.get(i);//get method from Vector returns the object in the Stack

      }

   return String.format("Here are the passenger/s on the plane: %s", list);
   }

}
