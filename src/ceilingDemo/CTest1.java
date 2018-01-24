package ceilingDemo;

public class CTest1 {
	static int cieling(int[] arr, int low, int high, int x) {
		if(x<=arr[low]) {
			return low;
		}
		for(int i=low;i<high;i++) {
			if(arr[i]==x) {
				return i;
			}
			if(arr[i] < x && arr[i+1] >= x) {
				return i+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1, 2, 8, 10, 10, 12, 19};
		 int n=arr.length;
		 int x=3;
		 int index=cieling(arr, 0, n, x);
		 if(index==-1) {
			 System.out.println("not exist..."); 
		 }else{
			 System.out.println("exist "+arr[index]);
		 }
		 

	}

}
