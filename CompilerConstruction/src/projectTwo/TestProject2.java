package projectTwo;

import java.util.List;
import java.util.Map;

public class TestProject2 {
	static List<String> ruleList;
	static Map<String, Integer> terminals;
	static Map<String, Integer> nonTerminals;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Symbols symbols = new Symbols();
		
		//parse grammar and populate Terminal and Non-Terminal Symbol Set
		symbols.readGrammarFile("grammarTest.txt");
		
		//create first Set.
		
		//create follow set.
		
		//create LL table.
		
		
		ruleList = symbols.getSimpleRulesList();
		terminals = symbols.getTerminalSymMap();
		nonTerminals = symbols.getNonTerminalSymMap();
		System.out.println("Printing All Simple Rules:");
		for(String str : ruleList) {
			System.out.println(str);
		}
		System.out.println("Printing non-terminal symbols:");
		for(Map.Entry<String, Integer> str : nonTerminals.entrySet()) {
			System.out.println(str.getKey()+" : "+str.getValue());
		}
		System.out.println("Printing Terminal symbols:");
		for(Map.Entry<String, Integer> str : terminals.entrySet()) {
			System.out.println(str.getKey()+" : "+str.getValue());
		}

		
		
		
		
		//create follow set. Not to Do.
		
		//run parse machine
		
		//create PST
		
		//create PST to AST.
	}

}
