import java.util.*;

public class inventory {
    
    private String creatureInput; 

    public void getInventoryInput(ArrayList<Creature> creaturesList)
    /*
     getInventoryInput(creaturesList):Handles getting the user to choose where to move inside inventory
      
     */
    {
        boolean cChoice = false;
        Scanner sc = new Scanner(System.in);

      while(!cChoice)
      {
            System.out.println("---------------------------------------------------------------");
            System.out.println("[1] View Creatures");
            System.out.println("[2] Change Active Creature");
            System.out.println("[3] Exit Inventory");
            System.out.println("---------------------------------------------------------------");
          System.out.println("Enter your choice: ");
          String choice = sc.nextLine();
          

          switch(choice)
          {
              case "1": 
                  showCreatures(creaturesList);
                  break;
              case "2":
                  selectActive(creaturesList);
                  break;
              case "3":
                  cChoice = true;
                  
                  break;

              default:
                  System.out.println("Invalid Selection, please only input 1-3");
          }
      }
        
    }


    public void selectActive(ArrayList<Creature> creaturesList)
    /*
     selectActive(creaturesList): Lets the user choose their active creature 
     
     */
    {
    Scanner scanner1 = new Scanner(System.in);

    System.out.println("Which Creature Would you Like to Set as Active?");
  

    boolean cFound = false; 
     
    
    while (!cFound) {
        System.out.println("Enter the name of the creature: ");
        creatureInput = scanner1.nextLine();
        
        

        for (Creature creature : creaturesList) {
            if (creatureInput.equalsIgnoreCase(creature.getcName()) && !creature.getIsActive()) {
                for(Creature creature2 :creaturesList)
                {
                    if(creature2.getIsActive())
                    {
                    creature2.setIsActive(false);
                    }
                }
                System.out.println("Creature found, Type: " + creature.getcType() + ", Health: " + creature.getcHealth());
                creature.setIsActive(true); 
                cFound = true;
                
                break;

            }
            else if (creatureInput.equalsIgnoreCase(creature.getcName()) && creature.getIsActive())
            {
            System.out.println("Creature found, Type: " + creature.getcType() + ", Health: " + creature.getcHealth());
            System.out.println("Already Active!");
            cFound = true;
            break;

            }
        }

        if (!cFound) {
            System.out.println("Creature not found in the list. Please try again.");
        }
        }
       
    }

    public static void showCreatures(ArrayList<Creature> creaturesList)
    /*
     showCreatures(creaturesList): shows all of the user creatures 
     
     */
    {
        System.out.println("Showing All Creatures:");

        for (Creature creature : creaturesList) {
            if (creature.getIsActive()) 
            {
                System.out.println("Currently Active: " + creature.getcName() + " - Type: " + creature.getcType() + ", Family: " + creature.getcFam() + ", EvL: " + creature.getcEvLvl());
            } else
            {
                System.out.println(creature.getcName() + " - Type: " + creature.getcType() + ", Family: " + creature.getcFam() + ", EL: " + creature.getcEvLvl());
            }
        }
    }
}


