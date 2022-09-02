import java.util.Random;
import java.util.Scanner;

public class Slot {


    //////////////
    Random number;
    //////////////
    public Slot(){
        number = new Random();
    }
    public Random getNumber() {
        return number;
    }

    public static void main(String[] args) {
        int first,second,third;
        String temp;
        Scanner scanner = new Scanner(System.in);

        Slot obj1 = new Slot();
        System.out.println("*******************************");
        System.out.println("    Welcome to Slot Machine");
        System.out.println("*******************************");
        System.out.println("Game is starting...");

        System.out.println("If you want to continue to start PRESS C and E for quit : ");
        temp = scanner.nextLine();
        while(temp.equalsIgnoreCase("C")){


            first = obj1.getNumber().nextInt(9);
            second = obj1.getNumber().nextInt(9);
            third = obj1.getNumber().nextInt(9);

            System.out.println("Result are....");

            System.out.println("*****************************");
            System.out.println(first+"_____"+second+"_____"+third);
            System.out.println("*****************************");

            if((first == second) && ( first == third)){
                System.out.println("Great! You got all same!");
            }
            if((first == second) || (first == third) || (second == third) ){
                System.out.println("Good job! You got double");
            }
            else System.out.println("None of them matched");

            System.out.println("*****************************");
            System.out.println("*****************************");
            System.out.println("*****************************");



            System.out.println("If you want to continue print ANYTHING or if you want to end print 'E' : ");
            temp = scanner.nextLine();
        }
        System.out.println("Thanks for playing!");

    }

}




