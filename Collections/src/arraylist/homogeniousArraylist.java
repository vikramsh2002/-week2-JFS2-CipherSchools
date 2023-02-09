package arraylist;
import java.util.ArrayList;
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
		

	}

}
