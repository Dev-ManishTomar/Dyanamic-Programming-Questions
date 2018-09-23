import java.util.Scanner;

public class fibo_using_memoization {

final  int MAX = 100;
final  int NIL = -1;
int array[]=new int[MAX];

public static void main(String[] args) {
	System.out.println("Enter value of n :");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	fibo_using_memoization f = new fibo_using_memoization();
	f.initialize();
	System.out.println("Fibonacci number is" + " " + f.fib(n));
	
	
}
 void initialize(){
	
	for(int i=0;i<MAX;i++){
		array[i]=NIL;
	}
}
 int fib(int n){
	if(array[n]==NIL){
		if(n<=1)
			array[n]=n;
		else
			array[n]=fib(n-1)+fib(n-2);
	}
	return array[n];
		
}

}
