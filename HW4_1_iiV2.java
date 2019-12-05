public class HW4_1_iiV2{
	public static void main(String [] args){
		int i, j;
		for(i=2; i<100; i++){
			for(j=2; j<i; j++){		//i를 i보다 작은 수(j, 단 1은 제외)로 나눔
				if(i%j==0) break;	//i가 자신보다 작은 수로 나눠떨어진다면 반복문 종료
			}
			if(i == j) System.out.printf("%3d", i);	//어떤 j도 i의 약수가 아니라면 한번도 break 안걸리고 반복문 종료 될 것이므로 i와 j가 같을 것임. 
			//따라서 i와 j가 같다면 소수			
		}
	}
}