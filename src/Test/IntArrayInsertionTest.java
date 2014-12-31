/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

/**
 *
 * @author Max
 */
import java.util.Arrays;
import Sorting.*;

public class IntArrayInsertionTest {
    private int[] unsortedArray;
    private int[] sortedArray;
    private int count;
    private final int SIZE = 100;
    
    public IntArrayInsertionTest(){
        
        //unsorted array from 100..1
        unsortedArray = new int[SIZE];
        count = 100;
        for(int i = 0; i < SIZE; i++){
           unsortedArray[i] = count;
           count--;
        }//end for
        
        //sorted array 1..100
        sortedArray = new int[SIZE];
        count = 1;
        for(int i = 0; i< SIZE; i++){
            sortedArray[i] = count;
            count++;          
        }//end for
        
    }//end constructor
    
    public void test(){
        //sort unsorted array
        InsertionSort.sort(unsortedArray);
        
        //check that newly sorted array is sorted
        if(Arrays.equals(sortedArray, sortedArray))
            System.out.println("Success: Array was properly sorted");
        else
            System.out.println("You suck at life");
    }
    
    
}//end class
