package com.kar.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach() {
		
	}
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice more batting";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();//helper=dependency
	}

}
