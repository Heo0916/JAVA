package koreait;

/*
 * 프로세스(Process)?
 * - 현재 CPU에 의해서 처리되는 프로그램 단위.
 * - 자바에서는 하나의 클래스를 말함. 
 */

/*
 * - 무한반복을 가진 프로세스를 실행한 경우
 *   CPU가 현재 프로세스를 놓지 않기 때문에 
 *   다음 프로세스를 실행할 수 없다.
 * - 이러한 문제점을 개선하기 위해서 Thread
 *   개념을 도입하게 됨.
 */
public class Pro_Main {

	public static void main(String[] args) {
		
		Process1 p1 = new Process1();
		process2 p2 = new process2();
		
		p1.go(); p2.go();

	}

}
