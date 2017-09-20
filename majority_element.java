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
		    int[] freq = new int[N+1];
		    for(int i=0;i<N;i++){
		        int num = scan.nextInt();
		        arr[i] = num;
		        freq[num]++;
		    }
		    int j=0;
		    for(;j<N+1;j++){
		        if(freq[j]>N/2){
		            System.out.println(j);
		            break;
		        }
		        
		    }
		    if(j==N+1)
		        System.out.println("NO Majority Element");
		}
	}
}
