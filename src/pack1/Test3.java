package pack1;

public class Test3 {
	public static void main(String[] args) {
		
	
		//관계 , 논리, 연산
		int a=5;
		System.out.println(a > 3);
		System.out.println(a <= 3);
		System.out.println(a == 3);
		System.out.println(a != 3);  //같지 않다.
		
		System.out.println();
		int b = 10;
		System.out.println(a > 3 && b <=10);   //논리연산자
		System.out.println(a > 3 && b ==10);
		System.out.println(a > 20 && b <=5);  // && 처음이 맞으면 뒤에꺼 봄,처음이 아니면 뒤에 안봄
		System.out.println(a > 20 & b <=5);  //  &  양쪽 모두다 봄
		System.out.println(a > 6 || b <10);
		System.out.println(a > 6 || b <20); // 하나라도 만족하면 참  ||일때 첫번째가 참이면 두번째꺼 안봄
		System.out.println(a > 6 | b <10);  //  |  일때는 앞의 값이 참이라도 뒤에꺼 확인함
		System.out.println(a > 6 || b <20 + 4 * 2);  // 연산자 우선순위 : () > 산술(* , / , %  >  + , -) > 관계 > 논리 > 치환
	
		System.out.println();
		//shift 연산자
		int ii =8, ij;
		// System.out.println(ii + " " + ij);  ij가 값이 없기 때문에 오류 // 지역변수는 초기화 필수
		System.out.println("ii:" + ii +" " + Integer.toBinaryString(ii)); // 2진수?
		ij = ii << 1; // 좌로 1bit 이동 , 남는 우측 1bit는 0으로 채움
		System.out.println("ij:" + ij +" " + Integer.toBinaryString(ij));
		ij = ii >> 2; // 우로 2bit 이동 , 남는 좌측 2bit는 0으로 채움
		System.out.println("ij:" + ij +" " + Integer.toBinaryString(ij));
		ij = ii >>> 2; // 우로 2bit 이동 , 남는 좌측 2bit는 0으로 채움
		System.out.println("ij:" + ij +" " + Integer.toBinaryString(ij));
	
		
		System.out.println();
		int result = (ii <= 5)? 100:100 + 50;
		System.out.println("result : " + result);// 조건이 참이면 100 아니면 100+50
	
	
		System.out.println();
		int x, y, z;
		x = y = z =5;
		System.out.println(x + " " + y + " " + z);
	
		System.out.println("----");
	
		aa();
		System.out.println("-----");
		
		System.out.println(bb(12));
		int mbc = bb(11);
		System.out.println("mbc : " + mbc);
		System.out.println("프로그램 종료");
	}

	
	public static void aa () {
		System.out.println("aa 메소드(단위 프로그램 : unit) 수행");
	}
	
	public static int bb (int arg) {
		System.out.println("bb 메소드 (단위 프로그램 : unit) 수행");
		int imsi = arg + 100;
		return imsi;
	}
		
}

