package com.sorting;

public class MergeTwoArray {

	public static void main(String[] args) {
		int []a = {1,3,4,7,9};
		int [] b = {6,9,10,13,15,20};

		for(int x:merge(a,b)){
			System.out.print(x +" ");
		}
	}

	public static int []  merge(int []a, int [] b){

		int i=0,j=0,k=0;
		int c[] = new int [a.length + b.length];

		while(i<a.length && j< b.length){ 

			if(a[i] <= b[j]){
				c[k] = a[i];
				i++;
			} else {
				c[k] = b[j];
				j++;
			}
			k++;
		}
		while(j < b.length){
			c[k] = b[j];
			k++;
			j++;
		}
		while(i < a.length){
			c[k] = b[i];
			k++;
			i++;
		}

		return c;
	}

}
