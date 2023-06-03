package com.sample.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.StringJoiner;
import java.util.TreeSet;
import java.util.Vector;

/******
 * 
 * Properties of Set interface childen > It will not allow duplicates > It will
 * not preserve insertion order(except LinkedHashSet) > It will allow only one
 * null (except TreeSet which will not allow any null)
 * 
 * 
 * Client requirement -- best suitable collection class
 *
 * 1. Need duplicates Frequent add/remove operations LinkedList
 *
 * 2. Need duplicates Frequent search operations Vector Thread safety
 *
 * 3. Need duplicates Frequent search operations ArrayList
 * 
 * 4. Only unique elements HashSet fast searching
 *
 * 5. Remove duplicates LinkedHashSet Need insertion order
 *
 * 6. REMOVE DUPLICATE Sorting is needed TreeSet
 *
 *
 * Properties of TreeSet > It will remove duplicates > It will give you natural
 * sorting > It won't accept a single null.
 *
 *
 *
 *
 *
 *	Comparable -->  1.2 -->  java.lang --> compareTo(Object o1)     --------> Natural Sorting
 *  Comparator -->  1.2 -->  java.util --> compare(Object o1, Object o2) ---> Custom sorting
 *  
 *  
 */


public class Employee {
	
	public static void main(String[] args) {
		   int[] numbers = {10, 5, 8, 3, 12, 6};
	        
	        int maxNumber = Arrays.stream(numbers)
	                              .max()
	                              .orElse(0);
	                              
	        System.out.println("The maximum number is: " + maxNumber);
	}
	
	
}




