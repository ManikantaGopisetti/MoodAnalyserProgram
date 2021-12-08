package com.bridzelabz;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.bridgelabz.MoodAnalyser;
import com.bridgelabz.MoodAnalysisException;

public class MoodAnalyserTest {

	MoodAnalyser moodAnalyser;

	@Test
	public void analyseMoodReturnSadTest() throws MoodAnalysisException {
		moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("SAD", mood);
	}

	@Test
	public void analyseMoodReturnHappyTest() throws MoodAnalysisException {
		moodAnalyser = new MoodAnalyser("I am in Any Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", mood);
	}

	@Test(expected = MoodAnalysisException.class)
	public void givenNullanalyseMoodReturnTest() throws MoodAnalysisException {
		moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
	}

	@Test(expected = MoodAnalysisException.class)
	public void givenEmptyanalyseMoodReturnTest() throws MoodAnalysisException {
		moodAnalyser = new MoodAnalyser("");
		String mood = moodAnalyser.analyseMood();

	}
}
