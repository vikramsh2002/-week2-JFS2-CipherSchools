package vector;
import java.util.Vector;
import java.util.Scanner;
class Product{
	double prodamt;
	String name;
}
public class ProductsBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Product>  p1 = new Vector<Product>();
		
		Product p;
		while(true) {
			System.out.println("Enter Product Name and Price : ");
			Scanner sc = new Scanner(System.in);
		    p= new Product(); 
			p.name = sc.nextLine();
			p.prodamt=sc.nextDouble();
			
			p1.add(p);
			
			System.out.println("Want to Add more Product : 1 for Yes and 2 for No ");
			int ch = sc.nextInt();
			if(ch==2) {
				break;
			}
		}
		double sum = p1.stream().mapToDouble(e -> e.prodamt).sum();
		System.out.println("The Total Amount is : "+sum+" \n List Product is : ");
		for(Product p2:p1 ) {
			System.out.println(p2.name+" ");
		}
		
		
		
		

	}

}
