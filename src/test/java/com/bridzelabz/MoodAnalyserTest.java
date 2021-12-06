package com.bridzelabz;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import com.bridgelabz.MoodAnalyser;

public class MoodAnalyserTest {

	MoodAnalyser moodAnalyser;

	@Before
	public void moodinitialize() {
		moodAnalyser = new MoodAnalyser();
	}

	@Test
	public void analyseMoodReturnSadTest() {
		String mood = moodAnalyser.analyseMood("I am in Sad Mood");
		assertEquals("SAD", mood);
	}

	@Test
	public void analyseMoodReturnhappyTest() {
		String mood = moodAnalyser.analyseMood("I am in Any Mood");
		assertEquals("HAPPY", mood);
	}

}
