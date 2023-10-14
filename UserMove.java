public class UserMove {
    private boolean userUp;
    private boolean userDown;
    private boolean userLeft;
    private boolean userRight;
    private int userSelection;

    //setters
    public void setUserUp(boolean userUp)
    {
        this.userUp = userUp;
    }
        public void setUserDown(boolean userDown)
    {
        this.userDown = userDown;
    }
        public void setUserLeft(boolean userLeft)
    {
        this.userLeft = userLeft;
    }
        public void setUserRight(boolean userRight)
    {
        this.userRight = userRight;

    }

    //constructor
    public UserMove()
    {
        while (true)
        {
        int userInput = getUserInput();
        setDirection(userInput);
        
             if (userSelection == 5)
             {
              System.out.println("Exiting the Area!");
              //call main menu 
              break;
             }          
        }
    }


    //getter
    private int getUserInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where do you want to go?\n");
        System.out.println("\n[1] UP\n");
        System.out.println("[2] DOWN\n");
        System.out.println("[3] LEFT\n");
        System.out.println("[4] RIGHT\n");
        System.out.println("[5] EXIT AREA\n");

        userSelection = scanner.nextInt();

    }

    private void setDirection(int userSelection)
    {
        while(userSelection < 1 || userSelection > 4)
        {
            System.out.println("Invalid Selection, please only input 1-4");
            getUserInput();
        }

        switch (userSelection) 
        {
            case 1: 
                System.out.println("Going Up!");
                userUp = true;

                if(Math.random() < 0.4)
                {
                    //place battle shitter here

                }

                break;

            case 2: 
                System.out.println("Going Down!");
                userDown = true;
                 if(Math.random() < 0.4)
                {
                    //place battle shitter here

                }
                break;

            case 3:
                System.out.println("Going Left!");
                userLeft = true;
                 if(Math.random() < 0.4)
                {
                    //place battle shitter here

                }
                break;
            
            case 4: 
                System.out.println("Going Right!");
                userRight = true;
                if(Math.random() < 0.4)
                {
                    //place battle shitter here

                }
                break;
        }
    }
}


