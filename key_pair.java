import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int N = scan.nextInt();
		    int sum = scan.nextInt();
		    int[] arr = new int[N];
		    for(int i=0;i<N;i++){
		        arr[i] = scan.nextInt();
		    }
		    Arrays.sort(arr);
		    int start = 0;
		    int end = N-1;
		    while(start<end){
		        if(arr[start]+arr[end]==sum){
		            System.out.println("Yes");  
		            break;
		        }
		        else if(arr[start]+arr[end]>sum)
		            end--;
		        else
		            start++;
		    }
		    if(start==end)
		        System.out.println("No");
		}
	}
}
