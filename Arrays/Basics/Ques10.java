// Move all the negative elements to one side of the array.

import java.util.*;
public class GFG {
	public static void main(String[] args){
		 Scanner sc= new Scanner(System.in);
		  int n = sc.nextInt();
		  int arr[] = new int[n];
		  for(int i = 0 ; i< n ; i++) {
			  arr[i] = sc.nextInt();
		  }
		 Ques10(arr,n);
	}
	public static void Ques10(int arr[] , int n) {
		Arrays.sort(arr);
		for(int i = 0 ; i< n ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
