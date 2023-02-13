package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DifferentSetsAndThereUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * There are types of Sets 
		 * 1. HashSet : It is type of Data Structure that doesn't allow the duplicates no order maintain
		 * 2. Linked HashSet:  It is extented version of hashset that maintains the order of insertion 
		 * 3. Tree Set : It is a Set that doesn't allow null and stores as ascending order 
		 * 
		 * Sets uses hashmap as base since to maintain the non-duplicay since elements passes as keys of it
		 * */
		
		HashSet<String> hs = new HashSet<String>();
		hs.add(null);
		hs.add("red");
		hs.add(null);
		hs.add("blue");
		hs.add("blue");
		hs.add("green");
		hs.add("aqua");
		
		System.out.println(hs +"  Here Order is not Maintained");
		
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add(null);
		lhs.add("red");
		lhs.add(null);
		lhs.add("blue");
		lhs.add("blue");
		lhs.add("green");
		lhs.add("aqua");
		System.out.println(lhs +"  Here Order is  Maintained");
		
		
		
		TreeSet<String> ts = new TreeSet<String>();
		//ts.add(null);  /// >>>>>>> Null can't be compare so Null Pinter Exception
		ts.add("red");
		//ts.add(null);
		ts.add("blue");
		ts.add("blue");
		ts.add("green");
		ts.add("aqua");
		System.out.println(ts +"  Here Sorted According to the natural Order Since uses Comparable Interface and Navigable Map");
		
		
		
		
		
		
		
		
		

	}

}
