package main;

import java.util.Random;

public class Assignment_1_1_13 {
	public static void printTransform(Object array[][]){
		
		printArray(array);
		array=transformArray(array);
		System.out.println("------------------------------");
		printArray(array);
		
	}
	private static Object[][] transformArray(Object[][] src) {
		// TODO Auto-generated method stub
		int y = src.length;
		int x = src[0].length;
		Object des[][] = new Object[x][y];
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				des[i][j] = src[j][i];
			}
		}
		return des;
	}
	private static void printArray(Object[][] array) {
		// TODO Auto-generated method stub
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(" "+array[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		int M = 6,N = 4;
		Object[][] num = new Object[M][N];
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				num[i][j] = new Random().nextInt(10);
			}
		}
		printTransform(num);
	}
}
