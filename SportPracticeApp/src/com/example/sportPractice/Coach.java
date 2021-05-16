package com.example.sportPractice;


// the code below is used to create a Coach interface to get the daily workout for the players
// of different sport from different coach
public interface Coach {

	// creating the signature of a function to get the daily workout for the players of different 
	// sport
	public String getDailyWorkout();
	
	// the code below is used to create a signature of a new method that will be  used by different
	// coaches of different sports to provide daily fortune to their players
	public String getDailyFortune();
	
}
