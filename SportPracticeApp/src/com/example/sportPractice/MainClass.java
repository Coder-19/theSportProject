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
		Coach thefootballCoach = context.getBean("footBallCoach", Coach.class);
		
		// the code below is used to get the method defined in the football coach class and print 
		// the result to the console
		System.out.println("Workout details from the football coach: " +thefootballCoach.getDailyWorkout());
		
		
		// the code below is used for retrieving the CricketCoach bean from our spring container
		Coach theCricketCoach = context.getBean("cricketCoach", Coach.class);
		
		// the code below is used to get the daily work out from the cricket coach and print it 
		// to the console
		System.out.println("Workout details from the cricket coach: " +theCricketCoach.getDailyWorkout());
		
		// the code below is used to get the daily fortune from the cricket coach and print it 
		// to the console
		System.out.println(theCricketCoach.getDailyFortune());
		
		// the code below is used to close the context
		context.close();
	}

}
