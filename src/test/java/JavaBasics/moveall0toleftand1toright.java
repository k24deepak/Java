package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;

public class moveall0toleftand1toright {

	public static void main(String[] args) {
		
		//Ques- Move all zeros to the left and ones to the right in the given array
		
		//Answer method 1st
		int[] abc = {0,0,1,0,1,0,1,0,0,0,1,1};
		
		  ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		  ArrayList<Integer> myNumbers1 = new ArrayList<Integer>();
		for(int i = 0; i < abc.length; i++ ) {
			if(abc[i] == 0) {
				myNumbers.add(abc[i]);
			}
			else {
				myNumbers1.add(abc[i]);
			}
		}
		
		myNumbers.addAll(myNumbers1);
		
		System.out.println(myNumbers);
		
		//Answer Method 2nd
		
		int[] binaryArray = {1, 0, 1, 0, 1, 0, 0, 1};

        int countZero = 0;

        // Count number of 0s
        for (int num : binaryArray) {
            if (num == 0) {
                countZero++;
            }
        }

        // Fill the array: first part with 0s, second part with 1s
        for (int i = 0; i < binaryArray.length; i++) {
            if (i < countZero) {
                binaryArray[i] = 0;
            } else {
                binaryArray[i] = 1;
            }
        }

        System.out.println("Sorted Binary Array: " + Arrays.toString(binaryArray));
		
        //other method
        
        int[] abc3 = {0,0,1,0,1,0,1,0,0,0,1,1};
        
        int countzero = 0;
        
        for(int num : abc3) {
        	if(num == 0) {
        		countzero++;
        	}
        }
        
        for(int i = 0; i < abc3.length; i++) {
        	if(i < countzero) {
        		abc3[i] = 0;
        	}
        	else {
        		abc3[i] = 1;
        	}
        }
        
        System.out.println("Sorted Array: " + Arrays.toString(abc3));
        
        
	}
}
