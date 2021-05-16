package com.example.sportPractice;


// the code below is used to create a class named FootballCoach to give the daily work out 
// to the football players by using the method in the coach interface
public class FootballCoach implements Coach{

	// the function below is used to give the daily work out details to the football players
	@Override
	public String getDailyWorkout() {
		return "Do goaling practice for 15 minutes daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
