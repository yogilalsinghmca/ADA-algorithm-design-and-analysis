package com.sorting;

public class BubbleSort {
	
	public static int [] sort(int [] input){
		int tmp;
		for(int i=0; i < input.length; i++){
			
			for(int j= 1;j < input.length - i;j++){
				
				if(input[j-1] >  input[j]){
				tmp = input[j-1];
				input[j-1] = input[j];
				input[j] = tmp;
				}				
			}
		}
		return input;
	}
}
