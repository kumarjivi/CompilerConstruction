package projectTwo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Symbols {
	/***
	 * This method reads grammar file and creates sets of terminal and non-terminal symbols.
	 * Also, it requests to simplify each line of grammar.
	 * @param fileName
	 */
	private List<String> simpleRulesList = new ArrayList<String>();
	private Set<String> terminalSet = new HashSet<String>();
	private Set<String> nonTerminalSet = new HashSet<String>();
	
	public List<String> getSimpleRulesList() {
		return simpleRulesList;
	}
	public Set<String> getTerminalSet() {
		return terminalSet;
	}
	public Set<String> getNonTerminalSet() {
		return nonTerminalSet;
	}
	protected void readGrammarFile(String fileName) {
		Scanner sc = new Scanner(System.in);
		String thisLine = "";
		List<String> thisList = new ArrayList<String>();
		Useless obj = new Useless();
		//this will wait for an empty newline for termination.
		while(sc.hasNextLine() && !(thisLine = sc.nextLine()).equals("")) {
			thisLine = sc.nextLine();
			//populate terminal and nonTerminal Sets.
			parseSymbols(thisLine);
			thisList = obj.parseOneLine(thisLine);
			for(String s : thisList) {
				simpleRulesList.add(s);
			}
		}
	}
	/***
	 * this method parses a line of grammar and populates terminal and non-terminal sets with the respective sets. 
	 * @param line
	 */
	private void parseSymbols(String line) {
		String[] words = line.split("//s+");
		String thisWord = "";
		char thisChar = ' ';
		for(int i=0; i<words.length; i++) {
			thisWord = words[i];
			if(thisWord != "=" && thisWord != "|") {
				thisChar = thisWord.charAt(0);
				if(thisChar >= 65 && thisChar <= 90) {//this symbol starts with Capital Letter and is a non-Terminal symbol.
					nonTerminalSet.add(thisWord);
				} else if (thisChar >= 97 && thisChar <= 122) {//this symbol starts with Small Letter and is a terminal symbol.
					terminalSet.add(thisWord);
				}
			}
		}
	}
}
