package vector;

import java.util.Iterator;
import java.util.Vector;
public class Vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vector<Integer> v1 = new Vector<Integer>();
      v1.add(10);
      v1.add(20);
      v1.add(30);
      v1.add(40);
      v1.add(50);

	
	// Traverse a Vector
      // It is synchronous means locking is used so no current manipulation allow
      Iterator pointer = v1.iterator();
      while(pointer.hasNext()) {
    	  
    	  System.out.println(pointer.next());
      }
	
      for(int e:v1) {
    	  System.out.print(e+" ");
      }
	}

}
