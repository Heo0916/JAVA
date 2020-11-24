package generic;

public class Ex02 {

	public static void main(String[] args) {
		
		// StringType 클래스 객체 생성
		Generic<String> st = new Generic<String>();
		String[] str1 = {"홍길동", "이순신", "유관순"};
		String var1 = "김연아";
		st.setArr(str1);
		st.setVar(var1);
		st.display();
		System.out.println();
		
		Generic<Integer> it = new Generic<Integer>();
		Integer[] iarr = {100, 200, 300};
		Integer ivar = 500;
		it.setArr(iarr);
		it.setVar(ivar);
		it.display();
		
		}
		
		

	}

