import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		while(t-->0){
		    String input = scan.nextLine();
		    HashSet<Character> set = new HashSet<Character>();
		    StringBuilder sb = new StringBuilder();
		    for(int i=0;i<input.length();i++){
		        if(!set.contains(input.charAt(i))){
		            sb.append(input.charAt(i));
		            set.add(input.charAt(i));
		        }
		    }
		    System.out.println(sb.toString());
		}
	}
}