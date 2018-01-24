package binarySearch;

public class RecursiveImlp {
	
	int binarySarch(int arr[], int l, int r, int x) {
		if(l<r) {
			int mid=l+(r-l)/2;
			   // If the element is present at the middle itself
			 if(arr[mid]==x) {
				 return mid;
			 }

	            // If element is smaller than mid, then it can only
	            // be present in left subarray
			 
			 if(arr[mid]>x)
				 return binarySarch(arr, l, mid-1, x);
			 
			 // Else the element can only be present in right subarray
			 return binarySarch(arr, mid+1, r, x);
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursiveImlp r=new RecursiveImlp();
		int[] arr={2,3,4,10,40};
		int n=arr.length;
		int x=4;
		int result=r.binarySarch(arr, 0, n-1, x);
		if(result==-1) {
			System.out.println("element is not found...");
		}else {
			System.out.println("element is "+ result);
		}

	}

}
