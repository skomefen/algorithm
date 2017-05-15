package main;

import util.In;
import util.StdIn;
import util.StdOut;

public class Assignment_1_1_3 {
	
	public void compareTo(int first,int second,int third){
		if(first==second&&second==third&&first==third){
			System.out.println("equal"); 
		}
		else{
			System.out.println("not equal"); 
		}
	}
	
	public static void main(String[] args){
		In in = new In();
		int num[]=new int[3];
		int index = 0;
		while(!StdIn.isEmpty()) {
            int n = StdIn.readInt();
            num[index]=n;
            index++;
            if(index>=3)
            	break;
        }
		new Assignment_1_1_3().compareTo(num[0],num[1],num[2]);
		in.close();
	}
}
