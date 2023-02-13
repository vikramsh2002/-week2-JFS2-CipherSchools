package arraylist;
import java.util.ArrayList;
import java.util.Comparator;
public class homogeniousArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> states= new ArrayList<String>();
		
		states.add("Rajasthan");
		states.add("MP");
		states.add("UP");
		states.add("J & K");
		states.add("Punjab");
		
		System.out.println(" Arraylist : "+states);
		System.out.println(" Element Count : "+states.size());
		System.out.println(" Element at index 2 : "+states.get(2));
		
		System.out.println("The States are : ");
		// Traverse Array
		for(String state:states) {
			System.out.println(state);
		}
		
		// Update the State
		states.set(2, "Gujarat");
		
		System.out.println("After Updation : "+states);
		
		
		// Remove the sepecific element and show 
		System.out.println("Element remove is : "+states.remove(1));
		System.out.println("After Removal  "+states);
		
		states.add("east india");
		// Sort the arraylist
		states.sort(Comparator.reverseOrder());
		System.out.println(""+states); // Natural order :  A-Z,a-z,nO
		// Reverse a-z,A-Z
		
		
		// Check presense of item in list
		System.out.print("Is UP in the List : "+states.contains("UP"));
		
		
		// Check empty or not 
		if(states.isEmpty()) {
			System.out.println("Yes the Arraylist is Empty");
		}
		else {
			System.out.println("Yes the Arraylist is not Empty");
		}
		
		
		// Removing all the elements
		states.removeAll(states);
		
		if(states.isEmpty()) {
			System.out.println("Yes the Arraylist is Empty");
		}
		
		
		
		
		
		

	}

}
