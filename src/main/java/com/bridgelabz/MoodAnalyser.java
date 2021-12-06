package com.bridgelabz;

public class MoodAnalyser {

	private String message;

	public MoodAnalyser() {
		super();
	}

	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	public String analyseMood() {

		if (message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}

	}

}
