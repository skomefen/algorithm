package main.assignment;

import java.io.InputStream;
import java.util.Scanner;

public class Assignment_1_1_30 {
	
	public boolean[][] arrayCheckPrime(int N){
		
		boolean[][] a = new boolean[N][N];
		
		for(int j=0;j<N;j++){
			for(int i=0;i<=j;i++){
				a[i][j] = checkPrime(i,j);
				a[j][i] = a[i][j];
			}
		}
		
		return a;
	}

	private boolean checkPrime(int i, int j) {
		
		if(i==j){
			if(i==1){
				return true;
			}
			return false; 
		}
		if(i>j){
			return calculate(i,j);
		}
		if(i<j){
			return calculate(j,i);
		}
		
		return false;
	}

	private boolean calculate(int bigNum, int smallNum) {
		// TODO Auto-generated method stub	
		if(smallNum==0)
			return false;
		
		if(smallNum==1)
			return true;
		
		if(bigNum%smallNum==0)
			return false;
		
		if(bigNum<=1)
			return true;
		
		return calculate(smallNum,bigNum%smallNum);
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Assignment_1_1_30 ass = new Assignment_1_1_30();
		
		boolean[][] a = ass.arrayCheckPrime(n);
		for (int j = 0; j < a.length; j++) {
			
			for(int i = 0;i<a.length; i++){
				System.out.print("a["+i+"]"+"["+j+"]"+a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
