package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min. in the batting cage.";
	}

	@Override
	public String getDailyFortune() {
		
		
		return fortuneService.getFortune();
	}
}
