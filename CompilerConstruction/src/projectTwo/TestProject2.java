package projectTwo;

import java.util.List;
import java.util.Set;

public class TestProject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Symbols symbols = new Symbols();
		symbols.readGrammarFile("grammar.txt");
		List<String> ruleList = symbols.getSimpleRulesList();
		Set<String> terminals = symbols.getTerminalSet();
		Set<String> nonTerminals = symbols.getNonTerminalSet();
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
		
		//parse grammar.
		
		//populate symbol sets.
		
		//create LL table
		
		//create follow set.
		
		//run parse machine
		
		//create PST
		
		//create PST to AST.
	}

}
