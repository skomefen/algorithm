package main.assignment;

public class Assignment_1_1_10 {

	public static void print2DArray(boolean[][] array){
		int y = array.length;
		int xmax = 0;
		String s = "";
		for(int i=0;i<y;i++){
			xmax=(xmax<array[i].length)?array[i].length:xmax;
		}
		for(int i=0;i<xmax;i++){
			if(i==0){
				s="  0";
			}
			s=s+" "+i;
		}
		System.out.println(s);
		for(int i=0;i<y;i++){
			s = i+":";
			for(int j=0;j<array[i].length;j++){
				if(array[i][j])
					s=s+" *";
				else
					s=s+"  ";
			}
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean array[][]={{true,false},{true,false,true,false,true,false},{true,true,true},{true,false,false},{false,true,false}};
		print2DArray(array);
	}

}
