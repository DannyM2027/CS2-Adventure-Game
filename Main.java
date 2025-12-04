import java.util.Scanner;
public class Main {

   public static void main(String []args) {
      System.out.println("Starting a new adventure...\n");
       String command = ""; // stores the user's choices
       // STEP #1: Describe the scenario scene
   System.out.println("You are in spongebobs house");
   // STEP #2: Get user command (prompt & take input)
   command = getCommand("Do you leave his house? (yes or no)") ;
   // STEP #3: Process user command (choose a path)
   if (command.equals("yes")) {
     System.out.println("you have left the pinapple");
     command = getCommand("Go left or right?");
      if (command.equals("left")) {
         System.out.println("You have reached an intersection");
         command = getCommand("Go up or down?");
            if (command.equals("up")) {
               System.out.println("You are now in the Krusty krab, cook or leave?");
            }
            else if (command.equals("down")) {
               System.out.println("YOu have arrived at the chum bucket");
            } 
      }
      else if ("right") {
         System.out.println("You have reached an intersection");
         
      }
   }
   else {
      System.out.println("Too bad you dont have a choice");
   }
    
    
} // END OF MAIN METHOD
    
    /** Method to prompt & process input for the next command
      * @param prompt to display to user, asks for specific input
      * @return user's input command as a lowercase String
    */
    public static String getCommand(String prompt) 
    {
       System.out.println("\n▶︎▶︎▶︎ " + prompt);
       Scanner scan = new Scanner(System.in);
       String command = scan.nextLine().toLowerCase();
       return command;
   }
}
