package koreait;

/*
 * 다중 반복문
 * - 반복문 안에 또 다른 반복문을 포함하는 형태.
 *   형식)
 *       for(초기식1; 조건식1; 증감식1) {
 *           반복 실행문;
 *           for(초기식2; 조건식2; 증감식2){
 *               반복 실행문2;
 *            }
 *         }   
 */
public class Ex19 {

	public static void main(String[] args) {

		for(int i = 1; i<=3; i++) {
			for(int j=1 ; j<=3; j++) {
				System.out.print("("+i+","+j+")\t");
			}
			System.out.println();
		}

	}

}
