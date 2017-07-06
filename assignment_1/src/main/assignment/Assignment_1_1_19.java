package main.assignment;

import java.math.BigInteger;

import util.StdOut;

public class Assignment_1_1_19 {
	//会溢出，懒得管了，应该用BigInterget	
	private static long array[] = new long[100];
	public static long F(int N){
		if(N == 0){
			return array[N]=0;
		}
		if(N == 1){ 
		}
		if(N < array.length){
			return array[N]=0;
		}
		array = dilatation(array);
		return array[N]=array[N-1]+array[N-2];

	}
	private static long[] dilatation(long[] src) {
		long dest[] = new long[src.length+100];
		System.arraycopy(src, 0, dest, 0, src.length);
		return dest;
	}
	public static void main(String[] args) {     
		 for (int N = 0; N < 100; N++)    
			 StdOut.println(N + " " + F(N));
   } 
}
