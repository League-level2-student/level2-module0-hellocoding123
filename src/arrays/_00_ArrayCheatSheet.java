package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array = {"1","2","3","4","5"};
		//2. print the third element in the array
		System.out.println("Third element in array:");
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2] = "hi";
		//4. print the third element again
		System.out.println("Updated third element of array:");
		System.out.println(array[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		System.out.println("Whole array:");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		//6. make an array of 50 integers
		int [] intArray = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		System.out.println("Array of 50 random integers:");
		
		for(int i=0; i<intArray.length; i++) {
			
			intArray[i] = r.nextInt(10);
			System.out.println(intArray[i]);
			
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = intArray[0];
		for(int i=1; i<intArray.length; i++) {
			if(intArray[i] < smallest) {
				smallest = intArray[i];
			}
		}
		System.out.println("Smallest number in array:");
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		System.out.println("Whole array:");
		for(int i=1; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		//10. print the largest number in the array.
		System.out.println("Largest number in array:");
		
		int largest = intArray[5];
		for(int i=1; i<intArray.length; i++) {
			if(intArray[i] > largest) {
				largest = intArray[i];
			}
		}
		System.out.println(largest);
	}
}
