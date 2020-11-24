package Method;

public class Ex07 {
	
	// 총점을 구하는 메서드
	public int tot(int[] arr){
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
		}
	
	public float avg(int a1) {
		float avg = 0;
		avg = a1 / 3.0f;
		return avg;
	}
	
	public String Score(float a1) {
		String Sc;
		if(a1 >= 90) {
			Sc = "A학점";
		}else if(a1>=80) {
			Sc = "B학점";
		}else if(a1>=70) {
			Sc = "C학점";
		}else if(a1>=60) {
			Sc = "D학점";
		}else {
			Sc = "F학점";
		}
		return Sc;
	}
	
	public void prn(String s1, String arr1[], int []arr,int a1, float a2, String a3) {
		System.out.println("이름 ==> " + s1);
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr1[i] + "과목 점수 : " + arr[i]);
		}
		System.out.println("총점 ==> " + a1);
		System.out.printf("평균 ==> %.2f \n", a2);
		System.out.println("학점 ==> " + a3);
		
	}

}
