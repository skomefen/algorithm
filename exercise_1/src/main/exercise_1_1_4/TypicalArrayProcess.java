package main.exercise_1_1_4;

public class TypicalArrayProcess {
	
	public double findMax(double a[]){
		double max = a[0];
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
		}
		return max;
	}
	
	public double avg(double a[]){
		double sum=0.0;
		for(int i = 0;i < a.length;i++){
			sum += a[i];
		}
		return sum/a.length;
	}
	
	public double[] copy(double a[]){
		double[] des = new double[a.length];
		for(int i=0;i<a.length;i++){
			des[i]=a[i];
		}
		return des;
	}
	
	public double[] overturn(double a[]){
		double[] des = new double[a.length];
		for(int i=0;i<a.length;i++){
			des[a.length-i-1]=a[i];
		}
		return des;
	}
	
	public int abs(int x){
		if(x<0) return -x;
		else     return x;
	}
	
	public double abs(double x){
		if(x<0) return -x;
		else    return x;
	}
	
	public boolean isPrime(int n){
		if(n<2) return false;
		for(int i = 2 ;i*i<=n;i++){
			if(n % i==0) return false;
		}
		return true;
	}
	
	public static double sqrt(double c){
		if( c < 0) return Double.NaN;
		double err = 1e-15;
		double t = c;
		while(Math.abs(t-c/t)>err * t)
			t = (c/t+t)/2.0;
		return  t;
	}
	
	public double hypotenuse(double a,double b){
		return Math.sqrt(a*a+b*b);
	}
	
	public double H(int n){
		double sum = 0;
		for(int i=1;i<=n;i++ ){
			sum+=1/i;
		}
		return sum;
	}
}
