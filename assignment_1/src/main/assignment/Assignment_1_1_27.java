package main.assignment;

/**
 * 题目改成
 *  二项分布。估计用以下代码计算 binomial(100, 50,0.5) 将会产生的递归调用次数：
 *   public static double binomial(int N, int k, double p) {  
 *    if (N == 0 && k == 0) return 1.0;
 *    if (N < 0 || k < 0)
 *     return 0.0; 
 *    return (1.0 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1,p); 
 * }
 * 将已经计算过的值保存在数组中并给出一个更好的实现。
 * 
 * */
public class Assignment_1_1_27 {
	/*
	 * N 实验次数，k成功次数，p成功概率
	 * */
	public static double binomial(int N, int k, double p) {
		if (N == 0 && k == 0)
			return 1.0; 
		if (N < 0 || k < 0)
			return 0.0; 
		return (1.0 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
	}
	/**
	 * 
	 * c(N,k)*p^k*(1-p)^N = (1-p)*c(N-1,k)*p^k*(1-p)^(N-k)+p*c(N-1,k-1)*p^(k-1)*(1-p)^((N-1)-(k-1))
	 * 
	 * */
	
	public static double myBinomial(int N, int k, double p) {
		if (N == 0 && k == 0)
			return 1.0; 
		if (N < k)
			return 0.0;
		if (N < 0 || k < 0)
			return 0.0; 
		double [][] array = new double[N+1][k+1];
		array[0][0] = 1;
		for(int i=1;i<N+1;i++){
			array[i][0] = array[i-1][0]*(1-p);
		}
		for(int i=1;i<N+1;i++){
			for(int j=1;j<k+1&&j<=i;j++){
				array[i][j] = (1-p)*array[i-1][j]+p*array[i-1][j-1];
			}
		}
		
		return array[N][k];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binomial(11,7,0.5));
		System.out.println(myBinomial(11,7,0.5));
		System.out.println(myBinomial(100,50,0.5));
	}

}
