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

import Sorting.*;
import java.util.Arrays;

public class GenericInsertionTest {
    
    public class TestingClass implements Comparable {
    
        char className;

        public TestingClass(char input){

            this.className = input;

        }//end TestingClass constructor
        
        public char getClassName(){
            return className;
        }
        
        @Override
        public int compareTo(Object p){

            if(!(p instanceof TestingClass)){
                System.out.println("Object does not belong to TestingClass");
                System.exit(0);
            }//end if

            if(this.className < ((TestingClass)p).className)
                return -1;
            if(this.className > ((TestingClass)p).className)
                return 1;
            return 0;

        }//end compareTo
        
    }//end Testingclass
    
    public void test(){
        
        //Create Testing objects
        TestingClass obj1 = new TestingClass('A');
        TestingClass obj2 = new TestingClass('B');
        TestingClass obj3 = new TestingClass('C');
        TestingClass obj4 = new TestingClass('D');
        
        TestingClass[] unsorted = {obj4, obj3, obj2, obj1};
        TestingClass[] sorted = {obj1, obj2, obj3, obj4};
        
        //Call insertion sort to sort
        InsertionSort.sort(unsorted);
        
        //Check that sort worked
        if(Arrays.equals(sorted, unsorted))
            System.out.println("Generic objects successfully sorted.");
        else
            System.out.println("Epic fail");
        
        
        
    }//end test
    
}//end class
