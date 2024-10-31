package lesson1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        guessMyNumber();

    }

    public static void guessMyNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 10!");
        System.out.println("See if you can guess my number!");
        int secretNumber = (int)(Math.random()*9+1);
        System.out.println("Enter your guess!");
        tint userGuess = input.nextInt();
        while (secretNumber =! userGuess) ;
        {
            System.out.println("Try again! Enter your guess!");
            UserGuess = input.nextInt();
        }
        System.out.println("Correct!");

        }

    }
}
