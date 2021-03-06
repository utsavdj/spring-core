package com.utsavdj.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

  private FortuneService fortuneService;

  // define a default constructor

  public TennisCoach() {
    System.out.println(">> TennisCoach: inside default constructor");
  }

  /*
  @Autowired
  public TennisCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }
  */

  @Override
  public String getDailyWorkout() {
    return "Practice your backhand volley";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }

  // define a setter method
  @Autowired
  public void setFortuneService(FortuneService fortuneService) {
    System.out.println(">> TennisCoach: inside setFortuneService() method");
    this.fortuneService = fortuneService;
  }

}
