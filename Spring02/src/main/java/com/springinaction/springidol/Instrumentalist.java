package com.springinaction.springidol;

public class Instrumentalist implements Performer {
	
	private String song;
	private Instrument instrument;

	public void perform() throws Exception {
		System.out.println("Playing"+song+":");
		instrument.play();
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
}
