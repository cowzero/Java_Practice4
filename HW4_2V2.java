import java.util.Scanner;
//continue  사용
public class HW4_2V2{ 
	public static void main(String [] args){
		int input, n=0;
		double sum = 0;
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.print("정수: ");
			input = s.nextInt();
			if(input==1111) break;
			if(input%2!=0){
				if(input%7==0) continue;//continue가 속한 중괄호 아래 부분은 모두 스킵, 즉 7의 배수라면 15, 16 라인 스킵
				n++;
				sum += input;
			}
		}
		
		if(n==0) System.out.println("평균을 계산할 홀수가 없습니다.");
		else System.out.println("평균: "+sum/n);
	}
}