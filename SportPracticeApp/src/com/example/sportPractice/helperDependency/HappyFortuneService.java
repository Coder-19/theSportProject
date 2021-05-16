package com.example.sportPractice.helperDependency;


// the code below is used to create a class that will act as an external dependency and is used
// to provide the fortune to different players from the coach of the different sports


// using the interface named FortuneService to return the fortune so that the coach of different 
// sports can use this dependency class to provide the fortune
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}

}
