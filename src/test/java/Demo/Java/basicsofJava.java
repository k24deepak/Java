package Demo.Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class basicsofJava {

	public static void main(String[] args) {

/*		// Ques no 1 - find the no divisible by 2 or find even and odd
		int[] arr = { 1, 5, 25, 25, 25, 2, 85, 75, 98, 65 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {

				System.out.println(arr[i] + " is divisible by 2");
			}
			else {
				System.out.println(arr[i] + " is not divisible by 2");
			}

		}
		
		System.out.println("******************************************************************");
		
		// Ques no 2 - Find the second most repeated no from the given array
		
				int[] arr1 = { 1, 5, 25, 25, 25, 2, 85, 75, 98, 75 };
				
				 // Step 1: Count the frequency of each number
		        Map<Integer, Integer> frequencyMap = new HashMap<>();
		        
		        for (int num : arr1) {
		            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		        }

		        // Step 2: Create a list of frequencies and sort it in descending order
		        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(frequencyMap.entrySet());
		        list.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());

		        // Step 3: Retrieve the second most frequent number
		        if (list.size() > 1) {
		            Map.Entry<Integer, Integer> secondMostFrequent = list.get(1);
		            System.out.println("Second most repeated number is: " + secondMostFrequent.getKey());
		        } else {
		            System.out.println("There is no second most repeated number.");
		        }	*/
		        
		        
		        //Second method
		        
		   
		                int[] arr2 = {1, 5, 25, 25, 25, 2, 85, 75, 98, 75};

		                int[] count = new int[arr2.length];

		                // Step 1: Count how many times each element appears
		                for (int i = 0; i < arr2.length; i++) {
		                    count[i] = 1; // Initialize count

		                    for (int j = i + 1; j < arr2.length; j++) {
		                        if (arr2[i] == arr2[j]) {
		                            count[i]++;
		                            arr2[j] = -1; // Mark as visited
		                        }
		                    }
		                }

		                int firstMaxCount = 0;
		                int secondMaxCount = 0;
		                int firstMaxElement = -1;
		                int secondMaxElement = -1;

		                // Step 2: Find the most repeated and second most repeated
		                for (int i = 0; i < count.length; i++) {
		                    if (arr2[i] != -1) { // Ignore already visited elements
		                        if (count[i] > firstMaxCount) {
		                            secondMaxCount = firstMaxCount;
		                            secondMaxElement = firstMaxElement;

		                            firstMaxCount = count[i];
		                            firstMaxElement = arr2[i];
		                        } else if (count[i] > secondMaxCount) {
		                            secondMaxCount = count[i];
		                            secondMaxElement = arr2[i];
		                        }
		                    }
		                }

		                System.out.println("Second most repeated number is: " + secondMaxElement);
		                System.out.println("First most repeated number is: " + firstMaxCount);
		        

	}

}
