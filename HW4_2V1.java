import java.util.Scanner;
//continue 미 사용
public class HW4_2V1{ 
	public static void main(String [] args){
		int input, n=0;
		double sum = 0; //평균은 double형으로 계산해야 하므로 합부터 아예 double형으로 둠.
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.print("정수: ");
			input = s.nextInt();
			if(input==1111) break;
			if(input%2==1 && input%7 !=0){
				n++;
				sum += input;
			}
		}
		
		if(n==0) System.out.println("평균을 계산할 홀수가 없습니다.");
		else System.out.println("평균: "+sum/n);
	}
}