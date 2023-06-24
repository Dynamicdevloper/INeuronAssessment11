package in.ineuron;

public class Question7 {

	public static void main(String[] args) {
		int[] arr= {5,7,7,8,8,10};
		
		Pair p=bound(arr, 6);
		System.out.println(p.lowerBound+" "+p.upperBound);

	}
	
	public static Pair bound(int[] arr, int k) {
		int lb=lowerBound(arr,k);
		int ub=upperBound(arr,k)-1;
		
		if(lb>ub) {
			lb=-1;
			ub=-1;
		}
		Pair pair= new Pair(lb, ub);
		return pair;
	}

	private static int upperBound(int[] arr, int k) {
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high) {
			int mid=low+high>>1;
			if(arr[mid]>k) {
				ans=mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return low;
	}

	private static int lowerBound(int[] arr, int k) {
		// TODO Auto-generated method stub
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high) {
			int mid=low+high>>1;
			if(arr[mid]>=k) {
				ans=mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return low;
	}

}

class Pair{
	int lowerBound;
	int upperBound;
	
	public Pair(int lowerBound, int upperBound) {
		this.lowerBound=lowerBound;
		this.upperBound=upperBound;
	}
}

