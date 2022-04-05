//  Check whether n is present in an array of size m or not.

import java.util.*;
public class GFG {
	public static void main(String[] args){
		 Scanner sc= new Scanner(System.in);
		  int m = sc.nextInt();
		  int arr[] = new int[m];
		  int n = sc.nextInt();
		  for(int i = 0 ; i< n ; i++) {
			  arr[i] = sc.nextInt();
		  }
		boolean ans=   ques2(arr,m,n);
		System.out.println(ans);
	     }
	public static boolean ques2(int arr[] , int m , int n) {
		//Using Bubble Sort
		
		Arrays.sort(arr);
		int start  = 0;
		int end  = m-1;
		int mid  = start+(end-start)/2;
		while(start<=end) {
			if(arr[mid]==n) {
				return true;
			}else if(n>arr[mid]) {
				start = mid+1;
			}else {
				end = mid-1;
			}
			mid = start+(end-start);
		}
		return false;
	    }
    }
