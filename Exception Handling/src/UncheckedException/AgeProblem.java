package UncheckedException;
import java.util.Scanner;
public class AgeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("What is Your Age : ");
		int age= sc.nextInt(); // pass char or String ====>Throws unchecked exception  mismatch exception
		/*
		 * To handle it we need to use try-catch or try-finally block
		 * 
		 * */
		
		if(age>=18) {
			System.out.println("Eligible for voting");
		}
		else {
			System.out.println("Not Eligible");
		}

	}

}
