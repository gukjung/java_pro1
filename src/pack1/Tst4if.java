package pack1;

import java.util.Scanner;

public class Tst4if {

	public static void main(String[] args) {
		/*
		// 외부에서 값 얻기 1
		if(args.length == 0) {
			System.out.println("외부에서 값 얻기 실패");
			////System.exit(0);
		} else {
			System.out.println("args : " + args[0] + " " + args[1]);
			
		}
		
		// 외부에서 값 얻기 2 : 키보드
		
		Scanner sc = new Scanner(System.in); // 스캐너 클래스를 가지고 왔으니 그 폴더안에 new를 씀으로 저장공간을 확보함
		System.out.print("상품명 입력: ");
		String irum = sc.next();
		System.out.print("나이 입력: ");
		int nai = sc.nextInt();
		System.out.println(irum + "님의 나이는" + nai);	
		*/
		// 조건 판단문 if
		
		int num = 2;
		
		if(num>=5) {
			System.out.println("크군요");
			System.out.println("자바 만세");
	}
		
		System.out.println();
		
		num = 5;
		
		if(num <8 ) {
			System.out.println("작군요");
			System.out.println("참");
		} else {
			System.out.println("작지않아요");
		}
		
		System.out.println();
		int jumsu = 67;
		if( jumsu >= 70) {
			if(jumsu >= 90) {
				System.out.println("우수");
			}else {
				System.out.println("보통");
			}
		}else {
				if( jumsu >= 50 ) {
					System.out.println("저조");
				}else {
					System.out.println("엄청저조");			
			}
		}
		
		System.out.println();
		jumsu = 92;
		String gg = "";
		if( jumsu >= 90) {
			gg = "수";
		} else if( jumsu >=80) {
			gg = "우";
		} else if( jumsu >=70) {
			gg = "미";
		} else if( jumsu >=60) {
			gg = "양";
		} else if( jumsu < 50) {
			gg = "가";
		}
		System.out.println(" " + gg);	
	
		
		//문 : 키보드로부터 상품명, 수량, 단가를 각각 입력받아 금액(수량 * 단가)를 구하시오
		// 조건 : 금액이 5만원 이상이면 금액에 10%를, 그 외는 금액에 5%를 세금으로 출력
		// 출력 모양 ==>  상품명:   금액:   세금:
		
		Scanner guk1 = new Scanner(System.in); // 스캐너 클래스를 가지고 왔으니 그 폴더안에 new를 씀으로 저장공간을 확보함
		System.out.print("상품명 입력: ");
		String guk2 = guk1.next();
		System.out.print("수량 입력: ");
		int guk3 =guk1.nextInt();
	    System.out.print("단가 입력");
	    int guk4 = guk1.nextInt();
	    int guk5 = (guk3 * guk4);
	   
	    double guk6;
	    
	    if(guk5 >= 50000) {
	    	guk6 = guk5 * 0.1;
	    } else { guk6 = guk5 * 0.05;	    	
	    	}
	    
	    System.out.println("상품명" + guk2 + "" + "금액" + guk5 + "" + "세금" + guk6);   	
		System.out.println("프로그램 종료");

	}
}
