
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class haha {

	private static Scanner in;

	public static void main(String[] args) throws FileNotFoundException {
	
		System.out.println("hey hey");
		
		in = new Scanner ( new File("Student.txt"));
		List<String> Students = new ArrayList<String> ();
		 
		while (in.hasNextLine()){
			Students.add(in.nextLine());
		}
		for (int i =0; i<Students.size(); i++){
			System.out.println(Students.get(i));
		}

	}

}
