package main;

import util.In;
import util.StdIn;

public class Assignment_1_1_5 {
	public static boolean zerobetweenone(double first,double serond){
		if(first<0||first>1){
			return false;
		}
		if(serond<0||serond>1){
			return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		In in = new In();
		int[] num = new int[2];
		for(int i=0;i<num.length&&!StdIn.isEmpty();i++){
			num[i]=StdIn.readInt();
		}
		System.out.println(zerobetweenone(num[0],num[1]));
		
	}
}
