package projectTwo;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
	private Map<String, Integer> terminalSymMap = null;
	private Map<String, Integer> nonTerminalSymMap = null;
	Map<String, List<Integer>> nonTerminalVsRuleIdsMap = new HashMap<String, List<Integer>>();
	
	public List<String> getSimpleRulesList() {
		return simpleRulesList;
	}
	
	
	public Map<String, Integer> getTerminalSymMap() {
		return terminalSymMap;
	}
	
	

	public Map<String, Integer> getNonTerminalSymMap() {
		return nonTerminalSymMap;
	}


	protected void readGrammarFile(String fileName) {
		File file = new File(fileName);
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			String thisLine = "";
			//Scanner sc = new Scanner(System.in);
			//String thisLine = "";
			List<String> thisList = new ArrayList<String>();
			Useless obj = new Useless();
			//this will wait for an empty newline for termination.
			while(sc.hasNextLine() && !(thisLine = sc.nextLine()).equals("")) {
				//thisLine = sc.nextLine();
				//populate terminal and nonTerminal Sets.
				//parseSymbols(thisLine);
				thisList = obj.parseOneLine(thisLine);
				for(String s : thisList) {
					simpleRulesList.add(s);
					parseSymbols(s);
				}
			}
			terminalSymMap = convertSetToMap(terminalSet);
			nonTerminalSymMap = convertSetToMap(nonTerminalSet);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			
		}
		
	}
	/***
	 * this method parses a line of grammar and populates terminal and non-terminal sets with the respective sets. 
	 * @param line
	 */
	private void parseSymbols(String line) {
		String[] words = line.split("\\s+");
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
	
	private Map<String, Integer> convertSetToMap(Set<String> set) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		int id = 0;
		for(String s : set) {
			map.put(s, id++);
		}
		return map;
	}
}
