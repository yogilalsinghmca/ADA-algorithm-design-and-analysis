package com.coding.problem;

public class XORvsSum {
	public static void main(String[] args) {
		findN(10,5);
	}
	
	public static int findN(int number, int n){
		int count =0;
		for(int i=0; i<= n;i++){
			
			if(i+number == (number^i)){
				count++;
			}
		}
		System.out.println(count);
		return n;
		
	}

}
