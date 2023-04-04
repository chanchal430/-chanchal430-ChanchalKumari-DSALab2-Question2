package com.greatLearning.iitr.dsa.labsession2.countingSort;

public class NoteCount {

	public void counting(int[] currency, int amount) {

		int noteCount[] = new int[currency.length];
		int i;

		// Variable for printing total notes
		int sumofnotes = 0;

		for (i = 0; i < currency.length; i++) {
			noteCount[i] = amount / currency[i];
			amount = amount % currency[i];
			sumofnotes += noteCount[i];
		}

		for (i = 0; i < currency.length; i++) {
			if (noteCount[i] != 0) {
				System.out.println(currency[i] + ":" + noteCount[i]);
			}
		}

		// For printing sum of notes
		// System.out.println("Total Notes "+sumofnotes);

	}

}
