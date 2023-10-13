public class UserMove {
    private boolean userUp;
    private boolean userDown;
    private boolean userLeft;
    private boolean userRight;
    private int userSelection;

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

    public UserMove()
    {
        int userInput = getUserInput();
        setDirection(userInput);


    }




    private int getUserInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where do you want to go?\n");
        System.out.println("\n[1] UP\n");
        System.out.println("[2] DOWN\n");
        System.out.println("[3] LEFT\n");
        System.out.println("[4] RIGHT\n");

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
                break;

            case 2: 
                System.out.println("Going Down!");
                userDown = true;
                break;

            case 3:
                System.out.println("Going Left!");
                userLeft = true;
                break;
            
            case 4: 
                System.out.println("Going Right!");
                userRight = true;
                break;
        }
    }
}

