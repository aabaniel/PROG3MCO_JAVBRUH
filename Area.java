import java.util.*;

/*
Create area class here
  */

public class Area {
    private int aType;
    private int[][] areaGrid;
    private int xUser;
    private int yUser;

    public void initializeAreaGrid(int x, int y) {
        areaGrid = new int[x][y];
        xUser = 0; 
        yUser = 0;
    }

    public void userMove() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which area will you go(1 or 2 or 3?: ");
        aType = sc.nextInt();

        if (aType == 1) {
            initializeAreaGrid(5, 1);

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 1; j++) {
                    if (i == xUser && j == yUser) {
                        System.out.print("[O]");
                    } else {
                        System.out.print("[ ]");
                    }
                }
                System.out.println();
            }

        } else {
            System.out.println("Invalid area");
        }
        
        sc.close();
    }
}


/*************************************************************
public class Grid {
    private static final int GRID_WIDTH = 5;
    private static final int GRID_HEIGHT = 1;
    private int userPosition;

    public Grid() {
        userPosition = 0; // User starts at position 0
    }

    public void moveUser() {
        if (userPosition < GRID_WIDTH - 1) {
            userPosition++; // Move user to the right
        } else {
            System.out.println("You have reached the end of the area!");
        }
    }

    public void printGrid() {
        for (int i = 0; i < GRID_WIDTH; i++) {
            if (i == userPosition) {
                System.out.print("X "); // Mark user's position with 'X'
            } else {
                System.out.print("_ "); // Empty space
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Grid grid = new Grid();
        grid.printGrid(); // Initial grid

        // Move the user through the grid
        grid.moveUser();
        grid.printGrid();

        grid.moveUser();
        grid.printGrid();

        grid.moveUser();
        grid.printGrid();

        grid.moveUser(); // This will print "You have reached the end of the area!"
        grid.printGrid();
    }
}

 ************************************************************/

