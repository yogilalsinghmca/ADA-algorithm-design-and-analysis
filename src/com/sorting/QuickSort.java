package com.sorting;

public class QuickSort {
	
	public static void main(String[] args) {
		int a [] ={17,5,11,23,8,12,15};
		quickSort(a,0,6);

		for(int i : a){
			
			System.out.print(i + " ");
		}
	}
	/**
	 * @param a
	 * @param low
	 * @param high
	 */
	public static void quickSort(int [] a, int low, int high){

		if(low < high){
			int middle = partition(a,low,high);
			quickSort( a , low, middle);
			quickSort(a , middle+1, high);
		}
	}
	/**
	 * @param array
	 * @param low
	 * @param high
	 * @return
	 */
	public static int partition(int [] array, int low, int high){
		int x = array[high];
		int i = low-1;
		int j = high +1;
		int temp=0;

		while(true){			
			do{
				j--;
			}while(array[j] > x);

			do{
				i++;
			}while(array[i] < x);

			//swap the elements with i and j
			if(i < j){
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			} else {
				// it means there is no element left in left side which is greater than x				
				break;
			}			
		}
		// swap the element at low with j			
		temp=array[low];
		array[low] = array[j];
		array[j]=temp;
		return j;
	}
}
