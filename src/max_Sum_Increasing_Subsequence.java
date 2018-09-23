/*
 * This problem is a variation of standard Longest Increasing Subsequence (LIS) problem.
 * We need a slight change in the Dynamic Programming solution of LIS problem.
 * All we need to change is to use sum as a criteria instead of length of increasing subsequence
 */

//if input is {1, 101, 2, 3, 100, 4, 5},
//then output should be 106 (1 + 2 + 3 + 100)
public class max_Sum_Increasing_Subsequence {
public static void main(String[] args) {
	
	  int array[] = {1, 100, 9, 11, 3, 10,4};
	  int n = array.length;
	  int T[]=new int[n]; // this array holds the max value 
	  
	  for (int i = 0; i < n; i++) {
          T[i] = array[i];      //initially maximum value for for every elemnent is 
      }                         //Atleast as much as the origional value

      for(int i=1; i < n; i++){
    	  //loop will run till j<i
          for(int j = 0; j < i; j++){
              if(array[j] < array[i]){
            	  
                  T[i] = Math.max(T[i], T[j] + array[i]); // update the T[i] with maximum value
              }
          }
      }

      // just choose the maximum value from T[] out of all the maximum value
      int max = T[0];
      for (int i=0; i < n; i++){
          if(T[i] > max){
              max = T[i];
          }
      }
     System.out.println(max);
  }
}

//Time Complexity: O(n^2)
