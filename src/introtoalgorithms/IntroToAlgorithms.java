/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package introtoalgorithms;

/**
 *
 * @author Max
 */

import Sorting.*;
import java.util.*;

public class IntroToAlgorithms {
    private static int size = 50;
    private static int max = 1000;
    
    public static void main(String[] args) {
        
        //Create array of random numbers
       Random random = new Random();
        int[] intArray = new int[size];
        for(int i = 0; i<size; i++)
           intArray[i] = random.nextInt(max);
        
        
        //Test insertion sort
        System.out.println("Array before sorting: ");
        for(int i = 0; i < size; i++)
            System.out.print(intArray[i] + " ");
        
        System.out.println();
        System.out.println("Array after sorting: ");
        InsertionSort.sort(intArray);
        for(int i = 0; i < size; i++)
            System.out.print(intArray[i] + " ");
        
        
    }
    
}
