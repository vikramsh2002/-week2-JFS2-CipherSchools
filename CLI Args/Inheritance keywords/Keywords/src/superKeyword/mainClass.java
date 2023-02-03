package superKeyword;


class Apps {
	private int servers=1;
	Apps(){
		
		System.out.println("App is Running on By Default servers i.e., "+servers);
	}
	
	Apps(int s){
		if(s>servers)
		{	servers=s;
		   System.out.println("App is Running on Configured servers i.e., "+servers);
		}
		else
			System.out.println("Invalid Server Count reset to Default i.e.,"+servers);
		
	}
}

class MsWord extends Apps{
	MsWord(){
		super(10); // call the parent's Parameterize constructor
		System.out.println("MS word is Running  servers");
	}
}
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MsWord ins1  = new MsWord();
		

	}

}
