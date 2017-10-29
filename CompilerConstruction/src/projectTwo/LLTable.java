package projectTwo;

import java.util.List;
import java.util.Map;

public class LLTable {
	Map<String, Integer> terminalSymMap;
	Map<String, Integer> nonTerminalSymMap;
	List<String> simpleRulesList;
	Map<Integer, List<String>> firstSetMap;
	
	public LLTable() {
		terminalSymMap = Symbols.getTerminalSymMap(); //m
		nonTerminalSymMap = Symbols.getNonTerminalSymMap(); //n
		simpleRulesList = Symbols.getSimpleRulesList();
		firstSetMap = FirstSet.getFirstSetMap();
	}
	
	public int[][] populateLLTable() {
		int[][] array = new int[nonTerminalSymMap.size()][terminalSymMap.size()];
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[0].length; j++) {
				//System.out.println(array[i][j]+"\\t");
				array[i][j] = -1;
			}
//			System.out.println();
		}
		int index = 0;
		for(String thisRule : simpleRulesList) {
			String lhs = thisRule.split("=")[0].trim();
			int m = nonTerminalSymMap.get(lhs);
			List<String> firstSetResult = firstSetMap.get(index);
			if(firstSetResult != null) {
				for(String terminalSym : firstSetResult) {
					int n = terminalSymMap.get(terminalSym);
					array[m][n] = index;
				}
			}
			index++;
		}
		//for each rule id
		// get the LHS N-T and position (say n)
		//get the first set of this rule id
		//for each element in first set
			//determine the position (T)
			//insert in array[m][T]
		
		return array;
	}
}
