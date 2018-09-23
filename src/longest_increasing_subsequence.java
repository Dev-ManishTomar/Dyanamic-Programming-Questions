//The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence 
//of a given sequence such that all elements of the subsequence are sorted in increasing order. 
//For example, the length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}.

public class longest_increasing_subsequence {
	public static void main(String[] args) {
		
		int array[] = { 10, 22, 9, 33, 21, 50, 41, 60 ,50};
        int n = array.length;
        
        int T[] = new int[n];
        
        
        /* Initialize T[] values for all indexes */
        for (int i = 0; i < n; i++ )
           T[i] = 1;    // initially LIS for every element is Atleast 1 
        
        
        /* Compute optimized T[] values in bottom up manner */
        for ( int i = 1; i < n; i++ )
           for (int j = 0; j < i; j++ ) 
                      if ( array[j] < array[i] ){
                    	
                    	  T[i] = Math.max(T[i], T[j] + 1); // T[i]= T[j]+1 means atleast LIS at i is T[j]+1
                      }
               
        
        
        /* Pick maximum of all LIS values */
        int max = T[0];
        for ( int i=0; i < n; i++){
            if(T[i] > max){
                max = T[i];
            }
        }
       System.out.println("Maximum LIS :"+max);
    }

}

//* Time complexity is O(n^2)
//* Space complexity is O(n)
