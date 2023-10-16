public class inventory {
    
    ArrayList<Creature> creaturesList = new ArrayList<Creature>(); 

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
        scanner.close();
    }


    private void selectActive()
    {
    Scanner scanner1 = new Scanner(System.in);

    System.out.println("Which Creature Would you Like to Set as Active?");
    System.out.println("Input the Creature name here:");
    creatureInput = scanner1.nextLine();

    boolean cFound = false; 

    
    while (!cFound) {
        System.out.println("Enter the name of the creature: ");
        creatureInput = scanner1.nextLine();

        for (Creature creature : creaturesList) {
            if (creatureInput.equalsIgnoreCase(creature.cName)) {
                System.out.println("Creature found, Type: " + creature.cType + ", Health: " + creature.cEvLvl);
                creature.IsActive = true; 
                cFound = true;
                break;
            }
        }

        if (!cFound) {
            System.out.println("Creature not found in the list. Please try again.");
        }
        }
        scanner1.close();
    }

    private void showCreatures()
    {
     //For Displaying the Creatures: 
     //Creature newCreature = creaturesList.get(0);
     //System.out.println("Creature 1:" + firstCreature.getName() + firstCreature.getType() + firstCreature.getFamily() + firstCreature.getEL())

    System.out.println("Showing All Creatures:");

    for (Creature creature : creaturesList) {
        if (creature.isActive) 
        {
            System.out.println("Currently Active: " + creature.cName + " - Type: " + creature.cType + ", Family: " + creature.cFam + ", EL: " + creature.cEvLvl);
        } else
         {
            System.out.println(creature.cName + " - Type: " + creature.cType + ", Family: " + creature.cFam + ", EL: " + creature.cEvLvl);
        }
        }

    }   

}

