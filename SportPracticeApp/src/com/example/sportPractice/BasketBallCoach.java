package com.example.sportPractice;


// the code below is used to create a class for using the coach interface to provide the 
// daily work out to the basket ball players
public class BasketBallCoach implements Coach{

	// using the function created in the coach interface to get the daily workout for the
	// basket ball users
	@Override
	public String getDailyWorkout() {
		return "Run 5k daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
