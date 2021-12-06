package com.bridgelabz;

import java.util.Scanner;

public class MoodAnalyserApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		System.out.println("Enter mood : ");
		String mood = sc.nextLine();
		System.out.println(moodAnalyser.analyseMood(mood));
		
		sc.close();
	}

}
