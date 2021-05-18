package com.example.sportPractice;


import com.example.sportPractice.helperDependency.FortuneService;

// the code below is used to create a new coach for the golf sport to get the daily workout and daily fortune
public class GolfCoach implements  Coach {

    // creating an object of the FortuneService to get the Random Daily fortune for the golf players
    FortuneService fortuneService;

    // the code below is used to create a no-argument constructor for the GoalfCoach
    public GolfCoach(){

    }

    // the code below is used to create a setter for doing dependency injection using the setter injection so
    // as to get the daily fortune for the golf players
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }



    // the function below is used to give the daily workout to the golf players
    @Override
    public String getDailyWorkout() {
        return "Try shooting goals daily";
    }


    // the function below is used to get the daily fortune for the golf players using the helper or the
    // dependency interface named FortuneService
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
