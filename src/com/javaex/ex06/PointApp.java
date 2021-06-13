package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
	}
	
	//단순한 변수들 간의 주소값 비교를 하고있는 것 일뿐 변수 내부의
	//매개변수값의 비교는 하고있지 않다.
	//p1과 p4의 비교에서 항상 true값이 나오는 것도 p4변수의 선언 과정에서
	//p4의 변수에 p1의 주소값을 대입 시켜 주었기 떄문에 같은 주소를 가리키기 때문이다.

}


