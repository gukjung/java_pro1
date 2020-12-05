package pack1;

import java.util.Scanner;

public class Text7while {

	public static void main(String[] args) {
		// 반복문 while(조건) {} 참인것만 수행
		int w = 1;
		while ( w <= 5) {
			System.out.println("w: " + w);
			w++; //반복문 탈출을 위한 작업 필수
	}
	System.out.println("탈출 후 w : " + w);
		
	
	System.out.println();
	w = 0;
	while(true) {       //무한 반복  //while은 false없음 거짓이면 수행자체를 못함
		w++;
		if(w ==2) continue;
		if(w == 5) break;
		System.out.println("w: " + w);
	}
	
	System.out.println();
	w = 10;
	do {
		System.out.println("더블유:"  + w);
		w++;
	}while ( w <= 5);   // 최소 한번은 수행하게 하고 싶으면 조건을 뒤에 걸어줌 (지금 조건은 false임)
	
	
	
	//q1) 1~100 사이의 숫자 중 3의 배수이나 2의 배수가 아닌 수를 출력하고, 그 합과 건수를 출력
	
	int k = 0;
	while (1<=100) {
		k++;;
		if(k % 3 == 0 && k % 2 != 0) continue;
		if(k == 101) break;
		System.out.println(" k " + k);
	}
	
	
	
	int aa = 1;
	int sss = 0;
	while (aa <= 100){
		if(aa % 3 == 0 && aa % 2 != 0) {
			System.out.println(aa);
			sss += aa;
		}
		aa++;;
	}
	System.out.println("합 : " + sss);
	
	
	{
	
	
	{
		/*for(int i = 1 ; i <= 50 ; i++) {
			if(i%3 == 0) {
				System.out.println(i);
			}
		}
	*/
	
	
	
	//문2) -1, 3, -5, 7, -9, 11 ~99 까지의 합?
		
		int u = 0;
		int hap = 0;
		while (0<=50) {
			u++;;
			if(u % 2 == 0) continue;
			if(u == 51) break;
			hap += u;;
			System.out.println(u);
			}		
			System.out.println(" u " + hap);
		}
		
	int m = 3; // -97 +99 제한
	int b = -1;
	int hab = 0;
	int q = 0;
	int add = 0;
	while(m > -97) {
		m =m -4;
		System.out.println(m);
		hab += m;
		while(b < 99) {
			b = b + 4;
			System.out.println(b);
			q += b;
		}
		add = hab + q;
		
	}
	System.out.println(hab);
	System.out.println(q);
	System.out.println("99까지의 홀스 +-의 합" + add);
			
				
		
	
	//문3) 키보드 숫자 입력 : 5
	//       5까지의 합 출력
	//       계속할까요?(1/0)
	
	 Scanner sc = new Scanner(System.in);
		int y = 0; //합
		int z = 1; //초기화
		while(true) {
			System.out.print("숫자를  입력하세요 :");
		    int x = sc.nextInt(); //입력값
		    while(z<=x) {
				y += z;
				z++;}
				System.out.println(x + "까지의 합 : " + y);
				System.out.print("계속하시겠습니까?");
				int ff = sc.nextInt();
				if(ff == 1) continue;
				if(ff == 0) break;
				else { 
					System.out.println("0과 1만 입력이 가능합니다.");
					System.exit(0);
				}
			
	
	
	
	
	
	
	
	
	
	
	}
}
	}

}
	

