package com.coding.problem;

public class LongestContiguousSubArray {	
	public static void main(String[] args) {
		int [] a = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
		System.out.println(findLengthOfLargestContiguousArra(a));
	}
	public static int findLengthOfLargestContiguousArra(int [] arr){
		int finalSum=0;
		int tmpSum=0;
		int prevNumber=0, count=0,tempCount =0;
		for(int a:arr){
			
			if(prevNumber > a){
				tempCount = tmpSum = 0;
			}
			tmpSum = tmpSum +a;
			tempCount++;
			
			if( tmpSum > finalSum){
				finalSum = tmpSum;
				count =tempCount;
			}
			prevNumber = a;
		}
		
		return count;
		
	}
}
