/*
  LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
  LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.
 */
public class longest_common_subsequence {
public static void main(String[] args) {
	longest_common_subsequence lcs=new longest_common_subsequence();
	 String s1 = "AGGTAB";
	    String s2 = "GXTXAYB";
	 
	    char[] X=s1.toCharArray();
	    char[] Y=s2.toCharArray();
	    int m = X.length;
	    int n = Y.length;
	 
	    System.out.println("Length of LCS is" + " " +
	                                  lcs.lcs( X, Y, m, n ) );
}


/* Returns length of LCS for X[0..m-1], Y[0..n-1] */
int  lcs(char[] x, char[] y, int m, int n) {
	 int L[][] = new int[m+1][n+1];
	 
	    /* Following steps build L[m+1][n+1] in bottom up fashion. Note
	         that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
	
	 for (int i=0; i<=m; i++)
	    {
	      for (int j=0; j<=n; j++)
	      {
	        if (i == 0 || j == 0)
	            L[i][j] = 0;
	        else if (x[i-1] == y[j-1])
	            L[i][j] = L[i-1][j-1] + 1; //Diagonal element+1
	        else
	            L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
	   
	      }
	    }
	 
	  return L[m][n]; // LAST ELEMENT OF MATRIX WHICH IS LCS
	
}
}


//* Time complexity is O(mn)
