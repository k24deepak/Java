package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class secondmostreapeatednuminarr {

	public static void main(String[] args) {

		/*
		 * int[] list = {10,10,10,20,30,30,20,20,20};
		 * 
		 * ArrayList<Integer> list1 = new ArrayList<Integer>(); ArrayList<Integer> list2
		 * = new ArrayList<Integer>(); ArrayList<Integer> list3 = new
		 * ArrayList<Integer>();
		 * 
		 * for (int i = 0; i<list.length; i++) { for(int num = ) }
		 */

		String words = "One Two Three Four";
		int countWords = words.split("\\s").length;
		System.out.println(countWords);

		String txt = "Hello World";
		System.out.println(txt.toUpperCase()); // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase()); // Outputs "hello world"

		String txt1 = "Please locate where 'locate' occurs!";
		System.out.println(txt1.indexOf("!")); // Outputs 7

		String originalStr = "Hello world";
		String reversedStr = "";

		for (int i = 0; i < originalStr.length(); i++) {
			reversedStr = originalStr.charAt(i) + reversedStr;
		}

		System.out.println("Reversed string: " + reversedStr);

		int[] myArray = { 1, 5, 10, 25 };
		int sum = 0;
		int i;

		// Loop through the array elements and store the sum in the sum variable
		for (i = 0; i < myArray.length; i++) {
			sum += myArray[i];
		}

		System.out.println("The sum is: " + sum);

		// Sort an array a-z

		String[] cars = { "Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi" };
		Arrays.sort(cars);
		for (String j : cars) {
			System.out.println(j);
		}

		// Sort in reverse order (Z to A)
		Arrays.sort(cars, Collections.reverseOrder());

	/*	for (String car : cars) {
			System.out.println(Arrays.toString(cars));
		}
		for (String car : cars) {
			System.out.println(car);
		}	
		for (String h : cars) {
			System.out.println(h);
		}*/
	

	// averages in array

	// An array storing different ages
	int ages[] = { 20, 22, 18, 35, 48, 26, 87, 70 };

	float avg, sumofages = 0;

	// Get the length of the array
	 int length = ages.length;

	// Loop through the elements of the array
	for(int age:ages)
	{
		sumofages += age;
	}

	// Calculate the average by dividing the sum by the length
	avg=sumofages/length;

	// Print the average
	System.out.println("The average age is: "+avg);
	
	// Lowest age in array
	
	int lowestage = ages[0];
	
	for (int age :ages) {
		if (lowestage > age) {
			lowestage =age;
		}
	}
	System.out.println("The lowest age in the array is: " + lowestage);
	
}
}
