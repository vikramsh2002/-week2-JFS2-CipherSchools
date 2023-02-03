package thisKeyword;

public class mainClass {
	private int args=10;
	public void add(int args) {
		args=args;
	}
	
	public void addByThis(int args) {
		this.args = args; // this---> refer to current object
	}
	public int getargs() {
		return args;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainClass mc = new mainClass();
		mc.add(20);
		System.out.println(mc.getargs()); // 10 only 
		
		mc.addByThis(20);
		System.out.print(mc.getargs()); // 20 

	}

}
