package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String email;
	private String team;
	public CricketCoach() {
		System.out.println("CricketCoach: From no-arg constructor");
	}
	public CricketCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice bowling for 15 min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: From fortune setter");
		this.fortuneService = fortuneService;
	}
	public void setEmail(String email) {
		System.out.println("CricketCoach: From email setter");
		this.email = email;
	}
	public void setTeam(String team) {
		System.out.println("CricketCoach: From team setter");
		this.team = team;
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}

}
