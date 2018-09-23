// this program returns both maximum sum 
// and subarray as well

public class max_subarray_kadane {
public static void main(String[] args) {
	int array[]={4,-3,-2,2,3,1,-2,-3,4,2,-6,-3,-1,3,1,2};
	
	int max=array[0]; // set first element as maximum
	int new_max=0;
	
	int start=0;  // from where subarray starts
	int end=0;     // from where subarray end
	int j=0;
	
	int n= array.length;
	for(int i=0;i<n;i++){
		new_max=new_max+array[i];
		if(new_max<0){
			new_max=0;
			j=i+1;
		}
		
		else if(max<new_max){
			max=new_max;
			start=j;
			end=i;
		}
		
				
	}
	System.out.println("Maximum sum :"+max);
	for(int k=start;k<=end;k++){
		System.out.print(array[k]+" ");
	}
}
}
//Time Complexity: O(n)
//Algorithmic Paradigm: Dynamic Programming
