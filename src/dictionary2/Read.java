package dictionary2;

import java.io.IOException;
import java.util.Scanner;

public class Read {
	
	public static void main( String[] args ) throws IOException
	{
	  
	Scanner userInput = new Scanner(System.in);
	   String word = userInput.next();
	   doesFileExist(word);
	
	}
	
public static void doesFileExist(String path) {

	if (path.equalsIgnoreCase("Apple")) {
		System.out.println("word1:Apple");
		System.out.println("meaning1:a fruit");
		System.out.println("meaning2:a techfirm");
	}	
		
  else if (path.equalsIgnoreCase("Table")){

			System.out.println("word1:Table");
			System.out.println("meaning1:an object");
			System.out.println("meaning2:contains columns and rows when used in the context of computers");
			}
	else
			{
				System.out.println("file does not exist");
	}			
	
  }
}
