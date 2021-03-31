package com.springinaction.springidol3;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol3.Performer;

public class Test {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol3/applicationContext.xml");
		Performer performer = (Performer) ctx.getBean("kenny");
		performer.perform();
		ArrayList list = new ArrayList();
	}

}
