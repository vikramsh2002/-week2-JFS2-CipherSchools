package Maps;

import java.util.HashMap;
import java.util.Map;

public class DifferentTypesMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> frqmap = new HashMap<>();
		
		String word = "aaababagsfgsfdgfdgccfdc";
		char letter;
		for(int i=0;i<word.length();++i) {
			letter = word.charAt(i);
			if(frqmap.containsKey(letter)) {
				frqmap.put(letter,frqmap.get(letter)+1);
			}
			else {
				frqmap.put(letter,1);
			}
		}
	
		// Traverse Map
		// map has no iterator 
		// map has entryset() that returns entry one by one
		for(Map.Entry<Character, Integer> et: frqmap.entrySet()) {
			System.out.print(et.getKey() +" :    ");
			System.out.println(et.getValue());
			
		}
		
		
		

	}

}
