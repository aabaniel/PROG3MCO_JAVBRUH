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

