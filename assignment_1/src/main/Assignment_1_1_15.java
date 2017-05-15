package main;

public class Assignment_1_1_15 {
	public static int[] histogram(int a[],int M){
		
		int time[] = new int[M];
		for(int num:a){
			if(0<=num&&num<=M-1){
				time[num]=++time[num];
			}
		}
		
		return time;
	}
	
	public static void main(String[] args){
		int a[] = {0,1,5,3,8,7,9};
		int result[] = histogram(a,10);
		int sum = 0;
		for(int num:result){
			sum+=num;
		}
		if(sum==a.length){
			System.out.println(a.length);
		}
	}
}
