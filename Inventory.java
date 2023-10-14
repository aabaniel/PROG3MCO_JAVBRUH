/*
Create inventory class here
  */
import java.util.ArrayList;
import java.util.Scanner;

public class inventory {
    
    ArrayList<Creature> creaturesList = new ArrayList<>(); 

    private int inventorySelect;
    private String creatureInput; 


    /***************************************************************
     For adding a new creature to the array list:
    Creature newCreature = new Creature(//insert creature deets here);
    creaturesList.add(newCreature);

     For accessing: Creature newCreature = creaturesList.get(0);
     For Displaying the Creatures: System.out.println("Creature 1:" + firstCreature.getName() + firstCreature.getType() + firstCreature.getFamily() + firstCreature.getEL())


    *****************************************************************/
    
    
    private int getInventoryInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[1] VIEW CREATURES");
        System.out.println("[2] CHANGE ACTIVE CREATURE");
        System.out.println("[3] EXIT INVENTORY");

        int inventorySelect = scanner.nextInt();

        if (inventorySelect == 1)
        {
        showCreatures();
        }
        else if (inventorySelect == 2)
        {
        selectActive();
        }
        else if (inventorySelect == 3)
        {
        //exit idk 
        }

        while(inventorySelect < 1 || inventorySelect > 3)
        {
            System.out.println("Invalid Selection, please only input 1-3");
            inventorySelect = scanner.nextInt();
        }
        sc.close();
    }


    private void selectActive()
    {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Which Creature Would you Like to Set as Active?\n");
    System.out.println("Input the Creature name here:\n");
    creatureInput = scanner.nextLine();


    }

    private void showCreatures()
    {
     //For Displaying the Creatures: 
     //Creature newCreature = creaturesList.get(0);
     //System.out.println("Creature 1:" + firstCreature.getName() + firstCreature.getType() + firstCreature.getFamily() + firstCreature.getEL())
    }


}



