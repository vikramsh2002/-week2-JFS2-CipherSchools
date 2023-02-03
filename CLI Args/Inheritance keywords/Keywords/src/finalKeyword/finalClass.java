package finalKeyword;

final class NonInheritable{
	NonInheritable(){
		System.out.println(" None of the class can Inherits the final class");
		System.out.println(" Real application of this is String Class used");
	}
}

/*class A extends NonInheritable{
	
	// Not ALLOW
}*/
public class finalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     NonInheritable n1 = new NonInheritable();
     
	}

}
