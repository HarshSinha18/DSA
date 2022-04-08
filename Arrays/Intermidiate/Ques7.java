// Find common elements in three sorted arrays

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
		allDuplicate(arr,n);
	}
	public static void allDuplicate(int arr[] , int n) {
		Arrays.sort(arr);
		int arr2[] = new int[n];
		int c1 = 0;
		int p = 0;
		for(int i = 0 ; i < n ; ) {
			for(int j = i+1 ; j< n ; j++) {
				if(arr[i] == arr[j]) {
					c1++;
			  	}
			}
			if(c1>=1) {
				arr2[p] = arr[i];
				p++;
				i+=c1;
				c1 = 0;
			}
			c1=0;
			i++;
		}
		for(int i = 0 ; i< p ; i++) {
			System.out.println(arr2[i]);
		}
	}

}
