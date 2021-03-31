package com.springinaction.springidol3;

import java.util.Map;

public class OneManBandMap implements Performer {

	private Map<String, Instrument> instruments;

	public void perform() throws Exception {
		for (String key : instruments.keySet()) {
			System.out.print(key + ":");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}
}
