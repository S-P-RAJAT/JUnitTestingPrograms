package com.bridgelabz.junittestingprograms;

public class Util {
public static void dayOfWeek(int day,int month,int year){
	
	int y0,x,m0=0,d0;
	
	 y0 = year - (14 - month) / 12;
	 x = y0 + y0/4 - y0/100 + y0/400;
	 m0 =month + 12 * ((14 - month) / 12) - 2;
	 d0 =(day + x + (31*m0)/12) % 7;
	 System.out.println("Day of the week: "+d0);
}
public static void main(String[] args) {
	dayOfWeek(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
}
}
