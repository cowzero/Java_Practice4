public class HW4_1_ii{
	public static void main(String [] args){
		int i, j, cnt;
		for(i=2; i<100; i++){
			cnt = 0; //약수 개수를 저장할 변수 
			for(j=1; j<i; j++){		//i보다 작은 수로 나눔
				if(i%j==0) cnt++;	
				if(cnt>1) break;	//i의 약수 개수가 1개 보다 많을 경우 이미 소수가 아니므로 반복문 종료
			}
			if(cnt == 1) System.out.printf("%3d", i);	//약수의 개수가 1인 경우만 i출력
		}
	}
}