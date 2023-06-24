package in.ineuron;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {3,4,5,1,2};
		System.out.println(findMin(arr));
		
	}

	public static int findMin(int []arr) {
        // Write your code here.
        int n= arr.length;
        int low=0;
        int high=n-1;
        int min=Integer.MAX_VALUE;
        while(low<=high){
            int mid= (low+high)/2;

            if(arr[low]<=arr[high]){
                min= Math.min(min, arr[low]);
                return min;
            }
            if(arr[low]<=arr[mid]){
                min=Math.min(arr[low], min);
                low=mid+1;
            }else{
                min=Math.min(arr[mid], min);
                high=mid-1;
            }
        }

        return min;
    }
}
