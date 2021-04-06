package com.kar.springdemo;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Keep running";
		
	}

	@Override
	public String getDailyFortune() {
		return "Football Coach:" +fortuneService.getFortune(); //helper=dependency
	}

}
