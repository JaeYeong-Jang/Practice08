package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String userinput;

		System.out.print(">>");

		while (!(userinput = sc.nextLine()).equals("q")) {

			String[] calculate = userinput.split("\\s");

			switch (calculate[1]) {
			case "+": {
				Add add = new Add(Integer.parseInt(calculate[0]), Integer.parseInt(calculate[2]));
				System.out.println(add.calculate());
				break;
			}
			case "-": {
				Sub sub = new Sub(Integer.parseInt(calculate[0]), Integer.parseInt(calculate[2]));
				System.out.println(sub.calculate());
				break;
			}
			case "*": {
				Mul mul = new Mul(Integer.parseInt(calculate[0]), Integer.parseInt(calculate[2]));
				System.out.println(mul.calculate());
				break;
			}
			case "/": {
				Div div = new Div(Integer.parseInt(calculate[0]), Integer.parseInt(calculate[2]));
				System.out.println(div.calculate());
				break;
			}
			default:{
				System.out.println("알수없는 연산입니다.");
				break;
			}

			}
			System.out.print(">>");
			

		}
		System.out.println("종료합니다.");
		
		sc.close();
	}
}
