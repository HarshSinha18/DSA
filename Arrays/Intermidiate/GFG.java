import java.util.*;
public class GFG {
	public static void main(String[] args){
		 Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i< n ;i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		ques4(arr,n,k);
	}
	public static void ques4(int arr[] , int n , int k) {
		int sum = 0;
		int count = 0;
	for(int i = 0 ;  i< n ; i++) {
		for(int j = i+1 ; j< n ; j++){
			sum = arr[i]+arr[j];
			if(sum==k) {
				count++;
			}
		  }	
	   }
	System.out.println(count);
	}
}