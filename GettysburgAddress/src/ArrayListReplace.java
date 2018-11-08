import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListReplace
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		ArrayList<String> wordArray = new ArrayList<String>();
		Scanner file = new Scanner(new File("GettysburgAddress.txt"));

		while (file.hasNext())
		{
			wordArray.add(file.next());
		}
		
		for (String word : wordArray)
		{
			System.out.println(word.replaceAll("\\p{P}",""));
		}
	}

}
