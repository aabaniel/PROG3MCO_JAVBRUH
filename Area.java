import java.util.*;
import java.lang.Thread;

public class Area {
    private char[][] areaGrid;
    private int xUser;
    private int yUser;
    private Random random = new Random();
    
    public Area() {
        /*
         Area: indicates what type of area would be called 
         
         */
        areaGrid = new char[1][5];
        xUser = 0;
        yUser = 0;
        initializeAreaGrid();
    }

    public void initializeAreaGrid() {
        /*
         initializeAreaGrid: initializes the area grid depending on area type
         */
        for (int i = 0; i < areaGrid.length; i++) {
            for (int j = 0; j < areaGrid[0].length; j++) {
                areaGrid[i][j] = ' ';
            }
        }
        areaGrid[0][0] = '0';
    }

    public void printGrid() {
    /*
     printGrid: Handles printing the areas 
     */
        try {
			Thread.sleep(750);
		} catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        }
        System.out.print("\033\143");
        for (int i = 0; i < areaGrid.length; i++) {
            for (int j = 0; j < areaGrid[0].length; j++) {
                if (i == yUser && j == xUser) {
                    System.out.print("[ " + areaGrid[i][j] + "X ] ");
                } else {
                    System.out.print("[ " + areaGrid[i][j] + " ] ");
                }
            }
            System.out.println();
        }
        System.out.println("You are currently at position (" + (xUser+ 1)  + ", " + (yUser + 1) + ")");
    }

    public void userMove(ArrayList<Creature> creaturesList, ArrayList<Creature> allCreatures, inventory inv) {
        /*
         userMove(creaturesList, allCreatures, inv): This is where user interacts with the areas and moving through them. 
    
         */
        battlePhase bP = new battlePhase(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Which area will you go? (1, 2, 3): ");
        int aType = sc.nextInt();

        if (aType == 1) {
            areaGrid = new char[1][5];
        } else {
            System.out.println("Invalid area");
            return;
        }

        while (true) {
            printGrid();

            System.out.print("Enter a direction or Exit area(left, right, up, down, or exit): ");
            String direction = sc.next();

            if (direction.equalsIgnoreCase("left") && xUser > 0) {
                xUser--;
                if (random.nextDouble() < 0.4) {
                    System.out.println("Battle encountered!");

                    bP.bPhase(creaturesList, allCreatures, inv);
                }

            } else if (direction.equalsIgnoreCase("right") && xUser < areaGrid[0].length - 1) {
                xUser++;
                if (random.nextDouble() < 0.4) 
                System.out.println("Battle encountered!");
                
                bP.bPhase(creaturesList, allCreatures, inv);

            } else if (direction.equalsIgnoreCase("up") && yUser > 0) {
                yUser--;
                if (random.nextDouble() < 0.4) 
                System.out.println("Battle encountered!");
                //call battlephase class here when phase 2

            } else if (direction.equalsIgnoreCase("down") && yUser < areaGrid.length - 1) {
                yUser++;
                if (random.nextDouble() < 0.4) 
                System.out.println("Battle encountered!");
                //call battlephase class here when phase 2

            } else if (direction.equalsIgnoreCase("exit")) {
                return;
                
            } else {
                System.out.println("Invalid move.");
            }
            }
        }   
    }
