package kthLargestElemet;

import java.util.Arrays;
import java.util.Collections;

public class KTest {
	public static void largest(Integer[] arr, int k) {
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i=0;i<k;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ar=new Integer[] {1, 23, 12, 9, 30, 2, 50};
		int a=3;
		largest(ar, a);
		//time complexity is =O(nlogn)

	}

}
