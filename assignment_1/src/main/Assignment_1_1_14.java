package main;

public class Assignment_1_1_14 {
	public static int lg(int N){
		if(N<0){
			throw new RuntimeException("NÒª´óÓÚ0");
		}
		int i=0;
		int key=1;
		/*
		 * x < log 2 N <= => 2^x < N ,Áîkey=x^2  
		 */
		for(i=0;key<=N;i++){
			key=key*2;
		}
		
		return i - 1;
	}
	
	public static void main(String[] args){
		System.out.println(lg(100000));
	}
}
