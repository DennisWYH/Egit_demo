
public class Fibonacci {

	public static int function(int a){
		if(a == 2){
			return 1;
		}
		if(a == 1){
			return 1;
		}
		else{
			return function(a-1) + function(a-2);
		}
	}
	// 1 2 3 4 5 6
	
	// 1 1 2 3 5 8
	public static void main(String[] args){
		System.out.println(function(6));
	}
}
