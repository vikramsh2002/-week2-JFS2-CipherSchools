package StackWithLL;
import java.util.LinkedList;
import java.util.Scanner;
public class StackingGrocery {
	public static void main(String []args) {
		// Grocrey 
		/*
		 * List of items in bag in a stacking way 
		 * These should not be any duplicay 
		 * 
		 * 
		 * */
		
		LinkedList grocery = new LinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of bag : ");
		int n = sc.nextInt();
		String item;
		
		for(int i=0;i<n;++i) {
			System.out.println("Enter the Element : ");
			
			item = sc.next();
			if(!(grocery.contains(item))) {
				grocery.push(item);
			}
		}
		System.out.println("The Top or Peek of Bag has : "+grocery.peek());
		
		// Removing element from stack
		// first n
		for(int i=0;i<3;++i) {
			System.out.println("The Grocery Bag removed : "+grocery.poll());
		}
		
		
		
		
		
		
	}
	

}
