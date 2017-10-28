package projectTwo;

import java.util.List;
import java.util.Set;

public class TestProject2 {
	static List<String> ruleList;
	static Set<String> terminals;
	static Set<String> nonTerminals;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Symbols symbols = new Symbols();
		
		//parse grammar and populate Terminal and Non-Terminal Symbol Set
		symbols.readGrammarFile("grammarTest.txt");
		
		//create first Set.
		
		//create follow set.
		
		//create LL table.
		
		
		ruleList = symbols.getSimpleRulesList();
		terminals = symbols.getTerminalSet();
		nonTerminals = symbols.getNonTerminalSet();
		System.out.println("Printing All Simple Rules:");
		for(String str : ruleList) {
			System.out.println(str);
		}
		System.out.println("Printing non-terminal symbols:");
		for(String str : nonTerminals) {
			System.out.println(str);
		}
		System.out.println("Printing Terminal symbols:");
		for(String str : terminals) {
			System.out.println(str);
		}
		
	
		
		
		
		//create follow set.
		
		//run parse machine
		
		//create PST
		
		//create PST to AST.
	}

}
