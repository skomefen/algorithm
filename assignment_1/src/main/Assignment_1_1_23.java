package main;

import java.util.Arrays;

import util.In;
import util.StdIn;

public class Assignment_1_1_23 {
	public static int indexOf(int[] a,int key){
		return indexOf(a,key,0,a.length-1,0);
	}

	private static int indexOf(int[] a, int key, int lo, int hi,int level) {
		int mid = (lo+hi)/2;
		if(lo>hi){
			return -1;
		}
		if(key == a[mid]){
			printLoAndHi(lo, hi, level);
			level = level +1;
			return mid;
		}
		if(key < a[mid] ){
			hi = mid - 1;
			printLoAndHi(lo, hi, level);
			level = level +1;
			return indexOf(a, key, lo, hi, level);
		}
		if(key > a[mid] ){
			lo = mid + 1;
			printLoAndHi(lo, hi, level);
			level = level +1;
			return indexOf(a, key, lo, hi, level);
		}
		return -1;
	}

	private static void printLoAndHi(int lo, int hi, int level) {
		String space = ""; 
		for(int i=0;i<level;i++){
			space = "  "+space;
		}
		System.out.print(space);
		System.out.println("lo: "+lo+" hi: "+hi);
	}
	public static void main(String[] args) {

        // read the integers from a file
        In in = new In("http://algs4.cs.princeton.edu/11model/tinyT.txt");
        int[] whitelist = in.readAllInts();

        // sort the array
        Arrays.sort(whitelist);
        System.out.println(Arrays.toString(whitelist));
        
        String s = "";
        
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            int result = indexOf(whitelist,key);
            if(result==-1){
            	s = s+"+ "+key+"  ";
            	System.out.println(s);
            	continue;
            }
        	s = s+"- "+key+"  ";
        	System.out.println(s);
        }
    }
}

