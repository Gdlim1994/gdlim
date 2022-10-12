package wrapperProject;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarClass {

	public static void main(String[] args) {
//		Calendar c = Calendar.getInstance();
//		System.out.print(c.get(Calendar.YEAR) + "년 ");
//		System.out.print(c.get(Calendar.MONTH) + 1 + "월 ");
//		System.out.print(c.get(Calendar.DAY_OF_MONTH) + "일 ");
//		System.out.print(c.get(Calendar.HOUR) + "시 ");
//		System.out.print(c.get(Calendar.MINUTE) + "분 ");
//		System.out.print(c.get(Calendar.SECOND) + "초 ");
//		System.out.println(c.get(Calendar.DAY_OF_WEEK) + "요일"); //1.일요일
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("년도 입력 : ");
		int year = sc.nextInt();
		
		System.out.println("월 입력 : ");
		int month = sc.nextInt();
		
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year,month-1,1); // 시작하는 달의 1일로 초기화
		eDay.set(year,month,1);//다음 달의 1일로 초기화

		eDay.add(Calendar.DATE, -1); //전 달의 마지막날짜
		
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("     " + year + " 년 " + month + " 월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		for(int i = 1;i<START_DAY_OF_WEEK;i++) {
			System.out.print("   ");
		}
		
		for(int i=1,n = START_DAY_OF_WEEK; i<= END_DAY; i++,n++) {
			System.out.print((i < 10 ? "  " + i: " " + i));
			if(n % 7 == 0) {
			System.out.println();
		}	
	  }
		
		
	}
}
