package finalKeyword;
class Animal{
	public final void run() {
		System.out.println("I can Run");
	}
}
class Lion extends Animal{
	/*
	@Override 
	public  void run() {
		System.out.println("I can't run");
	}*/ // This not possible means an final method can't be override 
}
public class finalMethods {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Lion l1 = new Lion();
		l1.run();

	}

}
