package binarySearch;

public class IterarativeImpl {
	int bs(int arr[], int x) {
		int l=0;
		int r=arr.length-1;
		while(l<=r) {
			int m=l+(r-l)/2;
			
			if(arr[m]==x) {
				return m;
			}
			if(arr[m]<x) {
				l=m+1;
			}else {
				r=m-1;
			}
			
		}
		
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IterarativeImpl i=new IterarativeImpl();
		  int arr[] = {2, 3, 4, 10, 40};
		int n= arr.length;
		int x=10;
		int res=i.bs(arr, x);
		if(res==-1) {
			System.out.println("element is not found...");
		}else {
			System.out.println(res);
		}
		
      

	}

}
