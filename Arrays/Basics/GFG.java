import java.util.*;
public class GFG {
	public static void main(String[] args){
		 Scanner sc= new Scanner(System.in);
		  int n = sc.nextInt();
		  int arr[] = new int[n];
		  for(int i = 0 ; i< n ; i++) {
			  arr[i] = sc.nextInt();
		  }
		   ques4(arr,n);
		
	     }
	public static void ques4(int arr[] , int n) {
		int left = 0;
		int right = n-1;
		while(left<=right) {
			// swap the element
			int temp = arr[left]; 
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		// Printing Reverse Array
		for(int i = 0 ; i< n ; i++) {
			System.out.print(arr[i]+" ");
		}
	    }
    }
