package pack1;

import java.util.Scanner;

public class Test6for {

	public static void main(String[] args) {
		// 반복문 for( 초기치; 조건;증가치){}   for문은 조건이 거짓일때 끝남
		int a;
		int hap = 0; //누적 기억 장소 : 초기호 권장
		for(a = 1; a <= 100; a ++) {
			System.out.print(a + "\t");  //\t 가로 띄어쓰기	
			//a = 3;
			hap += a;
		}
            System.out.println("\na:" + a);
            System.out.println("10 까지의 합은" + hap);//더하기 누적
            
            
            System.out.println();
            for ( int i =65; i <= 90; i++) {
            	System.out.print((char)i + " ");
	}	
            for(int i = 'A'; i <= 'Z'; i++) {
            	System.out.print(i + "");
            	
            }   
            
            System.out.println();
            for(int i =10; i > 1; i -= 2) {
            	System.out.print(i + " ");
            }

            System.out.println();
            for(int ytn = 0, tv = 5; ytn <= 5; ytn++ , tv++) {
            	System.out.print(ytn + " " + tv + " : ");
            }
            
            System.out.println();
            int aa =1;
            for(; aa <= 5; aa++) {
            	if(aa == 2) System.out.println("만세");
            	System.out.print(aa + " ");
            }
            
            //다중 for
            
            System.out.println("\n 다중 for------");
            		for(int m=1; m <= 4; m++) {
            			System.out.print("m:" + m + " ");
            			for(int n=1; n <= 4; n++) {
                			System.out.println("n:" + n + " ");
                		}
            		}
            System.out.println();
            
	
            
            
           System.out.println();
           for(char i = 65; i <=90; i++) {
        	   System.out.println(i + " : ");
        	   for(char j = i; j <= 'Z'; j++) {
        		   System.out.print(j);
        	   }
        	   System.out.println();
           }
           //구구단 출력(3단)
           for (int count = 1; count < 10; count++ ) {
        	   System.out.println("3 * " + count + "=" + (3 * count));
           }
           
           /*
           //문1 : 키보드로 부터 숫자를 받아 구구단 출력 (2~9단)

           //문제2 : 1 ~ 100 사이의 정수 중 3의 배수이면서 5의 배수인 수를 추격하고 그들의 합을 출력
           
           //뮨제3 : 2~9단 까지 출력(다중 for)
           
           //문제4 : **********
           //           *******
           //            *****
           //             ***
           //              *
           
           // 문제5 : 문제4 결과를 뒤집어 출력
            
            for (int count = 1; count < 10; count++ ) {
         	   System.out.println("1 * " + count + "=" + (1 * count));
            }
           for (int count = 1; count < 10; count++ ) {
        	   System.out.println("2 * " + count + "=" + (2 * count));                 
           }
           for (int count = 1; count < 10; count++ ) {
        	   System.out.println("3 * " + count + "=" + (3 * count));               
           }
           for (int count = 1; count < 10; count++ ) {
        	   System.out.println("4 * " + count + "=" + (4 * count));                 
           }
           for (int count = 1; count < 10; count++ ) {
        	   System.out.println("5 * " + count + "=" + (5 * count));                     
           }
           for (int count = 1; count < 10; count++ ) {
        	   System.out.println("6 * " + count + "=" + (6 * count));         
           }
           for (int count = 1; count < 10; count++ ) {
        	   System.out.println("7 * " + count + "=" + (7 * count));               
           }
           for (int count = 1; count < 10; count++ ) {
        	   System.out.println("8 * " + count + "=" + (8 * count));               
           }
           for (int count = 1; count < 10; count++ ) {
        	   System.out.println("9 * " + count + "=" + (9 * count));               
           }
	
            {
            Scanner guk1 = new Scanner(System.in); // 스캐너 클래스를 가지고 왔으니 그 폴더안에 new를 씀으로 저장공간을 확보함
    		System.out.print("구구단입력: ");
    		
            //콘솔 입력 코드
            int num = (new Scanner(System.in)).nextInt();
     
            //num 입력 받은값 + i 1부터 10까지 반복  + num곱하기 i 곱해진게 반복되는꼴
            for (int i = 1; i < 10; i++) {
                System.out.println(num+"*"+i+"="+(num*i));
            }
          
          //문제2 : 1 ~ 100 사이의 정수 중 3의 배수이면서 5의 배수인 수를 추격하고 그들의 합을 출력
            
            
            
            
            
            System.out.println();
            int b;
    		int hap2 = 0; //누적 기억 장소 : 초기호 권장
    		for(b = 15; b <= 100; b += 15) {
    			System.out.print(b + "\t");  //\t 가로 띄어쓰기	
    			//a = 3;
    			hap2 += b;
    		}
                System.out.println("\nb:" + b);
                System.out.println("100 까지의 합은" + hap2);//더하기 누적
                
                
                System.out.println("1~100 3의 배수 이면서 5의 배수 출력: ");
               int hap5 = 0;
                for(int i = 1; i <= 100; i++) {
                	if(i%3 == 0 &&  i%5 == 0) {
                		System.out.print(i + " ");
                		hap5 += i;
                	}
                }
                System.out.println("gkq" + hap5);
                	}

         
            System.out.println("구구단 출력");
            for(int i = 2; i < 10; i++) {
               for(int j = 1; j < 10; j++) {
               System.out.println(i + "*" + j + "=" + (i * j));
               }
            }
	
	
         //다중 for
         
            System.out.println("\n 다중 for------");
            		for(int m=1; m <= 4; m++) {
            			System.out.print("m:" + m + " ");
            			for(int n=1; n <= 4; n++) {
                			System.out.println("n:" + n + " ");
                		}
            		}
            System.out.println();
            */
            
            //continue, break
           for(int i=1; i <= 10; i++) {
        	   //i = 7; 이딴거 하지말기
        	   if(i == 3) continue;
        	   if(i==5) break;  // for 블럭을 탈출
        	   //if(i==5) return;  //method 탈출
        	   if(i==3) System.exit(1); //프로그램종료  3넣으면 종료 x
        	   System.out.print(i + " ");  
        	   
           }
            
           
           System.out.println();
           int kk = 0;
           for(;;) {    //  무한반복
        	   kk++;;
        	   System.out.println("출력: " + kk);
        	   if(kk==30) break;
           }
            	}
            
          
	
	}
	
	
	

