package kthLargestElemet;

public class ThirdLargest {
	public static void larg(int[] arr) {
		int fst, sec, thd;
		 thd = fst = sec = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>fst) {
				thd=sec;
				sec=fst;
				fst=arr[i];
				
			}else if(arr[i]>sec) {
				thd=sec;
				sec=arr[i];
			}
			else if(arr[i]>thd) {
				thd=arr[i];
			}
		}
		System.out.println("Three largest elements are " +
                fst + " " + sec + " " + thd);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 13, 1, 10, 34, 1};
		larg(arr);

	}

}
