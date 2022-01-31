package com.utsavdj.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

  public static void main(String[] args) {
    // load the spring configuration file
    ClassPathXmlApplicationContext context =
      new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve the bean from the spring container
    Coach theCoach = context.getBean("myCricketCoach", Coach.class);

    // call methods on the bean
    System.out.println(theCoach.getDailyWorkout());
    System.out.println(theCoach.getDailyFortune());

    //close the context
    context.close();
  }
}
