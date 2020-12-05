package pack1;

import java.util.Scanner;

public class Test5switch {

	public static void main(String[] args) {
		// switch
		int nai = 30;
		nai = nai / 10 * 10;
		System.out.println("nai : " + nai);
		
		switch(nai) {
		case 20 :
			System.out.println("이십대");
			System.out.println("청춘");
			break; //걸어주는게 좋음
		case 30 :
			System.out.println("삼십대");	
			break;
		default:
			System.out.println("기타");
			break;
		}
		System.out.println();
		String jik = "과장";
		switch (jik) {
		case "대리":
			System.out.println("아하 대리");
			break;
		case "과장":
			System.out.println("와우과장");
			break;
	
		}
		
		System.out.println();
		////double time = Math.random() //난수
		////int time = (int)(Math.random() * 10)   ; //난수
		int time = (int)(Math.random() * 14) + 8;
		///System.out.println(time);
		switch(time) {
		case 8:
			System.out.println("출근하자");
			break;
		case 9:
			System.out.println("회의하자");
			break;
		case 10:
			System.out.println("프로그렘하자");
			break;
		default :
			System.out.println("휴식");
		}
		
		System.out.println("-----------");
		
		System.out.println("\n해당달의 날 수 출력");
		//키보드로 년, 월을 각각 입력받아 해당 년 월의 날 수 출력, 윤년 체크,
		//해당 년이 4의 배수이고 100의 배수가 아니거나 400의 배수가 이면 윤년
		//키보드로 입력해서 받는법
		Scanner sc = new Scanner(System.in);
		System.out.println("년 임력");
		int year = sc.nextInt();
		System.out.println("월입력");
		int month = sc.nextInt();
	
		if(month < 1 || month > 12) {
			System.out.println("월은 1~12 사이만 허용");
			System.out.println("qq");			
			System.exit(0);
		}
		int nalsu = 28;
		String msg = "평년";
		
	
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			nalsu = 29;
			msg = "윤년";
		}
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
	    case 10:
	    case 12:
	    	nalsu = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			nalsu = 30;
			break;
		}
		System.out.println(year + "년" + month + "월은" + nalsu + "일" + " " + msg);
		
		

		
		/*
		 이건 고정
		int nalsu = 28;
		String msg = "평년";
		int year = 2020;
		int month = 2;
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			nalsu = 29;
			msg = "윤년";
		}
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
	    case 10:
	    case 12:
	    	nalsu = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			nalsu = 30;
			break;
		}
		System.out.println(year + "년" + month + "월은" + nalsu + "일" + " " + msg);
		*/

		System.out.println("-----종료----");		
	}

}
