package in.ineuron;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,4,3,2,1};
		System.out.println(peakElementIndex(arr, arr.length-1));
		
	}
	
	public static int peakElementIndex(int[] arr, int n) {
		
		if(arr[0]>arr[1]) return 0;
		if(arr[n-1]>arr[n-2]) return n-1;
		
		int low= 1;
		int high= n-2;
		
		while(low<=high) {
			int mid= low+high>>1;
			if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) return mid;
			if(arr[mid]>arr[mid-1]) low=mid+1;
			else high=mid-1;
		}
		
		return low;
	}

}
