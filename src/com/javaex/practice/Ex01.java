package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {

		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;

		int result = 0;
		
		//배열의 없는 방을 찾고 있음
		for(int i=0; i<intArray.length; i++) {  // <=  를 < 로 변경
			result = result + intArray[i];
		}
		System.out.println(result);
	}

}


