// Find the Kth largest and Kth smallest number in an array.

import java.util.*;
public class GFG {
	public static void main(String[] args){
		 Scanner sc= new Scanner(System.in);
		  int n = sc.nextInt();
		  int arr[] = new int[n];
		  for(int i = 0 ; i< n ; i++) {
			  arr[i] = sc.nextInt();
		  }
		  int k = sc.nextInt();
		   ques6(arr,n , k);
		
	     }
	public static void ques6(int arr[] , int n , int k) {
		Arrays.sort(arr);
		int largest = arr[k-1];
		int minimum = arr[n-k];
		System.out.println("largest : "+largest);
		System.out.println("largest : "+minimum);
		
		
	    }
    }
