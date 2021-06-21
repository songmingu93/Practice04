package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {

		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;

		int result = 0;
		
		/* 출력결과 예상
		 for i=0 -> result = 0 + 3
		 for i=1 -> result = 3 + 7
		 for i=2 -> result = 10 + 12
		 for i=3 -> result = 22 + 0
		 for i=4 -> result = 22 + 0
		 intArray[2]뒤로 숫자가 없으므로 + 0[i]값
		 <출력>
		 22
		 
		*/
		
		//배열의 없는 방을 찾고 있음
		for(int i=0; i<intArray.length; i++) {  // <=  를 < 로 변경
			result = result + intArray[i];
		}
		System.out.println(result);
	}

}
