package countOccurance;

public class OTest1 {
	static int occuracne(int[] arr, int n) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i]) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
		int n=2;
		System.out.println(occuracne(arr, n));

	}

}
