package com.example.sportPractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// the code below is used to load the spring container i.e. applicationContext.xml 
		// in our project
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		// the code below is used for retrieving the basketballCoach bean from our spring container
		Coach theCoach = context.getBean("basketBallCoach", Coach.class);
		
		
		// the code below is used to get the method defined in the BasketballCoach class and 
		// printing the result to the console
		System.out.println("Workout details from the basket ball coach: " +theCoach.getDailyWorkout());
		
		
		// // the code below is used for retrieving the footballCoach bean from our spring container
		
		// the code below is used to create an object of the FootballCoach class to get access to the functions
		// defined in the football coach class
		FootballCoach thefootballCoach = context.getBean("footBallCoach", FootballCoach.class);
		
		// the code below is used to get the method defined in the football coach class and print 
		// the result to the console
		System.out.println("Workout details from the football coach: " +thefootballCoach.getDailyWorkout());
		
		// the code below is used to get the fortune from the method defined in the football class and print it 
		// to the console
		System.out.println(thefootballCoach.getDailyFortune());
		
		// the code below is used to print the name of the football player
		System.out.println("The name of the football player is: " +thefootballCoach.getFootballPlayerName());
		
		// the code below is used to print the name of the team
		System.out.println("The name of the football team is: " +thefootballCoach.getTeamName());
		
		
		// the code below is used for retrieving the CricketCoach bean from our spring container
		
		// the code below is used to create an object of the cricket coach to get access to all the functions defined in the
		// cricket coach class
		CricketCoach theCricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		
	
		
		// the code below is used to get the daily work out from the cricket coach and print it 
		// to the console
		System.out.println("Workout details from the cricket coach: " +theCricketCoach.getDailyWorkout());
		
		// the code below is used to get the daily fortune from the cricket coach and print it 
		// to the console
		System.out.println(theCricketCoach.getDailyFortune());
		
		// the code below is used to print the email address of the cricket coach
		System.out.println("The email address of the cricket coach is: " +theCricketCoach.getCoachEmailAddress());
		
		//the code below is used to print the name of the cricket team
		System.out.println("The name of the team is: " +theCricketCoach.getTeamName());


		// the code below is for retrieving the GolfCoach bean from our spring container

		// the code below is used to create an object of the GolfCoach class to get access to all the functions
		// present inside it
		GolfCoach golfCoach = context.getBean("theGolfCoach", GolfCoach.class);

		// the code below is used to get the daily work out from the golf coach and print it in the console
		System.out.println("Workout details from the Golf coach: " +golfCoach.getDailyWorkout());

		// the code below is used to get and print the random fortune from the golf coach
		System.out.println(theCoach.getDailyFortune());
		
		// the code below is used to close the context
		context.close();
	}

}
