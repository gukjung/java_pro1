package pack1;

import java.util.Scanner;

public class ddddd {
  
	public static void main(String[] args) {
		
	
		 System.out.println("구구단 출력");
         for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
            System.out.println(i + "*" + j + "=" + (i * j));
            }
         }
         
         for(int i =0; i < 4; i++ ) {
        	 for(int j = 0; j < 4; j++) {
        		 System.out.print("*");
        	 }
        	 System.out.println("");
        	 
         }
         
         for(int i =0; i < 5; i++ ) {
        	 for(int j = 0; j < 4 -i; j++) {
        		 System.out.print(" ");
        	 }
        		for(int j = 0; j <2 *i+1; j++) {
        			System.out.print("*");
        		}
         System.out.println("");       
	}
     
         
        /* 
         for(int i = 10; i > 0; i--) {
        	for(int j = 0; j < 10 - i; j--) {
        		System.out.print(" ");
        	}
        	for(int k = 0; k<4; k-- ) {
        		System.out.print("*");
        	}
        System.out.println();
        }
         
         */
       //문제1 : 키보드로 부터 숫자를 받아 구구단 출력 ( 2 ~ 9 까지만 허용)
         
        Scanner sc = new Scanner(System.in);
 	   
 	    System.out.print("단수 입력 :");
 	    int x = sc.nextInt();
 	    
 	    if(x < 2 || x > 9) { //오류 입력 방지
 	    	System.out.println("단은 2 ~ 9 까지만 허용");
 	    	System.exit(0);
 	    }
 	    
 	    for(int i=1; i<=9; i++) {
 	    	System.out.println(x+" * " + i + " = " + (x * i));
 	    }
 		//문제2 : 1 ~ 100 사이의 정수 중 3의 배수이면서 5의 배수인 수를 출력하고 그들의 합을 출력
 	    int sum=0;
 	    for(int i=1; i<=100; i++) {
 	    	if(i % 3 == 0 && i % 5 ==0) {
 	    		System.out.print(i + " ");
 	    		sum += i;
 	    	}	    	
 	    }
 	    System.out.println();
 	    System.out.println("합은 " + sum);
 	  
 	    //문제3 : 2 ~ 9 까지 구구단 출력 (다중 for)
 	    
 	    for(int i=2; i<=9; i++) {
 	    	for(int j=1; j<=9; j++) {
 	    		System.out.print(i + " * "+ j+ " = " + (i * j) + " ");
 	    	}
 	    	System.out.println();
 	    }
 	    
 	    
 	    //문제4 : *********
 	    //        *******
 		//         *****
 	    //          ***
 	    //           *
 	    for(int i=5; i>=1; i--) {
 	    	for(int j=5-i; j>0; j--) {
 	    		System.out.print(" ");
 	    	}
 	    	for(int k=(2*i-1); k>=1; k--) {
 	    		System.out.print("*");
 	    	}
 	    	System.out.println();
 	    	
 	    }
 	   
 	    System.out.println();
 	    
 	    //문제5: 문제4 결과 뒤집어 출력
 	
 	    
 	    for(int i=1; i<=5; i++) {
 	    	for(int j=0; j<5-i; j++) {
 	    		System.out.print(" ");
 	    	}
 	    	for(int k=1; k<=(2*i-1); k++) {
 	    		System.out.print("*");
 	    	}
 	    	System.out.println();
 	    	
 	    }
         
	}
}
            
