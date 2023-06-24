package in.ineuron;

import java.util.ArrayList;
import java.util.HashMap;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {4,9,5};
		int[] arr2= {9,4,9,8,4};
		ArrayList<Integer> result= interaction(arr1, arr2);
		for(int i: result) {
			System.out.print(i+" ");
		}

	}
	
	public static ArrayList<Integer> interaction(int[] arr1, int[] arr2){
		
		HashMap<Integer, Integer> map=new HashMap<>();
		ArrayList<Integer> result=new ArrayList<>();
		
		for(int a: arr1) {
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}else {
				map.put(a, 1);
			}
		}
		
		for(int b: arr2) {
			if(map.containsKey(b) && map.get(b)>0) {
				result.add(b);
				map.put(b, 0);
			}
		}
		
		return result;
	}
}
