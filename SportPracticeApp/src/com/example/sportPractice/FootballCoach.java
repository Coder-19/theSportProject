package com.example.sportPractice;

import com.example.sportPractice.helperDependency.FortuneService;

// the code below is used to create a class named FootballCoach to give the daily work out 
// to the football players by using the method in the coach interface
public class FootballCoach implements Coach{
	
	// creating an object of the FortuneService interface to use the HappyFortuneService dependency class to 
	// give the fortune to the football players 
	FortuneService fortuneInterfaceService;
	
	// the code below is used to create the property to get the name of the football player
	private String footballPlayerName;
	
	// the property below is used to get the name of team to which the football player belongs
	private String teamName;
	

	// the code below is used to generate the getters and setters for getting and setting the football player name
	// and the team name of the football player
	public String getFootballPlayerName() {
		return footballPlayerName;
	}

	public void setFootballPlayerName(String footballPlayerName) {
		this.footballPlayerName = footballPlayerName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	// the code below is used to create a no-arg constructor of the FootballCoach class
	public FootballCoach() {
		
	}
	
	// the function below is used to give the daily work out details to the football players
	@Override
	public String getDailyWorkout() {
		return "Do goaling practice for 15 minutes daily";
	}

	
	// the code below is used to create a setter for using the dependency injection to give the fortune to the 
	// football players using the HappyFortuneService as the dependency or the helper class
	public void setFortuneInterfaceService(FortuneService fortuneInterfaceService) {
		// the code below is for debugging purpose
		System.out.println("Setter log: inside the setFortuneInterfaceService setter ");
		
		this.fortuneInterfaceService = fortuneInterfaceService;
	}
	
	

	@Override
	public String getDailyFortune() {
		// the code below is used to get the daily fortune for the football player using the setter injection method
		return fortuneInterfaceService.getFortune();
	}

}
