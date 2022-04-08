// Find the first repeating element in an array of integers.

import java.util.Arrays;
import java.util.Scanner;
public class GFG{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
	    	}
		int ans = ques8(arr,n);
		System.out.println(ans);
	}
	public static int ques8(int arr[] , int n) {
		int count=1;
		for(int i  =0 ; i< n ; i++) {
			for(int j = i+1 ; j< n ; j++) {
				//System.out.println(arr[i]+" "+arr[j]);
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>=2){
				return i;
			}
		}
		return -1;
          
	}

}
