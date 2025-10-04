/**
 * 
 * This code performs five main tasks on arrays.
 * Task 1 allows the user to enter a number and find its index in the array. 
 * Task 2 takes two indices from the user and swaps the elements at those positions. 
 * Task 3 sorts the array into ascending and descending order and displays the results. 
 * Task 4 performs a linear search where the program checks each element one by one to find a user-entered number. 
 * Finally, Task 5 performs a binary search on a sorted array, where the program repeatedly divides the array in half to efficiently 
 * find the number or report that it is not present
 * 
 * Developer: Cal Senam Afun
 * Date: 3/09/2025
 */


import java.util.Scanner;
import java.util.Arrays;

public class ArrayTask{
    public static void main (String [] args){
        int [] myArray = {2, 5, 8, 3, 4, 6, 10, 15, 20, 1, 11};

        int[] myArrayDuplicate = Arrays.copyOf(myArray, myArray.length);
        int[] myArray2 = Arrays.copyOf(myArray, myArray.length);
        
        // // Task 1
        System.out.println("Enter the index of the number you want to find");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int desiredIndex = -1;

        for (int i = 0; i <= myArray.length - 1; i ++){
            if (number == myArray[i]){
                desiredIndex = i;
            }
        }
        if (desiredIndex == -1){
            System.out.println("The number is not within the array");
        } else{
        System.out.println("Your desired index is " + desiredIndex);
        }

        // // Task 2
        System.out.println("Enter the index of the first number");
        int indexSwap1 = scanner.nextInt();

        System.out.println("Enter the index of the second number");
        int indexSwap2 = scanner.nextInt();

        if (indexSwap1 >= myArray.length || indexSwap2 >= myArray.length){
            System.out.println("The index is out of range for out array");
        } else{
            int tempValue = myArray[indexSwap1];
            int tempValue2 = myArray[indexSwap2];
            myArray[indexSwap1] = tempValue2;
            myArray[indexSwap2] = tempValue;

            System.out.println("Swapped Array " + Arrays.toString(myArray)); 
        }

        //  Task 3
        // ascending order
        int [] ascArray = new int[myArray.length];
        for (int i = 0; i <= ascArray.length -1; i ++){ // looping through the ascArray
            int minIndex = 0;     
            for (int j = 1; j <= myArray.length - 1; j++){ // looping through myArray
                if (myArray[j] < myArray[minIndex]){
                    minIndex = j;
                }
            }
            ascArray[i] = myArray[minIndex];
            myArray[minIndex] = 100000; // replacing minimum value with a large number

        }
        System.out.println("Ascending Order: "+ Arrays.toString(ascArray));

        // descending order
        int[] descArray = new int[myArrayDuplicate.length];
        for (int i = 0; i <= ascArray.length -1; i ++){
            int maxIndex = 0;
            for (int j = 1; j <= myArrayDuplicate.length - 1; j++){
                if (myArrayDuplicate[j] > myArrayDuplicate[maxIndex]){
                    maxIndex = j;
                }
            }
            descArray[i] = myArrayDuplicate[maxIndex];
            myArrayDuplicate[maxIndex] = -1;

        }
        System.out.println("Descending Order: "+ Arrays.toString(descArray));

        // Task 4 (Linear Search)
        System.out.println("Enter the number you are looking for in linear Search");
        int search = scanner.nextInt();
        int searchIndex = -1;
        for (int i = 0; i <= myArray2.length - 1; i++){
            if (search == myArray2[i]){
                searchIndex = i;
            } 
        } 
        if (searchIndex == -1){
            System.out.println("Number not found within the array");
        } else{
            System.out.println("Number found at index " + searchIndex);
        }

        // Task 5 (Binary Search)
        Arrays.sort(myArray2);
        System.out.println("Enter the number you are looking for in Binary Search");
        int searchBin = scanner.nextInt();
        int leftIndex = 0;
        int rightIndex = myArray2.length - 1;
        boolean found = false; 

        while (leftIndex <= rightIndex){
            int middle = (leftIndex + rightIndex) / 2;
            if (myArray2[middle] == searchBin){
                System.out.println("Number found at index " + middle);
                found = true;
                break;
            } else if (myArray2[middle] < searchBin){
                leftIndex = middle + 1;
            } else{
                rightIndex = middle - 1;
            }

        }
        if (!found){
            System.out.println("The number is not within the array");
        }


       

    }
}