package com.springinaction.springidol;

public class Juggler implements Performer {

	private int beanBags = 3;

	public Juggler() {
		super();
	}

	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
	}

	public void perform() throws Exception {
		System.out.println("JUGGLING " + beanBags + " BEANBAGS");
	}

}
