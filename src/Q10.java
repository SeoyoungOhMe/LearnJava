
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10번 4x4 2차원 배열에 정수를 랜덤하게 생성해 임의의 10개의 위치에 랜덤한 숫자를 삽입해 출력
		
		// 2차원 배열 생성해 0으로 모두 초기화
		int[][] arr = {{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0} };
		
		// 배열에 숫자 삽입
		int num = 0;
		while(num < 10 )// 10번 반복
		{
			int i = (int)(Math.random()*10 + 1); //임의의 정수 생성
			while(true)
			{
				// 임의의 위치 생성
				int m = (int)(Math.random()*4);
				int n = (int)(Math.random()*4);
				
				// 임의의 위치가 0인지 확인
					
				if (arr[m][n] == 0 ) { // 0이면 정수를 위치에 삽입->break
					arr[m][n] = i;
					break;
				} else { // 0이 아니면 다시 임의의 위치 생성(continue)
					continue;
				}	
			}
			
			num++;
		}
		
		//배열 출력
		for (int i = 0 ; i < arr.length; i++)
		{
			for ( int j = 0; j < arr[i].length ; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
