package com.choa.t3;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal>";
	
	public void runPrompt(){
		Scanner sc = new Scanner(System.in);
		Calender c = new Calender();
		int month = 1;
		
		while(true){
			System.out.println("달을 입력하세요 :");
			System.out.println(PROMPT);
			month = sc.nextInt();
			if(month == -1){
				break;
			}
			if(month == 12){
				continue;
			}
			c.printCalender(2017, month);
			System.out.printf("%d월은 %d일까지 있습니다.\n",month,c.getMaxDayOfflength(month));
		}
		System.out.println("Bye~");
	
	}
	
	public static void main(String[] args) {
		
		Prompt p = new Prompt();
		p.runPrompt();
		
	}
}
