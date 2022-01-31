package com.utsavdj.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

  public static void main(String[] args) {
    // load the spring configuration file
    ClassPathXmlApplicationContext context =
      new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

    // retrieve the bean from the spring container
    Coach theCoach = context.getBean("myCoach", Coach.class);

    // print out the result
    System.out.println(theCoach.getDailyWorkout());

    //close the context
    context.close();
  }
}
