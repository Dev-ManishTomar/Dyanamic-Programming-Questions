import java.util.Arrays;
import java.util.HashMap;

public class subarray_with_sum_0 {
public static void main(String[] args) {
	
	// *****Mapping sum with index*****
	
	HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
    // Initialize sum of elements
	int arr[]={6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
    int currSum = 0;  
    for(int i = 0 ; i < arr.length ; i ++)
    {
        currSum = currSum+arr[i];
        if(currSum == 0)
        {
            System.out.println("subset : { 0 - " + i + " }");
        }
        else if(sumMap.get(currSum) != null)// sumMap.get(currSum)  [currSum is a key] it gives[index] which is 
        {                                       // value related to key
            System.out.println("subset : { " 
                                + (sumMap.get(currSum) + 1) 
                                + " - " + i + " }");
            sumMap.put(currSum, i);
        }
        else
            sumMap.put(currSum, i);
    }
}
}
//Time Complexity : O(n)
