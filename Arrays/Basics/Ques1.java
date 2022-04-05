
//  Ques :1) Create an Array of size 10 of integers. Take input from the user for these 10 elements and print the entire array after that.

import java.util.*;
public class GFG {
	public static void main(String[] args){
		 Scanner sc= new Scanner(System.in);
		  int n = 10;
		  int arr[] = new int[n];
		  for(int i = 0 ; i < n ; i++) {
			  arr[i] = sc.nextInt();
		  }
		  for(int i = 0 ; i< n ; i++) {
			  System.out.print(arr[i]+" ");
		  }
	     }
    }
