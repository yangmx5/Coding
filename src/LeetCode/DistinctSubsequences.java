package LeetCode;

public class DistinctSubsequences {
	public static int numDistinct(String S, String T) {
	    // array creation
	    int[][] mem = new int[T.length()+1][S.length()+1];

	    // filling the first row: with 1s
	    for(int j=0; j<=S.length(); j++) {
	        mem[0][j] = 1;
	    }
	    
	    // the first column is 0 by default in every other rows but the first, which we need.
	    
	    for(int i=0; i<T.length(); i++) {
	        for(int j=0; j<S.length(); j++) {
	            if(T.charAt(i) == S.charAt(j)) {
	                mem[i+1][j+1] = mem[i][j] + mem[i+1][j];
	            } else {
	                mem[i+1][j+1] = mem[i+1][j];
	            }
	        }
	    }
	    
	    for(int i = 0 ; i < mem.length ; i++){
	    	for(int j = 0 ; j < mem[0].length ; j++){
	    		System.out.print(mem[i][j] + " ");
	    	}
	    	System.out.println("");
	    }
	    
	    return mem[T.length()][S.length()];
	}
	
	public static void main(String[] args) {
		
		System.out.println(numDistinct("abcabcde" ,"bc"));
		
	}
}
