import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int N = scan.nextInt();
		    int[] arr = new int[N];
		    for(int i=0;i<N;i++){
		        arr[i] = scan.nextInt();
		    }
		    int curr_max = 0;
		    int glob_max = arr[0];
		    int sum = 0;
		    for(int i=0;i<N;i++){
		        curr_max = Math.max(arr[i],arr[i]+curr_max);
		        glob_max = Math.max(curr_max,glob_max);
		    }
		    System.out.println(glob_max);
		}
	}
}
