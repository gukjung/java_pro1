package pack1;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("성공");
//		한 줄 주석
		/* 여러 줄
		 * 주석
		 * 개꿀
		 */
		
		
//	    기본형 변수 : 상수 기억장소의 이름
//		정수 기억형 변수
//		1byte 에 -128 ~ 127
		byte var1;
		var1 = 5;
		var1 = 7;
		var1 = 127;
		System.out.println(var1);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		
		short var2 = 323;   //2BYTE = 32767
		System.out.println(var2);
		System.out.println(Short.MAX_VALUE);
		
		int var3 = 12;  //4BYTE = 2147483647
		System.out.println(var3);
		System.out.println(Integer.MAX_VALUE);
		
		long var4 = 12;
		System.out.println(var4);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println("----------");
		byte b1 = (byte)128;  //강제 형변환 (숫자 앞에 byte), cast  연산 
		byte b2 = 10;    //자동 형변환 (promotion)
		byte b3 = (byte)(b1 + b2);
		System.out.println("b3 : " + b3);
		
		short s1 = (short)40000;
		int i1 = (int)2147483647;   //정수 2147483647이 최대이기 때문에 넘어가면 형변환 안됨(정수의기억장소의 기존 타입은 integer)
		i1 = 2147483647;
		long l1 = 2147483648L;
		
		
		System.out.println("*\n실수처리---------");
		double d1 = 5.6;
		d1 = 5;
		System.out.println(d1);
		//int kbs = (int)9.0;
		int kbs = (int)9.6;
		System.out.println("kbs : " + kbs);
		
		//float f1 = 3.5; // 정수기억장소 기존 타입은 double
		float f1 = (float)3.5;
		System.out.println(f1);
		
		System.out.println();
		double result = 4.5 + 10;  // 연산시 큰 타입으로 자동 형변환
		System.out.println("result : " + result);
		
		System.out.println("------");
		boolean bu1 = true;
		bu1 = false;
		System.out.println(bu1);
		
		
		System.out.println("------");
		char c1 = 'a';
		//c1 = 'abc'; 
		//c1 = "a"  //문자열(String)
		System.out.println(c1 + " " + (int)c1 + " " + (char)97);  //asci 코드표 보면 97이 소문자a
		
		
		System.out.println("---문자열(string) : 기본형x. 참조형----");
	    String msg = "홍길동";
	    System.out.println(msg);
	    
	    
	    System.out.println("------");
	    System.out.println("안녕" + "\n" + "반가워");
	    System.out.println("안녕" + (char)10 + "반가워");
	    System.out.println("안녕" + (char)13 + "반가워");
		
	    
	    System.out.println();
	    int aa = 0x01;  // hex  ( 0 ~ f )
	    System.out.println(aa);
	    int bb = 072;   //octa1 ( 0~ 7)
	    System.out.println(bb);
	    
	   //byte, short, int, long, flaot, double, char, boolean 기본형
	    
	    
 
		
	}
}

