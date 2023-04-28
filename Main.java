import java.util.Scanner;
class Main {
   public static void main(String[] args) 
   {  
      final int QUARTS_IN_GALLON = 4;
      float quartsNeeded = 18;
      float gallonsNeeded;
      float extraQuartsNeeded;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter quarts needed >> ");
      while (!input.hasNextFloat()) {
         System.out.println("Invalid input. Please enter a numeric value.");
         input.next();
      }
      quartsNeeded = input.nextFloat();
      gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
      extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
      System.out.println("A job that needs " + quartsNeeded +
         " quarts requires " + gallonsNeeded + " gallons plus " +
         extraQuartsNeeded + " quarts.");
   }
}
