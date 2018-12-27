package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContextBeanScope.xml");
		TennisCoach theCoach=context.getBean("TennisCoachP",TennisCoach.class);
		TennisCoach alphaCoach=context.getBean("TennisCoachP",TennisCoach.class);
		
		boolean result=theCoach==alphaCoach;
		System.out.println("\nPointing to the same object: "+result);
		System.out.println("\nMemory Location for theCoach: "+theCoach);
		System.out.println("\nMemory Location for alphaCoach: "+alphaCoach);
		context.close();
	}

}
