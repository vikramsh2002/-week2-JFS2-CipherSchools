package finalKeyword;
class Father{
	public final String Lastname="Sharma";
	Father(){
		System.out.println("Name : Sham "+Lastname);
	}
}

class Son extends Father{
	Son(){
		//Lastname="Oberior"; // ====> Not allow since final variable
		System.out.println("Name : Ram "+Lastname);
	}
}
public class finalVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1 = new Son();
		

	}

}
