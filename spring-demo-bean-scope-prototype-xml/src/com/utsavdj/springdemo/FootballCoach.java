package com.utsavdj.springdemo;

public class FootballCoach implements Coach {

  // define a private field for the dependency
  private FortuneService fortuneService;

  // define a constructor for the dependency injection
  public FootballCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Tackle all the players by moving from one end to the other end of the field 5 times";
  }

  @Override
  public String getDailyFortune() {

    // use my fortuneService to get a fortune
    return fortuneService.getFortune();
  }
}
