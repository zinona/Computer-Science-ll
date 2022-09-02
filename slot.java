public static void main(String[] args)
        {
        String another;
        int num1, num2, num3;

        Scanner scanStr = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Start Machine ('s' to start, 'q' to quit.)"
        + "? ");
        another = scanStr.nextLine();

        while(another.equalsIgnoreCase("s"))
        {
        System.out.println("-----------------------------------");
        System.out.println("Seleceting 3 random numbers between");
        System.out.println("0 and 9");
        num1 = rand.nextInt(9);
        num2 = rand.nextInt(9);
        num3 = rand.nextInt(9);
        System.out.println("-----------------------------------");
        System.out.println(num1 + "\t" + num2 + "\t" + num3);
        System.out.println("-----------------------------------");
        if(num1 == num2 && num2 == num3 && num3 == num1)
        {
        System.out.println("All of the three numbers are "
        + "same.");
        }
        else if(num1 != num2 && num2 != num3 && num3 != num1)
        {
        System.out.println("None of the three numbers are "
        + "same.");
        }
        else
        {
        System.out.println("Two of the three numbers are "
        + "same.");
        }
        System.out.println("-----------------------------------");
        System.out.print("Run Again ('s' to start, 'q' to quit.)"
        + "? ");
        another = scanStr.nextLine();
        }
        }