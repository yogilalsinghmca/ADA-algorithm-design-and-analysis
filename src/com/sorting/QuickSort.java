package com.sorting;

public class QuickSort {

	public int partition(int [] array, int low, int high){

		int x = array[high];
		int i = low-1;
		int j = high +1;

		while(true){

			do{	j = j-1;} 
			while(array[j] <= x);

			do{i = i+1;}
			while(array[i] >= x);
			
			if(i<j){
				
			}
			return high;

		}

	}
}
