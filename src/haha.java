
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class haha {

	public static void main(String[] args) throws FileNotFoundException {
	
		System.out.println("hey hey ");
		
		Scanner in = new Scanner ( new File("Student.txt"));
		 
		while (in.hasNextLine()){
			System.out.println(in.nextLine());
		}

	}

}
