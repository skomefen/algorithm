package main.assignment;

import java.math.BigInteger;

import util.StdOut;

public class Test {
    public static long F(int N){  
		 if (N == 0) return 0;      
		 if (N == 1) return 1;      
		 return F(N-1) + F(N-2); 
	}  
	public static void main(String[] args){   
		String aaa = "aaa";
	} 
}
