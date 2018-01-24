package maxelemetDemo;

public class MaxElement1 {
	static void max(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<arr[i+1]) {
				i=i+1;
			}
			if(arr[i]>arr[i+1]) {
				System.out.println(arr[i]);
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 30, 40, 50, 60, 70, 23, 20};
		max(arr);

	}

}
