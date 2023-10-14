import java.util.*;

/*
Create area class here
  */

public class area{
    private Integer aType;
    private Integer areaGrid[][];
    private Integer userGrid[][];

    void initializeareaGrid(int x, int y)
    {
        areaGrid = new Integer[x][y];
        userGrid = new Integer[0][0];
    }
    void userMove()
    {
        int i = 0;
        UserMove move = new UserMove();
        Scanner sc = new Scanner(System.in);
        System.out.print("Which area will you go?:  ");
        aType = sc.nextInt();

        while(i == 0)
        {
            if(aType == 1)
            {
            initializeareaGrid(5, 1);
            for(int j = 0; j < 5; j++ )
            System.out.println("[ ]");
            i++;
            }
            /*else if(aType == 2)
            {
            initializeareaGrid(3, 3);
            i++;
            }
            else if(aType == 3)
            {
            initializeareaGrid(4, 4);
            i++;
            }*/
            else
            {
                System.out.println("Invalid area");
            }
        }
        sc.close();
    }
}

