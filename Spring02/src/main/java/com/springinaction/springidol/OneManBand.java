package com.springinaction.springidol;

import java.util.Collection;

public class OneManBand implements Performer {
	
	private Collection<Instrument> instruments;

	public void perform() throws Exception {
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}
}
