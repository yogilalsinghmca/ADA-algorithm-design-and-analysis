package com.coding.problem;

public class StringUniquenessChecker {
	
	
	public static void main(String[] args) {
		String name ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_-+=~`;:'\"\\"
				+ ",<>.?/{[}]|";
		System.out.println(isStringUnique(name));
	}
	
	public static boolean isStringUnique(String name){
		
		boolean [] charset = new boolean[256];
		
		for(int i=0;i< name.length();i++){ 
			
			int value = name.charAt(i);

			if(charset[value]){
				return false;				
			}
			charset[value]=true;
		}
		return true;
	}
}
