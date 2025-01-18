package arrayjava.src.arrayjava_practice;

import java.util.Arrays;

public class Array_P {
	
	public static void main(String args[]) {
		
		int[] intarr = {12,4,56,87,98,45,65};
		
		System.out.println("the array is "+Arrays.toString(intarr));
		System.out.println("---------sorted array-------------");
		Arrays.sort(intarr);
		System.out.println("the sorted array is:"+ Arrays.toString(intarr)+"\n");
		int key=87;
		
		System.out.println(key+" is found at index:" + Arrays.binarySearch(intarr, key));
	}

}
