package com.example.sportPractice;

import com.example.sportPractice.helperDependency.FortuneService;


// the code below is used to create a cricket coach class to give the daily work out details
// to the cricket players using the method declared in the coach interface and also to give 
// the daily fortunes to the player using the dependency or helper class named HappyFortuneService
public class CricketCoach implements Coach{
	
	// creating an instance of the Fortune service interface to be used for getting the fortune using
	// the dependency or the helper class named HappyFortuneService 
	FortuneService fortuneInterfaceService;
	
	// creating a constructor for doing the dependency injection using the constructor injection
	// method and this constructor will have an object of the FortuneService interface as the 
	// input 
	public CricketCoach(FortuneService theFortuneService) {
		this.fortuneInterfaceService = theFortuneService;
	}
	
	

	// the code below is used to give the daily work out details to the cricket players
	@Override
	public String getDailyWorkout() {
		return "Run 10K daily";
	}

	@Override
	public String getDailyFortune() {
		// using the object of the fortune service interface to get the fortune
		return fortuneInterfaceService.getFortune();
	}
	
}
