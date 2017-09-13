package com.coding.problem;

public class CamelCaseProblem {
	public static void  main(String [] argd) {		
		String input = "saveChangesInTheEditor";
		int count=1;
		String [] inputs = input.split("[A-Z]");
		for(Character c: input.toCharArray()){
			if(Character.isUpperCase(c))
			count++;
		}
		System.out.println(count);
		System.out.println(input.chars().filter(c -> Character.isUpperCase((char)c)).count()+1);

	}
	
	public static int findWords(String input){		
		return 0;		
	}

}
