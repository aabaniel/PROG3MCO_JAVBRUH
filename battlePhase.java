import java.util.*;

public class battlePhase {
    
    public void bPhase(ArrayList<Creature> creaturesList, ArrayList<Creature> allCreatures, inventory inv) {
        /*
         bPhase(creaturesList, allCreatures, inv): contains and handles the main battle phase functionality
         */

        int bChoice;
        boolean didAttack = false;
        boolean didSwap = false;
        boolean didCatch = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Encountered an enemy creature!");
        didAttack = false;
        didSwap = false;
        didCatch = false;

        Random random = new Random();

        Creature enemyCreature = allCreatures.get(random.nextInt(allCreatures.size()));

        System.out.println("Name: " + enemyCreature.getcName());
        System.out.println("Type: " + enemyCreature.getcType());
        System.out.println("Health: " + enemyCreature.getcHealth());

        System.out.println("What would you like to do?");
   
        for(int i = 0; i < 3; i++) {
            bChoice = 0;
            
            if(!didAttack)
                System.out.println("[1] Attack");
            else if(didAttack)
                System.out.println("[1]  Attack (USED)");
            if(!didSwap)
                System.out.println("[2] Swap");
            else if(didSwap)
                System.out.println("[2] Swap (USED)");
            if(!didCatch)
                System.out.println("[3] Catch");
            else if(didCatch)
                System.out.println("[3] Catch(USED)");
            
            System.out.println("[4] Run Away");



            while(bChoice == 0) {

            bChoice = scanner.nextInt();

                switch(bChoice) {
                    case 1:
                        bAttack(creaturesList, enemyCreature);
                        didAttack = true;
                        break;
                    case 2:
                        if(creaturesList.size() == 1)
                        {
                            System.out.println("You cannot swap, you only have one creature!");
                        }
                        else
                        {
                            bSwap(creaturesList, inv);
                            didSwap = true;
                        }
                        break;
                    case 3:
                        bCatch(creaturesList, enemyCreature);
                        didCatch = true;
                        break;
                    
                    case 4:
                        System.out.println("Running away!");
                        
                        i = 3;
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        bChoice = 0;
                        break;
                }
            }

        }
        if(didAttack && didSwap && didCatch)
        {
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            } 

            System.out.println("The creature has ran away!");

        }
    }

    private void bAttack(ArrayList<Creature> creaturesList, Creature enemyCreature) {
        /*
         bAttack(creaturesList,enemyCreature): Makes sure creature and enemy are consistent and handles attacking
         */
        for (Creature creature : creaturesList) {
            if (creature.getIsActive()) {
                Creature aCreature = new Creature();
                aCreature.setcName(creature.getcName());
                aCreature.setcType(creature.getcType());
                aCreature.setcEvLvl(creature.getcEvLvl());
            

            Random random = new Random();
            int baseDamage = (random.nextInt(10) + 1) * aCreature.cEvLvl;
            if (isElement(aCreature, enemyCreature)) {
                baseDamage *= 1.5;
                System.out.println("Element Advantage! Bonus x1.5 Damage");
            }

            enemyCreature.setcHealth(enemyCreature.getcHealth() - baseDamage);

            System.out.println("Creature " + aCreature.getcName() + " attacks " + enemyCreature.getcName() + " for " + baseDamage + " damage.");
            System.out.println("Enemy " + enemyCreature.getcName() + " now has " + enemyCreature.getcHealth() + " HP.");
                
            }
        }
    }

    private boolean isElement(Creature creature, Creature enemyCreature) {
        /*
         isElement(creature, enemyCreature): checks the types of the user creature and enemy creature  
         
         */
        String creatureType = creature.getcType();
        String enemyType = enemyCreature.getcType();

        return (creatureType.equalsIgnoreCase("FIRE") && enemyType.equalsIgnoreCase("GRASS")) ||
            (creatureType.equalsIgnoreCase("GRASS") && enemyType.equalsIgnoreCase("WATER")) ||
            (creatureType.equalsIgnoreCase("WATER") && enemyType.equalsIgnoreCase("FIRE"));
    }
            

    private void bSwap(ArrayList<Creature> creaturesList, inventory inv)
    /*
     bSwap(creaturesList, inv):calls the inventory
     */
    {
        inv.getInventoryInput(creaturesList);
    }
    
    private void bCatch(ArrayList<Creature> creaturesList, Creature enemyCreature)
    /*
     bCatch(creaturesList, enemyCreature):handles capturing and importing the creature to creatureList.
     */
    {
        Random random = new Random();
        double chance = (double)(40 + 50 - enemyCreature.cHealth) / 100;
        if (random.nextDouble() < chance)
        {
            System.out.println("You caught creature: " + enemyCreature.cName + "!");
            enemyCreature.IsEnemy = false;
            enemyCreature.IsActive = false;
            creaturesList.add(enemyCreature);
          }  

        else
            System.out.println("You failed to catch creature!");
    }

}
