package com.bridgelabz;

import java.util.Scanner;

public class MoodAnalyserApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MoodAnalyser moodAnalyserSad = new MoodAnalyser("I am in Sad Mood");
		System.out.println(moodAnalyserSad.analyseMood());
		MoodAnalyser moodAnalyserHappy = new MoodAnalyser("I am in Any Mood");
		System.out.println(moodAnalyserHappy.analyseMood());

		sc.close();
	}

}
