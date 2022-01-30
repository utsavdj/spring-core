package com.utsavdj.springdemo;

public class FootballCoach implements Coach {
  @Override
  public String getDailyWorkout() {
    return "Tackle all the players by moving from one end to the other end of the field 5 times";
  }
}
