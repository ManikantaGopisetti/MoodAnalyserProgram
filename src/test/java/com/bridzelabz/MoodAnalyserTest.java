package com.bridzelabz;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.bridgelabz.MoodAnalyser;

public class MoodAnalyserTest {

	MoodAnalyser moodAnalyser;

	@Test
	public void analyseMoodReturnSadTest() {
		moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("SAD", mood);
	}

	@Test
	public void analyseMoodReturnhappyTest() {
		moodAnalyser = new MoodAnalyser("I am in Any Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", mood);
	}

}
