class HW4_1_i{
	public static void main(String [] args){
		int i;
		int cnt = 0;
		for(i=1; i<=100; i++){
			if(i%2==0||i%3==0||i%5==0||i%7==0)	continue;	
			else{
				System.out.printf("%3d", i);
				cnt++;	//출력한 수만큼 카운팅한다(10의 배수에서 줄넘김하기 위해)
				if(cnt%5==0)	System.out.println();	//누적 출력 수가 5의 배수인 경우 개행
			}
		}
	}
}