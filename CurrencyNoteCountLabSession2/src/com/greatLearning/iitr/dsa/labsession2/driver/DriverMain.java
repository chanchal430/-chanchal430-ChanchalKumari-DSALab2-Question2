package com.greatLearning.iitr.dsa.labsession2.driver;

//importing Scanner for taking user input
import java.util.Scanner;

//importing other package to drive code for note count and sorting
import com.greatLearning.iitr.dsa.labsession2.countingSort.NoteCount;
import com.greatLearning.iitr.dsa.labsession2.sorting.MergeSort;

public class DriverMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Currency denominations");
		int size = sc.nextInt();

		int currency[] = new int[size];

		System.out.println("Enter the currency denominations value");

		for (int i = 0; i < size; i++)
			currency[i] = sc.nextInt();

		// For clear view of sorting after inserting element to array
		// System.out.println("Before Sorting "+ Arrays.toString(currency));

		// class MergeSort to sort the currency value
		MergeSort ms = new MergeSort();
		ms.sort(currency, 0, size - 1);

		// For clear view of sorting after applying merge sort algorithm
		// System.out.println("After Sorting "+ Arrays.toString(currency));

		System.out.println("Enter the  Amount you want to pay ");
		int amount = sc.nextInt();

		System.out.println("Your Payment approach in order to give min no of notes will be");
		NoteCount nc = new NoteCount();
		nc.counting(currency, amount);

		sc.close();
	}

}
