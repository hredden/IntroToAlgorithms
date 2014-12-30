/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sorting;

/**
 *
 * @author Max
 */


public class InsertionSort {
    
    //Constructor for integer array
    public static void sort (int[] arrayToSort){
        
        int key;
        int index;
        
        for(int j = 1; j < arrayToSort.length; j++){
           key = arrayToSort[j];
           index = j;
           
           while(index > 0 && arrayToSort[index - 1] > key){
               
               arrayToSort[index] = arrayToSort[index - 1];
               index--;
               
           }//end while
        
        arrayToSort[index] = key;
           
        }//end for
        
        
    }//end int insertion sort
    
}//end class
