package UncheckedException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisionException {
	int n1,n2,result;
	public static Scanner sc = new Scanner(System.in);
	
	void Cal() {
		try {
		System.out.println("Enter the First Number : ");
		n1=sc.nextInt();   // ------> Mismatch exception
		System.out.println("Enter the Second Number : ");
		n2 = sc.nextInt(); // ------> Mismatch exception
		
		// Divide
		result  = n1/n2;  // -----> can have ZeroDivision i.e., Arithmetic Exception
		
		System.out.println(" The result is : "+result);
		}
		catch(InputMismatchException e) {
			System.out.println("Error : There is Input type mismatch occurs ");
			e.printStackTrace();
			
		}
		catch(ArithmeticException e) {
			System.out.println("Error :  Trying to divide by zero ");
		}
		System.out.println("After catch...");
		
		/*finally {
			System.out.println("Always run");
		}*/
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisionException de = new DivisionException();
		de.Cal();

	}

}
