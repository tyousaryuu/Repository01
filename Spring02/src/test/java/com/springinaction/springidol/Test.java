package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol.Performer;

public class Test {
	static ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/applicationContext.xml");
	public static void main(String[] args) throws Exception {
		auditorium();
	}
	
	public void theStage() throws Exception{
		Performer performer = (Performer) ctx.getBean("theStage");
		performer.perform();
	}
	
	public static void auditorium() throws Exception{
		Auditorium auditorium = ctx.getBean("auditorium",Auditorium.class);
	}
}
