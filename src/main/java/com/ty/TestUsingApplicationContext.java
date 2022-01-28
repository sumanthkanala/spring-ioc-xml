package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUsingApplicationContext {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("luckdip.xml");

//		Fan f = (Fan) context.getBean("myFan");
//		f.run();
//
//		Pen p = context.getBean("myPen", Pen.class);
//		p.write();
		
//		Car c=context.getBean("myCar",Car.class);
//		c.details();
//		Person p=context.getBean("myPerson",Person.class);
//		p.walk();
//		Mobile m=p.getMobile();
//		p.getMobile().doCall();
//		System.out.println(m);
		
//		Bus bus=context.getBean("myBus",Bus.class);
//		bus.move();
		System.out.println("hii");
		context.close();
	}
}
