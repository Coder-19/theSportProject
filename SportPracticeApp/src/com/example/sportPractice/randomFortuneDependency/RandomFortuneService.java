package com.example.sportPractice.randomFortuneDependency;

import com.example.sportPractice.helperDependency.FortuneService;
import java.util.Random;

// the code below is used to create a helper class to get the random fortune from an array of fortunes for
// the player of different sports
public class RandomFortuneService implements FortuneService {

    // the code below is used to create an array of type string to have the list of different fortunes
    // from which one of the fortune can be given to the user
    private String[] fortunes = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward",
    };


    // the code below is used to create an object of the random class
    private Random myRandomNumber = new Random();


    // the function below is used to give random fortune to the players of the different sports
    @Override
    public String getFortune() {

        // the code below is used to get a random number based on the length of the array fortunes
        int index = myRandomNumber.nextInt(fortunes.length);

        // the code below is used to get a random fortune from the list of the fortunes based on the random
        // index number
        String fortune = fortunes[index];

        // returning the fortune
        return fortune;
    }
}
