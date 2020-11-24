package koreait;

public class Ex25 {

	public static void main(String[] args) {
		
		for(int i = 1; i<= 11; i++) {
			
			if(i<=6) {
			for(int a = 1; a<= i; a++ ) {
				
				System.out.print('*');
			}
			}else {
				for(int a = 5; a >= i-6; a--) {
					System.out.print('*');
				}
				}
			System.out.println();
		}

	}

}
