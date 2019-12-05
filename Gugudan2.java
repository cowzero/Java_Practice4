import java.util.Scanner;
//break; 사용
class Gugudan2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int col;
		int i, j, k;
		System.out.print("몇 열씩 출력?: ");
		col = s.nextInt();
		
		for(i=2;i<=9;i+=col){		
			for(j=1; j<=9; j++){	
				for(k=0;k<col;k++){
					if(i+k>9) break;				
					System.out.printf("%d * %d = %2d   ", (i+k), j, (i+k)*j);
				}
				System.out.println();
			}
			for(k=0;k<col;k++){
				if(i+k>9) break;
			System.out.print("------------");
			}
			System.out.println();
		}
	}
}