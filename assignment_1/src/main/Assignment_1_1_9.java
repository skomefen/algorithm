package main;

public class Assignment_1_1_9 {
	public static String toBinaryString(int n){
		String s = "";
		for(int i=n;i>0;i/=2){
			s = (i % 2) + s;
		}
		return s;
	}
	public static void main(String[] args){
		System.out.println(toBinaryString(13));
	}
}
