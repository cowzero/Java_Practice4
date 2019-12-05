import java.util.Scanner;

class HW4_4{
	public static void main(String [] args){
		int year, month, date, before; 
		int beforeYear, beforeMonth, beforeDate;
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �⵵: ");
		year = s.nextInt();
		System.out.print("���� ��: ");
		month = s.nextInt();
		System.out.print("���� ��: ");
		date = s.nextInt();
		
		while(true){
			System.out.print("��ĥ ��: ");
			before = s.nextInt();
			if(before>0) break;
			System.out.println("[�Է¿���]����� �Է����ּ���. ");
		}
		beforeDate = -before + date;  //���� ��¥���� �ñ��� ����ŭ ���� beforeDate�� ����
		beforeMonth = month;
		beforeYear = year; 
		
		while(beforeDate<=0){ //beforeDate�� ������ �״�� ������� ����ϰ� ��¥�� ������� month�� ���ҽ�Ű��, ��¥�� ����� �ٲ��ִ� ������ ����ؼ� ���� 
			if(beforeMonth==1){
				beforeYear--;
				beforeMonth = 12;
			}
			else beforeMonth--;
			
			switch(beforeMonth){
			case 1: case 3: case 5: case 7: case 8: case 10:  case 12: 
				beforeDate += 31;
				break;
			case 4: case 6: case 9: case 11: 
				beforeDate += 30;
				break;
			case 2: 
				if(((beforeYear%4==0)&&(beforeYear%100!=0))||(beforeYear%400==0)) beforeDate += 29;
				else beforeDate += 28;
			}
		}
		
		System.out.format("%d�� ���� ��¥: %d�� %d�� %d��\n", before, beforeYear, beforeMonth, beforeDate);
		
	}
}