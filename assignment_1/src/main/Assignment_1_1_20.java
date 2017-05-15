package main;

import com.sun.org.apache.bcel.internal.generic.InstructionFactory;

public class Assignment_1_1_20 {
	public static double lnFactorial(int N){
		if(N == 1){
			return 0;
		}
		return lnFactorial(N-1)+Math.log(N);
	}
	public static void main(String[] args){
		int N = 10;
		System.out.println(lnFactorial(N));
		int sum = 1;
		for(int i=1;i<=N;i++){
			sum = i*sum;
		}
		System.out.println(Math.log(sum));
	}
}
