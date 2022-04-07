import java.util.*;
public class GFG {
	public static void main(String[] args){
		 Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i< n ;i++) {
			arr[i] = sc.nextInt();
		}
		ques2(arr,n);
	}
	public static void ques2(int arr[] , int n) {
		int count = 0;
		int temp  = 0;
		while(count<arr.length-1) {
			temp =  arr[0];
			for(int i = 0 ; i< n-1 ; i++) {
				arr[i]=arr[i+1];
			}

			arr[n-1]=temp;
			count++;
			for(int i = 0;i< n ; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
		}
		System.out.println("-------------");
		for(int i = 0;i< n ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}