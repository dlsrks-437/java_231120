package pac1;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "123";
		// 소수점이 들어간 문자열은 정수로 변환 불가
		
		int s1 = Integer.parseInt(str);
		
		System.out.println(s1);
		
		double d1 = Double.parseDouble(str);
		
		System.out.println(d1);
		
		
		int i1 = 1234;
		String s2 = String.valueOf(i1);
		// 정수 또는 실수를 문자열로 변환
		System.out.println(s2);
		
		/// Ctrl + 3 <- 단축키
		
		
	}

}
