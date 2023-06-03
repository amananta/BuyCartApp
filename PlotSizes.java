package com.sample.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.TreeSet;

/*********
 * 
 * 			Set (1.2 I java.util)
 * 			  |
 * 		---------------------
 * 		|					|
 * 	HashSet				 SortedSet (1.2 I )
 * 							|
 * 						 NavigableSet  (1.6 I)
 * 							|
 * 						 TreeSet (1.2 class)
 * 
 * 
 * SortedSet methods :
 * 	> first()
 * 	> last()
 * 	> headSet(int num)
 * 	> tailSet(int num)
 * 	> subSet(int a, int b)
 * 
 * 
 * NavigableSet methods :
 * 	> lower(int num) < num
 * 	> floor(int num) <= num

 * 	> higher(int num)  > num
 * 	> ceiling(int num) >= num
 * 
 * 
 * ====== Table for showing time complexities of Collection classes ==================
 * 
 * 	Sr. No			Collection Class name			BackEnd DS			TimeComplexity
 * 		1.					ArrayList				Growable Array			O(1)
 * 							add(12), add(4, "Sham"), get(3), clear()
 * 		2. 					LinkedList				Doubly LinkedList		O(n)
 * 		3. 					Vector					Growable Array			O(1)
 * 		4. 					Stack					Growable Array			O(1)
 * 		5.
 * 		6.
 * 		7.
 * 		..
 * 		..
 * 		..
 * 		
 *  =============== Map Interface ==================== 
 * 	Set is having Map as backend data structure
 * 	> HashSet backend data structure is HashMap
 * 		> HashMap backend data structure is Hashtable
 * 			> Hashtable works on the principle of Hashing mechanism
 * 
 * 	> Map Implementations will accept Entry. Entry means a key and a value 
 * 	> Duplicate values are acceptable
 * 	> Duplicate nulls are ok (not is Hashtable)
 * 	> Duplicate keys are not allowed
 * 	> If duplicate keys are added, map will replace oldder value with new value
 * 		for that key
 * 
 * 
 * 
 */

public class PlotSizes {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> table1 = new Hashtable<>();
		
		table1.put(1, "Aditya");
		table1.put(4, "Ajay");
		table1.put(2, "Vedika");
		table1.put(10, "Prachi");
		
		table1.put(4, "Suyash");
		table1.put(4, "Sunita");
		
		System.out.println("Size = "+table1.size());
		System.out.println(table1);
		
		System.out.println("Value at 4th key = "+table1.get(4));
		
		
		
	}

}
