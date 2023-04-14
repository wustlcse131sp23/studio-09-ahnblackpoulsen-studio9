package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Map<String, Integer> mappy = new HashMap<>();
		
		System.out.println("We will begin entering values. Type quit to not proceed. Type anything else to proceed.");
		while(!in.next().equals("quit"))
		{
			System.out.println("Enter key and value.");
			
			String name = in.next();
			int height = in.nextInt();
			
			mappy.put(name, height);
			
			System.out.println("Type any key to continue. Type quit to quit.");
		}
		
		String stringy = in.next();
		
		System.out.println("Who do you want to look up?");
		if (mappy.get(stringy) == null)
		{
			System.out.println("Nothing here pal");
		}
		else
		{
			System.out.println(mappy.get(stringy));
		}
		

	}
}
