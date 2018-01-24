package sumCloseTozero;

public class Main {
	static void minAbsSumPair(int arr[], int arrSize) {
		int count=0;
		int l, r, minSum, sum, minl, minr;
		if(arrSize<2) {
			System.out.println("invalid input..");
		
		}
		minl=0;
		minr=1;
		minSum=arr[0]+arr[1];
		for(l=0;l<arrSize-1;l++) {
			for(r=l+1; r<arrSize; r++) {
				sum=arr[l]+arr[r];
				if(Math.abs(minSum)>Math.abs(sum)) {
					minSum=sum;
					minl=l;
					minr=r;
				}
			}
		}
		System.out.println(" The two elements whose "+
                "sum is minimum are "+
          arr[minl]+ " and "+arr[minr]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1, 60, -10, -70, 75, -80};
	        minAbsSumPair(arr, 6);

	}

}
