package com.habuma.spel.cities;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol.Performer;

public class Test {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/habuma/spel/cities/applicationContext.xml");
		Performer performer = (Performer) ctx.getBean("hank_prop");
		performer.perform();
	}

}
