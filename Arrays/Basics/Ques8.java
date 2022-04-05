//  Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algorithm.

import java.util.*;
public class GFG {
	public static void main(String[] args){
		 Scanner sc= new Scanner(System.in);
		  int n = sc.nextInt();
		  int arr[] = new int[n];
		  for(int i = 0 ; i< n ; i++) {
			  arr[i] = sc.nextInt();
		  }
		 Ques8(arr,n);
	}
	public static void Ques8(int arr[] , int n) {
		int zero = 0;
		int one = 0;
		int two = 0;
		for(int i = 0 ; i< n ; i++) {
			if(arr[i]==0) {
				zero++;
			}else if(arr[i]==1) {
				one++;
			}else {
				two++;
			}
		}
		for(int i  =0 ; i<zero ; i++) {
			System.out.print("0 ");
			// arr[i]=0;  -> also can do
		}
		for(int j = zero ; j<one+zero ; j++) {
			System.out.print("1 ");
			// arr[j]=1;
		}
		for(int k = zero+one ; k< n ; k++) {
			System.out.print("2 ");
			// arr[k]=2;
		}
	}
}
