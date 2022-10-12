package wrapperProject;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarClass {

	public static void main(String[] args) {
//		Calendar c = Calendar.getInstance();
//		System.out.print(c.get(Calendar.YEAR) + "�� ");
//		System.out.print(c.get(Calendar.MONTH) + 1 + "�� ");
//		System.out.print(c.get(Calendar.DAY_OF_MONTH) + "�� ");
//		System.out.print(c.get(Calendar.HOUR) + "�� ");
//		System.out.print(c.get(Calendar.MINUTE) + "�� ");
//		System.out.print(c.get(Calendar.SECOND) + "�� ");
//		System.out.println(c.get(Calendar.DAY_OF_WEEK) + "����"); //1.�Ͽ���
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("�⵵ �Է� : ");
		int year = sc.nextInt();
		
		System.out.println("�� �Է� : ");
		int month = sc.nextInt();
		
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year,month-1,1); // �����ϴ� ���� 1�Ϸ� �ʱ�ȭ
		eDay.set(year,month,1);//���� ���� 1�Ϸ� �ʱ�ȭ

		eDay.add(Calendar.DATE, -1); //�� ���� ��������¥
		
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("     " + year + " �� " + month + " ��");
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
