import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Mridula Shanker
 *
 */
public class GettysburgAddress 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner file = new Scanner(new File("GettysburgAddress.txt"));
		int maxLen = 0;
		String longestWord = "";
		int totLength=0; 
		int wordCount=0;
		while (file.hasNext())
		{
			String word = file.next();
			int wordLen = word.length();
			totLength = totLength + wordLen;
			wordCount++;
			if (maxLen < wordLen)
			{
				maxLen = wordLen;
				longestWord = word;
			}
		}
		int averageLen = totLength/wordCount;
		System.out.println("Longest Word: " + longestWord + " ; Length of Longest Word " + maxLen );
		System.out.println("Total Words " + wordCount + " ; Average Length " + averageLen);

	}
}
