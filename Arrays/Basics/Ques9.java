// Find the range of the array. Range means the difference between the maximum and minimum element in the array.

import java.util.*;
public class GFG {
	public static void main(String[] args){
		 Scanner sc= new Scanner(System.in);
		  int n = sc.nextInt();
		  int arr[] = new int[n];
		  for(int i = 0 ; i< n ; i++) {
			  arr[i] = sc.nextInt();
		  }
		 Ques9(arr,n);
	}
	public static void Ques9(int arr[] , int n) {
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[n-1];
		System.out.println(max-min);
	}
}
