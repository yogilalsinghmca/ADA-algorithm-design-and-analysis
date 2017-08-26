package com.sorting;

public class MergeSort {
	public static void main(String[] args) {
		int a [] ={17,5,11,23,8,12,15};
		mergeSort(a,0,6);
		
		for(int i:a){
			System.out.print(i+ " ");
		}
	}
	public static void mergeSort(int [] a,int low, int high){
		
		if(low < high){
		 int middle = (low +high)/2;
			mergeSort(a,low,middle);
			mergeSort(a,middle+1,high);
			merge(a,low,middle,high);
		}		
	}

	public static int [] merge(int [] a, int low, int middle, int high){

		int startA =low;
		int startB = middle+1;
		int k=0;
		int [] arr = new int[high-low + 1];

		while(startA <= middle && startB <= high){

			if(a[startA] < a[startB]){
				arr[k] = a[startA];
				startA++;
			} else{
				arr[k] = a[startB];
				startB++;
			}
			k++;
		}		
		while(startA<= middle){
			arr[k] = a[startA];
			k++;
			startA++;
		}
		while(startB<= high){
			arr[k] = a[startB];
			k++;
			startB++;
		}		
		for(int i=0;i<arr.length;i++){
			a[low] = arr[i];
			low++;
		}
		return a;
	}
}
