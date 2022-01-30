package com.utsavdj.springdemo;

public class TrackCoach implements Coach {

  // define a private field for the dependency
  private FortuneService fortuneService;

  // define a constructor for the dependency injection
  public TrackCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  // For the traditional MyApp
  public TrackCoach() {
  }

  @Override
  public String getDailyWorkout() {
    return "Run a hard 5k";
  }

  @Override
  public String getDailyFortune() {

    // use my fortuneService to get a fortune
    return "Just Do It: " + fortuneService.getFortune();
  }
}
