import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int N = scan.nextInt();
		    int sum = 0;
		    for(int i=0;i<N-1;i++){
		        sum += scan.nextInt();
		    }
		    int exp = N*(N+1)/2;
		    System.out.println(exp-sum);
		    
		}
	}
}
