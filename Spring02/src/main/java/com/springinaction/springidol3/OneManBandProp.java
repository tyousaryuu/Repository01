package com.springinaction.springidol3;

import java.util.Map;

public class OneManBandProp implements Performer {

	private Map<String, String> instruments;

	public void perform() throws Exception {
		for (String key : instruments.keySet()) {
			System.out.print(key + ":");
			String value= instruments.get(key);
			System.out.println(value);
		}
	}

	public void setInstruments(Map<String, String> instruments) {
		this.instruments = instruments;
	}
}
