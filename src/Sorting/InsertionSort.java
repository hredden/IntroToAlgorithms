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

import java.util.*;


public class InsertionSort<T extends Comparable<? super T>> {
    
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
    
    //Generic insertion sort
    public static <T extends Comparable<? super T>> void sort(T[] x){
        
        T key;
        int index; 
        
        for (int j = 1; j < x.length; j++){
            
            key = x[j];
            index = j;
            
            while(index > 0 && (key.compareTo(x[index - 1]) < 0)){
                x[index] = x[index -1];
                index--;
            }//end while
        x[index] = key;
            
        }//end for
        
    }//end generic insertion sort
    
    
}//end class
