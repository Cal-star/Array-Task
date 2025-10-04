import java.util.Arrays;
public class ArrayClass{
    public static void main(String [] args){
        // Creating an empty list
        double[] heightArray = new double[10];
        // Assigining to an array
        heightArray[2] = 10;
        System.out.println(Arrays.toString(heightArray));
        // initialixing the array with your values at once
        int[] myNumbers = {10, 56, 32, 56};
        System.out.println(Arrays.toString(myNumbers));
        // Accessing a number in the int array
        System.out.println(myNumbers[2]);        
    }
}