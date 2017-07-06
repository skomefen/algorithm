package main.assignment;

import java.util.Arrays;

import util.In;
import util.StdDraw;
import util.StdIn;

public class Assignment_1_1_32 {

	public void drawHistogram(double[] someNum, int N, double l, double r) {

		double[][] section = new double[N][2];
		int counts[] = new int[N];

		loadResource(someNum, N, l, r, section, counts);

		paintNumberAxis(section);

		paintPillar(counts);
	}

	private void paintPillar(int[] counts) {
		StdDraw.setXscale(0, 115);
		StdDraw.setYscale(0, 115);
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(StdDraw.GREEN);

		int N = counts.length;
		for (int i = 0; i < N; i++) {

			int count = counts[i];

			int x = 5 + i * (100 / N) + 100 / N / 2;
			int y = 5 + count / 2;
			int halfWidth = 100 / N / 2;
			int halfHeight = count / 2;

			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.text(5 + i * (100 / N) + 100 / N / 2, 7+count, "(" + count + ")");

			StdDraw.filledRectangle(x, y, halfWidth, halfHeight);

		}
	}

	private void paintNumberAxis(double[][] section) {
		// TODO Auto-generated method stub
		StdDraw.setXscale(0, 115);
		StdDraw.setYscale(0, 115);
		StdDraw.setPenRadius(0.005);
		StdDraw.setPenColor(StdDraw.GRAY);

		StdDraw.line(5, 5, 100, 5);
		StdDraw.line(5, 5, 5, 100);

		StdDraw.setPenRadius(0.02);

		int N = section.length;

		for (int i = 0; i < N; i++) {
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.setPenColor(StdDraw.BLACK);
			int x = 5 + i * (100 / N);
			int y = 5;
			StdDraw.point(x, y);
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.text(5 + i * (100 / N), 2, ""+ section[i][0] );
		}
	}

	private void loadResource(double[] someNum, int N, double l, double r,
			double[][] section, int[] counts) {
		for (int i = 0; i < N; i++) {
			double sectionl = (r - l) / N * (i) + l;
			double sectionr = (r - l) / N * (i + 1) + l;
			section[i][0] = sectionl;
			section[i][1] = sectionr;
		}

		for (int i = 0; i < someNum.length; i++) {
			double temp = someNum[i];
			int index = (int) ((temp - l) / (r - l) * N);
			if(index >= counts.length){
				continue;
			}
			counts[index] = counts[index] + 1;
		}
	}
	
	public static void main(String[] args){
		Assignment_1_1_32 ass = new Assignment_1_1_32();
		
		In in = new In("http://algs4.cs.princeton.edu/11model/tinyT.txt");
        double[] whitelist = in.readAllDoubles();
		
        int N = StdIn.readInt(); 
        double l = StdIn.readDouble();
        double r = StdIn.readDouble();
        
		ass.drawHistogram(whitelist, N, l, r);
		
		Arrays.sort(whitelist);
		for(double i:whitelist)
			System.out.print(i+" ");
	}

}
