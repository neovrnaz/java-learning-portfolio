package com.neo.treestory;

import java.io.Console;


public class Story {

    public static void main(String[] args) {

        Console console = System.console();
        String firstName;
            do {
            firstName = console.readLine("What's your name? ");
            firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
            if (firstName.equalsIgnoreCase("Alex")) {
                console.printf("\n Error: Someone with the name Alex has already created a story. \n\n");
            }
            if (firstName.equalsIgnoreCase("John")) {
                console.printf("\n Error: Someone with the name John has already created a story. \n\n");
            }
        } while (firstName.equalsIgnoreCase("Alex") || firstName.equalsIgnoreCase("John"));


        String ageAsString = console.readLine("How old are you? ");
        int age = Integer.parseInt(ageAsString);
            if (age < 13) {
            console.printf("\n Sorry, you must meet the age limit to proceed. \n\n");
            System.exit(0);
        }


        String name;
            do {
            name = console.readLine("Who should take the adventure to The Great Treehouse? ");
            if (name.equalsIgnoreCase("Craig") ||
                    name.equalsIgnoreCase("Alex")) {
                console.printf("\n Error: A story has already been created with that name. Enter a new name. \n\n");
            }
        } while (name.equalsIgnoreCase("Craig") || name.equalsIgnoreCase("Alex"));


        String gender;
            do {
            gender = console.readLine("Is %s a him or her? ", name);
            if (!(gender.equalsIgnoreCase("Him") ||
                    gender.equalsIgnoreCase("Her"))) {
                console.printf("\n Incorrect spelling or format. Try again. \n\n");
            }
        } while (!(gender.equalsIgnoreCase("Him") || gender.equalsIgnoreCase("Her")));


        String heorshe;
            do {
            heorshe = console.readLine("Is it a he or she? ");
            if (!(heorshe.equalsIgnoreCase("He") ||
                    heorshe.equalsIgnoreCase("She"))) {
                console.printf("\n Incorrect spelling or format. Try again. \n\n");
            }
        } while (!(heorshe.equalsIgnoreCase("He") || heorshe.equalsIgnoreCase("She")));


        String language = console.readLine("What is the one language the character should take with? ");
        String food = console.readLine("What will the character eat with the tree villagers? ");
            console.printf("\n TreeStory:\n----------------\n");

//                                    This is called a format specifier
//                                      |
            console.printf("Written By: %s \n\n", firstName );
            console.printf("%s took an adventure to The Great Treehouse. With %s, %s took the great language of %s. The villagers and %s ate %s together and they lived happily ever after.", name, gender, heorshe, language, name, food);
    }
}

