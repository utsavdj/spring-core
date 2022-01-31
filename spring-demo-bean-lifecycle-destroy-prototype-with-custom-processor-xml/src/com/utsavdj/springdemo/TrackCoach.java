package com.utsavdj.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {

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

  // add an init method
  public void doMyStartupStuff() {
    System.out.println("TrackCoach: inside method doMyStartupStuff");
  }

  // add a destroy method
  @Override
  public void destroy() {
    System.out.println("TrackCoach: inside method destroy");
  }
}
