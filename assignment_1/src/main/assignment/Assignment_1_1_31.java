package main.assignment;

import util.StdDraw;
import util.StdIn;
import util.StdRandom;

public class Assignment_1_1_31 {

	public static void drawcricle(double x,double y,double r,int N,double[][] a){
	
		StdDraw.setXscale(0, x*2);
		
		StdDraw.setYscale(0, y*2);
		
		StdDraw.setPenRadius(0.005);
		
		StdDraw.setPenColor(StdDraw.RED);
		
		StdDraw.circle(50, 50, 50);
		
		for(int i=0;i<N;i++){ 
			StdDraw.setPenRadius(0.05);
			
			StdDraw.setPenColor(StdDraw.BLACK);
			
			double m=50-50*Math.cos(2*Math.PI*i/N);
			double n=50+50*Math.sin(2*Math.PI*i/N);
			
			StdDraw.point(m, n);
			a[i][0]=m;
			a[i][1]=n;
	//		StdDraw.setPenColor(StdDraw.RED); 
	//		StdDraw.text(m,n,i+" m="+m+" n="+n);

		}
	} 
	public static void Randomline(double x,double y,double p,double[][] a) {
		StdDraw.setXscale(0, x*2); 
		StdDraw.setYscale(0, y*2); 
		StdDraw.setPenRadius(0.01); 
		StdDraw.setPenColor(StdDraw.LIGHT_GRAY); 
		int N=a.length; 
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++) { 
				if(StdRandom.bernoulli(p)) 
					StdDraw.line(a[i][0], a[i][1], a[j][0], a[j][1]);
			}
	}
	public static void main(String[] args) {
		double x=50;
		double y=50;
		double r=50;
		
		int N = StdIn.readInt();
		double p = StdIn.readDouble();
		
		double[][] a=new double[N][2]; 
		//»­Ô²/Ãèµã
		drawcricle(x,y,r,N,a); 
		//»­Ïß
		Randomline(x,y,p,a); 
	}
}
