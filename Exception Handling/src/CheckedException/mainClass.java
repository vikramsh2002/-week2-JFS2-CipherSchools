package CheckedException;
import java.io.File;
import java.io.IOException;
public class mainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      File f1 = new File(".\\abc.txt");
      
      f1.createNewFile();  // It may throws IO Exception  ====> Need to Handle before running = Checked Excep
      /*
       * Handle it by try-catch or by throws(clarify) 
       * 
       * */
     
     
      
	}

}
