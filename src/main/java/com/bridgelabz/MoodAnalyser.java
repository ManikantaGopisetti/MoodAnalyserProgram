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

	public String analyseMood() throws MoodAnalysisException {

		if (message == null) {
			throw new MoodAnalysisException("invalid Mood : " + MoodAnalysisException.ExceptionType.NULL);
		} else if (message.equals("")) {
			throw new MoodAnalysisException("invalid Mood : " + MoodAnalysisException.ExceptionType.EMPTY_MOOD);
		} else if (message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}

	}
}
