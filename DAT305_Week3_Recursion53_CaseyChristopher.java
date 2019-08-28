/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dat305_week3_recursion5.pkg3_caseychristopher;

/**
 *
 * @author Christopher Casey
 */
public class DAT305_Week3_Recursion53_CaseyChristopher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Class for stored array
            int arr[] = {7, 22, 13, 77, 987, 43256};
            //iteration through array, incrementally increasing the placevalue holder i each pass through
            for(int i = 0; i < arr.length; ++i)
                //tracer method to ensure recursion is searching the entire array
                System.out.println(arr[i] + "");
            //final print of the largest found value
            System.out.println("\nThe largest number in the array is: " + findLargest(arr, arr.length - 1));
            
    }
    //Recursive search of array
    public static int findLargest(int[] arr, int index){
        if (index > 0){
            //search through index, returning the largest found integer
            return Math.max(arr[index], findLargest(arr, index - 1));
        
        }else{
            //if all numbers are the same, return the first value(first value of array is position 0)
            return arr[0];
        }
    }
    
}
