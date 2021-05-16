package com.example.sportPractice.helperDependency;

// the code below is used to create an interface that will have the signature of the method
// that will be used by the HappyFortuneService to provide fortune so that this fortune can be
// given to the players of different sports
public interface FortuneService {

	// creating a signature of the function to help the coach of different sports to provide the
	// fortune 
	public String getFortune();
}
