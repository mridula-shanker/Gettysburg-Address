import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ArrayListReplace
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		ArrayList<String> wordArray = new ArrayList<String>();
		Scanner file = new Scanner(new File("GettysburgAddress.txt"));
		int maxLen = 0;
		String longestWord = "";
		int totLen = 0;
		int wordCount = 0;

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
