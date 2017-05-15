package main;

/**
 * ��Ŀ�ĳ�
 *  ����ֲ������������´������ binomial(100, 50,0.5) ��������ĵݹ���ô�����
 *   public static double binomial(int N, int k, double p) {  
 *    if (N == 0 && k == 0) return 1.0;
 *    if (N < 0 || k < 0)
 *     return 0.0; 
 *    return (1.0 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1,p); 
 * }
 * ���Ѿ��������ֵ�����������в�����һ�����õ�ʵ�֡�
 * 
 * */
public class Assignment_1_1_27 {
	/*
	 * N ʵ�������k�ɹ�������p�ɹ�����
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
