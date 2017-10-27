package projectTwo;

import java.util.List;

public class Useless {
	/***
	 * takes one line of grammar as it is from the input file
	 * and converts in to separate rules.
	 * @param line
	 * @return
	 */
	public List<String> parseOneLine(String line) {
		//List<String> output = new 
		if(detectRecursion(line)) {
			
		}
		//check if recursion exists,
		//if yes,
		//resolve and get simple rules.
		//if no,
		//split by pipe and get simple rules.
		return null;
	}
	
	/***
	 * takes a line of grammar, and checks if there is a recursion present.
	 * @param line
	 * @return
	 */
	public boolean detectRecursion(String line) {
		return false;
	}
	
	/***
	 * takes a line of grammar, and resolves recursion, if present.
	 * @param line
	 * @return
	 */
	public List<String> resolveRecursion(String line) {
		return null;
	}
	
	
}
