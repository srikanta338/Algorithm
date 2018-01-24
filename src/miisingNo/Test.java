package miisingNo;

public class Test {
	static int miss(int[] arr) {
		int total= (arr.length+1)*(arr.length+2)/2;
		for(int i=0; i<arr.length;i++) {
			total -= arr[i];
			
		}
		return total;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,4,5,6};
		 int rr=miss(arr);
		 System.out.println(rr);

	}

}
