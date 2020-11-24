package koreait;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr = new int[5][5];
		
		int num = 1, num2 = 2;
		for(int i=0; i<5; i++) {
			for(int j =0; j<5; j++) {
				
				arr[i][j] = num;
				num += 5;
			}
				num = num2;
				num2 += 1;
		}
		
		
			for(int k=0; k<5; k++) {
			for(int j =0; j<5; j++) {
				System.out.print(arr[k][j] + "\t");
			}
			System.out.println();
			}
	}
}
		


