package String;

// String 클래스 주요 메서드
   
public class Ex02 {

	public static void main(String[] args) {
	
		// 1. 소문자 -> 대문자 : toUpperCase()
		//    대문자 -> 소문자 : toLowerCase()
        String str = "java program";
        System.out.println("대문자 ==> " + str.toUpperCase());
        System.out.println("소문자 ==> " + (str.toUpperCase()).toLowerCase());
        
        // 2. 문자열의 길이 반환 : length()
        System.out.println("문자열 길이 ==> " + str.length());
      
        // 3. 문자열 결합 : concat()
        String str1 = "JAVA";
        String str2 = str1.concat(" PROGRAM");
        System.out.println(str2);
        
        // 4. 특수한 포맷으로 바꿔줌 : format()
        float avg = 92.23456f;
        String avg1 = String.format("%.2f", avg);
        System.out.println("평균 ==> " + avg1);
        System.out.println(avg1 + 10);
        
        // 5. 대소문자 구분 안하는 메서드 : equlsIgnoreCase()
        if(str.equalsIgnoreCase(str2)) {
        	System.err.println("두 문자열은 같습니다.");
        }else {
        	System.out.println("두 문자열은 다릅니다.");
        }

	}

}
