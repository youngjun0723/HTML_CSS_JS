package myHTML;

public class Test {

	public static void main(String[] args) {
		
		//String 클래스로 객체 생성
		String str = new String("dddddddddddddddddddd");
		//Str의 문자 길이는?
		// sysout 치고 Ctrl + space하면 나온다.
		System.out.println(str.length());
		
		// 대문자로 출력
		System.out.println(str.toUpperCase());
		
		//d를 k로 변경해서 출력
		System.out.println(str.replace('d','f'));
		
		int a = 10;
		int b = 20;
		int c = Math.max(a, b);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(c);
	}

}
