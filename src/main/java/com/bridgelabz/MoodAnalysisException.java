package com.bridgelabz;

public class MoodAnalysisException extends Exception {
	
	ExceptionType type;

	enum ExceptionType {
		NULL, EMPTY_MOOD
	}

	public MoodAnalysisException() {
		super();
	}

	public MoodAnalysisException(String message) {
		super(message);
	}
	
	public MoodAnalysisException(String message,ExceptionType type) {
		super(message);
		this.type=type;
	}

}
