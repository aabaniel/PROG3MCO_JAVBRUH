/************************************************************************************************************************

This is to certify that this project is our own work, based on our personal efforts in studying and 
applying the concepts learned. We have constructed the functions and their respective algorithms 
and corresponding code by ourselves. The program was run, tested, and debugged by our own efforts. 
We further certify that we have not copied in part or whole or otherwise plagiarized the work of other
students and/or persons. 

Aaron Abaniel, 	            12206350
Gian Blasco,                122 - - -
 
************************************************************************************************************************/
import java.lang.Thread;
import java.io.*;
import java.util.*;

/*
implementation for MCO1:
Phase 1:
Features:
All EL1 Creatures (9 creatures)
Inventory System
Areas Functionality, but only including AREA 1
Text Based output simulation of the features
*/

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// START OF CODE START OF CODE START OF CODE START OF CODE START OF CODE START OF CODE START OF CODE START OF CODE STA //
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  


class Main {
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
private static void loading()
  {
      try {
        System.out.print("Loading: ");
        for(int i = 0; i < 10;i++) {
          System.out.print("*");
          Thread.sleep(100);
        }
            System.out.println("\n\nCOMPLETE! ");

              Thread.sleep(2000);
      System.out.print("\033\143");
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
  }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
private static void iScreen()
  {
    System.out.println("eeeee   eeeee   eeeeeee   eeee ");
    System.out.println("8   8   8   8   8  8  8   8    ");
    System.out.println("8e      8eee8   8e 8  8   8eee ");
    System.out.println("88 '8   88  8   88 8  8   88   ");
    System.out.println("88ee8   88  8   88 8  8   88ee \n");
  }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
private static void mStarter()
  {
    System.out.println("--------------------- PICK A STARTER SLAV ---------------------");

    System.out.println("1. racist");
    System.out.println("2. femboy");
    System.out.println("3. dead");

    System.out.println("---------------------------------------------------------------");
      boolean cChoice = false;
      Scanner sc = new Scanner(System.in);

      while(!cChoice)
      {
          System.out.print("Enter your choice: ");
          String choice = sc.nextLine();
          switch(choice)
          {
              case "1": 
                  System.out.println("You Chose Racist!");
                  cChoice = true;
                  
                  //call main method wooww like so slay ong like giving no icks yyou thought i was feelin u 
                  
                  break;
              case "2":
                  System.out.println("You Chose Femboy!");
                  cChoice = true;
                  break;
              case "3":
                  System.out.println("You Chose Dead!");
                  cChoice = true;
                  break;

              default:
                  System.out.println("Enter a number between 1-3");
          }
      }

      //sc.close();
    System.out.println("---------------------------------------------------------------");
  }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  private static void mScreen()
  {
    System.out.println("\n-------------------------- MAIN MENU --------------------------");

    System.out.println("[1] Inventory");
    System.out.println("[2] Explore Area");
    System.out.println("[3] Show Evolution");
    System.out.println("[4] End the world");

    System.out.println("---------------------------------------------------------------");
      boolean cChoice = false;
      Scanner sac = new Scanner(System.in);
     

      while(!cChoice)
      {
          System.out.print("Enter your choice: ");
          String choice = sac.nextLine();
          switch(choice)
          {
              case "1": 
                  System.out.println("Going to Inventory");
                  cChoice = true;
                  //like instantiaziete
                  break;
              case "2":
                  System.out.println("Going to Explore Area!");
                  cChoice = true;
                  //like instantiaziete
                  break;
              case "3":
                  System.out.println("Going to Show Evolution!");
                  cChoice = true;
                  //like instantiaziete
                  break;
              case "4":
                  System.out.println("Deleting current playthrough. . .");
                  loading();
                  System.exit(0);

              default:
                  System.out.println("Enter a number between 1-4");
          }
      }
      sac.close();

      
  }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public static void main(String[] args) {
    iScreen();
    loading();
    mStarter();
    loading();
    mScreen();

    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// END OF CODE END OF CODE END OF CODE END OF CODE END OF CODE END OF CODE END OF CODE END OF CODE END OF CODE END OF  //
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
