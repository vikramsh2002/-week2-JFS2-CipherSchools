package linkedList;
import java.util.LinkedList;
import java.util.Iterator;
public class basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedList<String> myll = new LinkedList<String>();
			myll.add("Ironman");
			myll.add("Thor");
			myll.add("Hulk");
			myll.add("Spiderman");
			myll.add("Star Wark");
			
			System.out.println(myll.get(2));
			Iterator itr = myll.iterator();
			while(itr.hasNext())
			{
				//itr.remove();
				System.out.print(itr+" ");
				
			}
			
			
			// Stack in LL
		    
	}	

}
