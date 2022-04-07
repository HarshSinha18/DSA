//You are given a list of n-1 integers and these integers are in the range of 1 to n. 
//There are no duplicates in the list. One of the integers is missing in the list. Write an efficient code to find the missing integer.

import java.util.*;
public class GFG {
	public static void main(String[] args){
		 Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i< n-1 ;i++) {
			arr[i] = sc.nextInt();
		}
		ques3(arr,n);
	}
	public static void ques3(int arr[] , int n) {
		int sum = (n*(n+1))/2;
		int sum2 = 0;
		int ans = 0;
		for(int i = 0 ; i< n ;i++) {
			sum2+=arr[i];
		}
		ans = sum-sum2;
		System.out.println(ans);
	}
}
