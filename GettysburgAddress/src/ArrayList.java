import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ArrayList 
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
			//String word = file.next();
			int wordLen = word.length();
			if (maxLen < wordLen)
			{
				maxLen = wordLen;
				longestWord = word;
			}
			
			int averageLen = totLen/wordCount;
			System.out.println("Longest Word: "+ longestWord);
			System.out.println("Length of longest word: "+ maxLen);
			System.out.println("Total Words: "+ wordCount);
			System.out.println("Average Length: "+ averageLen);
		}
	}

}
