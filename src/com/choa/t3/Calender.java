package com.choa.t3;

import java.util.Scanner;

public class Calender {
	
	private static final int[] maxDays = {31,28,31,30,31,30,31,30,31,30,31,30};
	
	public void printCalender(int year, int month){
		System.out.printf("     <<%4d년 %3d월>>\n",year,month);
		System.out.println(" su mo th we th fr sa ");
		System.out.println(" ---------------------");
		int maxDay = getMaxDayOfflength(month);
		for(int i=1;i<=maxDay;i++){
			System.out.printf("%3d",i);
			if(i % 7 == 0){
				System.out.println();
			}
		}
	

	}
	public int getMaxDayOfflength(int month){
		
		return maxDays[month - 1];
	}
	
}
