package sumCloseTozero;

public class Test {
	static void sum(int[] arr) {
		int fst=arr[0];
		int snd=arr[1];
		int msum=fst+snd;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int sum=arr[i]+arr[j];
				if(Math.abs(msum)>Math.abs(sum)) {
					msum=sum;
					fst=i;
					snd=j;
				}
					
				System.out.println("element are "+arr[fst]+arr[snd]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1, 60, -10, -70, 75, -80};
		 sum(arr);

	}

}
