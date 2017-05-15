package main;

public class Assignment_1_1_24 {
	public static int gcd(int first,int second){
		if(first<0||second<0){
			throw new RuntimeException("请输入大于0的数");
		}
		if(first<second){
			int key = 0;
			key = first;
			first = second;
			second = key;
		}
		if(second==0){
			return first;
		}
		if(first%second==0){
			return second;
		}
		return gcd(second,first%second);
	}
	public static void main(String[] args){
		int first = 0;
		int second = 11111;
		System.out.println(gcd(first, second));
	}
}
