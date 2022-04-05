import java.util.*;
public class GFG {
	public static void main(String[] args){
		 Scanner sc= new Scanner(System.in);
		  int n = sc.nextInt();
		  int arr[] = new int[n];
		  for(int i = 0 ; i< n ; i++) {
			  arr[i] = sc.nextInt();
		  }
		  int k = sc.nextInt();
		  int ans=  ques7(arr,n , k);
		  System.out.println(ans);
		
	     }
	public static int ques7(int arr[] , int n , int k) {
		int count =0 ;
		for(int i = 0; i< n; i++) {
			if(arr[i]==k) {
				count++;
			}
		}
		return count ;

	     	
	
	}
}
