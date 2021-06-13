package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		String[] numArray = numLine.split(" ");   // split함수를 사용해 " " 공백 을 기준으로 전,후의 문자열을 잘라내어 numArray[]배열에 대입
		
		for(int i = 0; i < numArray.length; i++) {
			sum += Integer.parseInt(numArray[i]); // 반복문을 통해 numArray[]에 대입된 배열의요소(문자열)를 parseInt함수를 사용해
												  // 정수형으로 변환 후 sum변수에 합
		}
											      //어렵당.
		System.out.println("합:" + sum);	
		
		sc.close();
	}

}
