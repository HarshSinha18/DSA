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