package com.sorting;

import org.junit.Test;

public class TestBubbleSort {
	
	@Test
	public void testSort(){
		
		int [] input = {3,5,2,78,1,45};		
		BubbleSort.sort(input);
		for(int a:input)
			System.out.print(a + " ");
		
	}

}
