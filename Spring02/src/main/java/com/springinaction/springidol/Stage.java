package com.springinaction.springidol;

public class Stage  implements Performer {
	private Stage(){
		
	}
	private static class StageSingletonHolder{
		static Stage instance = new Stage();
	}
	public static Stage getInstance(){
		return StageSingletonHolder.instance;
	}
	public void perform(){
		System.out.println("static factory");
	}
}
