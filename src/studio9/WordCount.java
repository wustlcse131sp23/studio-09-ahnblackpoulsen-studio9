package studio9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import support.cse131.NotYetImplementedException;

public class WordCount {
	/**
	 * Constructs and returns a map of the distinct words in the specified list with
	 * each word associated with its accumulated count (that is: the number of
	 * occurrences of the word in the list).
	 * 
	 * For example, if passed a List<String> containing:
	 * 
	 * [to, be, or, not, to, be]
	 * 
	 * the resulting Map<String, Integer> would contain
	 * 
	 * key="to", value=2;
	 * key="be", value=2;
	 * key="or", value=1;
	 * key="not", value=1;
	 * 
	 * @param words
	 * @return a map which contains all of the distinct words as keys, each
	 *         associated with the number of occurrences of the word
	 */
	public static Map<String, Integer> countWords(List<String> words) {
		
//		String temp = "";
		
		int count = 0;
		
		Map<String, Integer> map = new HashMap <>();
		
		for (String i: words) {
			
//			map.put(i, count + 1);
			
			if (map.get(i)==null) {
				map.put(i, 1);

			}
			else {
				int uh = map.get(i);
				map.put(i, uh + 1);
			}
			
//			temp = i;
//			String temp2 = "";
//			if (temp2.equals(i))
//			{
//				
//			}
		}
		
		return map;

	}
	
	
//	public static void main (String[] args) {
//		
//		List<String> listy = new ArrayList<>();
//		listy.add("to");
//		listy.add("be");
//		listy.add("or");
//		listy.add("not");
//		listy.add("to");
//		listy.add("be");
//		
//		System.out.println(countWords(listy));
//		
//	}
	
}
