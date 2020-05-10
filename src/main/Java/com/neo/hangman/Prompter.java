package com.neo.hangman;

import java.util.Scanner;

public class Prompter {


    private Game game;

    public Prompter (Game game) {
        this.game = game;
    }


    public boolean promptForGuess () {
        Scanner sc = new Scanner(System.in);
        boolean isHit = false;
        boolean isAcceptable = false;


        do {

            System.out.print("Enter a letter: ");
            String guessInput = sc.nextLine();

            try {
                isHit = game.applyGuess(guessInput);
                isAcceptable = true;
            } catch (IllegalArgumentException iae) {
                System.out.printf("%s. Please Try again. %n",
                        iae.getMessage());
            }
        } while(! isAcceptable );
        return isHit;

    }

    public void displayProgress() {
        System.out.printf("You have %d tries left to solve:  %s%n",
                game.getRemainingTries(),
                game.getCurrentProgress());


    }

    public void displayOutcome() {

        if (game.isWon()) {

            System.out.printf("Congratulations you won with %d tries remaining.%n",
                    game.getRemainingTries());

        } else {
            System.out.printf("Bummer. The word was %s. :( %n",
                    game.getMysteryWord());
        }

    }
}