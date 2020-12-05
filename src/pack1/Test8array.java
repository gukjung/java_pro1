package pack1;

public class Test8array {

	public static void main(String[] args) {
		// 배열 : 성격과 크기가 일치하는 복수 개의 기억장소를 대포명 하나를 주고 첨자 (index)로 기억장소를 구분
		// 장점 : 반복처리가 효과적 - for문과 함께함
		

		int a;      // simple variable
		int[] ar;  // int ar[] 랑 같은 말  // array
		ar = new int[5];   //기억장소가 확보
		System.out.println("ar의 크기 : " + ar.length);
		
		ar[0] =10;
		ar[1] = 20;
		ar[4] = ar[0] + ar[1];
		System.out.println("ar[4] : " + ar[4] );
		int aa = 4, cc =  2 + 2;
		System.out.println("ar[4} : " + ar[aa] + " " + ar[cc] + " " + ar[2+2]);   //첨자 변수
	
		System.out.println();
		int[] ar1 = {1, 2, 3, 4, 5}; // 선언과 동시에 값 기억
		System.out.println(ar1[0] + " " + ar1[4]);
		int hap = 0;
		for(int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i] + " ");
			hap += ar1[i];
			
		}
			System.out.println(" 합은 " + hap);
			
		//향상된 for
			
			
			for(int sbs:ar1) {
				System.out.println(sbs + " ");	
			}
			System.out.println();
			String[] city = {"서울", "인천", "수원", "의정부", "천안"};
			for(String c : city) {
				System.out.println(c + " ");
			}
			
			
			System.out.println();
			int [] ar2 = new int [5];
			for (int i = 0; i < ar2.length; i++) {
				ar2[i] = i +1;
			}
			for(int i = 0; i < ar2.length; i++) {
				System.out.println(ar2[i] + " ");
			}
			
			System.out.println();
			
			//다차원배열
			int su[][] = new int[3][4]; //2차원
			System.out.println(su.length + " " + su[0].length);
			su[0][0] = 100;
			System.out.println(su[0][0]);
			System.out.println();
			
			int num = 10;
			for (int i = 0; i < su.length; i++) {  //행청자로 사용
				for (int j = 0; j < su[1].length; j++) {    //열첨자로 사용
					su[i][j] = num++;
					
				}
				
			}
			//System.out.println(su[0][1]);
			for (int i = 0; i < su.length; i++) {  //행청자로 사용
				for (int j = 0; j < su[1].length; j++) {    //열첨자로 사용
					System.out.print(su[i][j] + " ");
					
					
				}
				System.out.println();
				
			}
			
			System.out.println();
			//가변 배열
			int [][] scores = new int [2][];
			scores[0] = new int [2];
			scores[1] = new int [3];
			System.out.println(scores.length + " " + scores[0].length + " " +scores[1].length);
			
			System.out.println();
			int[][] jum2 = {{90, 92}, {88, 56, 77}};
			for (int i = 0; i < jum2.length; i++) {
				for (int j = 0; j < jum2[i].length; j++) {
				System.out.print(jum2[i][j] + " ");
				}
				System.out.println();
				
			}
			
	
			
			
	}

}


































