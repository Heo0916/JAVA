package Class;

public class TV_Main {

	public static void main(String[] args) {
		
		TV tv = new TV();
		
		tv.color = "검정색";
		tv.channel = 7;
		tv.channelUp();
		tv.display();
		System.out.println();

		// TV 작동
		
		tv.power(); // 전원 on
		tv.channelUp(); // 채널 하나 올라간다
		tv.display();
		System.out.println();
		
		
		
		/*
		 *  [문제] TV 객체를 생성하되 tv1이라는 참조변수를
		 *        이용하여 아래와 같이 정보를 변경하세요.
		 *        조건1) 색상: 흰색, 전원:off, 채널 : 15
		 *        조건2) 조건1의 tv1 정보를 출력해 보세요.
		 *        조건3) tv1 정보를 다음과 같이 변경하세요.
		 *              색상 :흰색, 전원 : on , 채널 : 28
		 */
		
		TV tv1 = new TV();
		
		tv1.color = "흰색";
		tv1.channel = 15;
		tv1.display();
		System.out.println();
		
		tv1.power();
		for(int i=0; i<13; i++) {
			tv1.channelUp();
		}
		tv1.display();
		System.out.println();
		
		
		/*
		 *  [문제] TV 객체를 생성하되 tv2이라는 참조변수를
		 *        이용하여 아래와 같이 정보를 변경하세요.
		 *        조건1) 색상: 흰색, 전원:off, 채널 : 32
		 *        조건2) 조건1의 tv2 정보를 출력해 보세요.
		 *        조건3) tv2 정보를 다음과 같이 변경하세요.
		 *              색상 :검정, 전원 : on , 채널 : 11
		 */
		
		TV tv2= new TV();
		
		tv2.color = "흰색";
		tv2.channel = 32;
		tv2.display();
		System.out.println();
		
		tv2.color = "검정";
		tv2.power();
		for(int i=0; i<21; i++) {
			tv2.channelDown();
		}
		tv2.display();
		
		}
		
		
		
	}



// [신촌지점] 평일 14:00 JAVA_1 방특 수업 임정훈 강사 수강생 000입니다.