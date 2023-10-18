/************************************************************************************************************************

This is to certify that this project is our own work, based on our personal efforts in studying and 
applying the concepts learned. We have constructed the functions and their respective algorithms 
and corresponding code by ourselves. The program was run, tested, and debugged by our own efforts. 
We further certify that we have not copied in part or whole or otherwise plagiarized the work of other
students and/or persons. 

Aaron Abaniel, 	            12206350
Gian Blasco,                12205397
 
************************************************************************************************************************/
import java.lang.Thread;
import java.util.*;


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// START OF CODE START OF CODE START OF CODE START OF CODE START OF CODE START OF CODE START OF CODE START OF CODE STA //
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  


class Main {
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
 class main: Contains the main screens and utilizes all other classes 
 
 */
static ArrayList<Creature> creaturesList = new ArrayList<Creature>(); 
static ArrayList<Creature> allCreatures = new ArrayList<Creature>(); 

private static void initializeCreatures(){
  /*
   initializeCreatures: sets the creatures for the enemy pool
   */
  
     Creature Strawander = new Creature();
     Strawander.setcName("Strawander");
     Strawander.setcType("Fire");
     Strawander.setcFam("Family A");
     Strawander.setcHealth(50);
     Strawander.setcEvLvl(1);
     Strawander.setIsActive(false);
     Strawander.setIsEnemy(true);

    allCreatures.add(Strawander);


     Creature Chocowool = new Creature();
     Chocowool.setcName("Chocowool");
     Chocowool.setcType("Fire");
     Chocowool.setcFam("Family B");
     Chocowool.setcHealth(50);
     Chocowool.setcEvLvl(1);
     Chocowool.setIsActive(false);
     Chocowool.setIsEnemy(true);

    allCreatures.add(Chocowool);

     Creature Parfwit = new Creature();
     Parfwit.setcName("Parfwit");
     Parfwit.setcType("Fire");
     Parfwit.setcFam("Family C");
     Parfwit.setcHealth(50);
     Parfwit.setcEvLvl(1);
     Parfwit.setIsActive(false);
     Parfwit.setIsEnemy(true);

    allCreatures.add(Parfwit);

     Creature Brownisaur = new Creature();             
     Brownisaur.setcName("Brownisaur");
     Brownisaur.setcType("Grass");
     Brownisaur.setcFam("Family D");
     Brownisaur.setcHealth(50);
     Brownisaur.setcEvLvl(1);
     Brownisaur.setIsActive(false);
     Brownisaur.setIsEnemy(true);

     allCreatures.add(Brownisaur);


     Creature Frubat = new Creature();             
     Frubat.setcName("Frubat");
     Frubat.setcType("Grass");
     Frubat.setcFam("Family E");
     Frubat.setcHealth(50);
     Frubat.setcEvLvl(1);
     Frubat.setIsActive(false);
     Frubat.setIsEnemy(true);

     allCreatures.add(Frubat);

     Creature Malts = new Creature();             
     Malts.setcName("Malts");
     Malts.setcType("Grass");
     Malts.setcFam("Family F");
     Malts.setcHealth(50);
     Malts.setcEvLvl(1);
     Malts.setIsActive(false);
     Malts.setIsEnemy(true);

     allCreatures.add(Malts);

     Creature Squirpie = new Creature();
    Squirpie.setcName("Squirpie");
    Squirpie.setcType("Water");
    Squirpie.setcFam("Family G");
    Squirpie.setcHealth(50);
    Squirpie.setcEvLvl(1);
    Squirpie.setIsActive(false);
    Squirpie.setIsEnemy(true);

    allCreatures.add(Squirpie);


    Creature Chocolite = new Creature(); 
    Chocolite.setcName("Chocolite");
    Chocolite.setcType("Water");
    Chocolite.setcFam("Family H");
    Chocolite.setcHealth(50);
    Chocolite.setcEvLvl(1);
    Chocolite.setIsActive(false);
    Chocolite.setIsEnemy(true);

    allCreatures.add(Chocolite);

    Creature Oshacone = new Creature();
    Oshacone.setcName("Oshacone");
    Oshacone.setcType("Water");
    Oshacone.setcFam("Family I");
    Oshacone.setcHealth(50);
    Oshacone.setcEvLvl(1);
    Oshacone.setIsActive(false);
    Oshacone.setIsEnemy(true);

    allCreatures.add(Oshacone);
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


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
      System.out.print("\033\143"); ///////////////
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
  }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
private static void iScreen()
/*
  iScreen: The intro screen to show title 
 
*/
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
/*
mStarter: The screen to let the user choose their starter foodemon out of three choices

*/
  {
    System.out.println("--------------------- PICK A STARTER FOODEMON ---------------------");

    System.out.println("1. Chocowool");
    System.out.println("2. Frubat");
    System.out.println("3. Chocolite");

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
                  System.out.println("You Chose Chocowool!");
                  cChoice = true;
                  Creature Chocowool = new Creature();
                  
                  Chocowool.setcName("Chocowool");
                  Chocowool.setcType("Fire");
                  Chocowool.setcFam("Family B");
                  Chocowool.setcHealth(50);
                  Chocowool.setcEvLvl(1);
                  Chocowool.setIsActive(true);
                  Chocowool.setIsEnemy(false);

                  creaturesList.add(Chocowool);
                  System.out.print("\033\143");
                  
                  break;
              case "2":
                  System.out.println("You Chose Frubat!");
                  cChoice = true;
                  Creature Frubat = new Creature();
                  
                  Frubat.setcName("Frubat");
                  Frubat.setcType("Grass");
                  Frubat.setcFam("Family B");
                  Frubat.setcHealth(50);
                  Frubat.setcEvLvl(1);
                  Frubat.setIsActive(true);
                  Frubat.setIsEnemy(false);

                  creaturesList.add(Frubat);
                  System.out.print("\033\143");
                  break;
              case "3":
                  System.out.println("You Chose Chocolite!");
                  cChoice = true;
                  Creature Chocolite = new Creature();
                  
                  Chocolite.setcName("Chocolite");
                  Chocolite.setcType("Water");
                  Chocolite.setcFam("Family B");
                  Chocolite.setcHealth(50);
                  Chocolite.setcEvLvl(1);
                  Chocolite.setIsActive(true);
                  Chocolite.setIsEnemy(false);

                  creaturesList.add(Chocolite);
                  System.out.print("\033\143");
                  
                  break;

              default:
                  System.out.println("Enter a number between 1-3");
          }
      }

      
    System.out.println("---------------------------------------------------------------");
  }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  private static void mScreen()
  /*
    mScreen: The main menu screen of the game, where the user can select from 4 choices to move to a seperate screen or exit.  
  */
  {

      boolean cChoice = false;
      Scanner sac = new Scanner(System.in);
      inventory inv = new inventory();
      Area explore = new Area();

      while(!cChoice)
      {
              System.out.print("\033\143"); 
              System.out.println("\n-------------------------- MAIN MENU --------------------------");

              System.out.println("[1] Inventory");
              System.out.println("[2] Explore Area");
              System.out.println("[3] Show Evolution");
              System.out.println("[4] End the world");

              System.out.println("---------------------------------------------------------------");
              
          System.out.print("Enter your choice: ");
          String choice = sac.nextLine();
          switch(choice)
          {
              case "1": 
                  System.out.println("Going to Inventory!");
                  System.out.print("\033\143");
                  inv.getInventoryInput(creaturesList);
                  
                  break;
              case "2":
                  System.out.println("Going to Explore Area!");
                  System.out.print("\033\143");
                  explore.userMove(creaturesList, allCreatures, inv);
                  break;
              case "3":
                  System.out.println("Going to Show Evolution!");
                  System.out.println("Only Available in Phase 2! Purchase the DLC to unlock");
                  System.out.print("\033\143");
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
    initializeCreatures();

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
