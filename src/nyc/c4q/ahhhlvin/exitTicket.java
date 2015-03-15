package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/14/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */

import java.util.Scanner;

public class exitTicket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);




        for (int i = 0; i < 5; i++) {
            System.out.println("Please guess a number between 1-20, please enter a number: ");
            int guess = input.nextInt();


            if (guess <= 9 && guess >= 0) {
                System.out.println("Your guess is too low.  Please try again: ");
            } else if (guess <= 20 && guess >= 11) {
                System.out.println("Your guess is too high. Please try again: ");
            } else if (guess == 10) {
                System.out.println("Congrats! YOu guessed it. ");
            } else {
                System.out.println("Please enter a valid number between the range of 1-20. ");
            }


        }


    }


}



