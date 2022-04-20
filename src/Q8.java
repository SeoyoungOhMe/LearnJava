import java.util.Scanner;

public class Q8 {
	public static int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 8번 정수의 개수를 입력받아 랜덤하게 배열에 삽입해 출력
		
		System.out.print("정수 몇개?");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int arr[] = new int[n];
		
		for (int i = 0 ; i < arr.length ; i++ ) 
		{
			while(true) { //정수가 겹치지 않는 경우를 생성
				Q8.j = (int)(Math.random()*100 + 1);
				int ok = 0;
				for ( int k = 0 ; k < i ; k++ ) {
					
					if (j == arr[k]) {
						continue;
					}else {
						ok++;
					}
				}
				if (ok == i) {
					break;
				}
			}
			arr[i] = Q8.j;
		}
		
		int count = 0;
		for (int i = 0 ; i< arr.length; i++ )
		{

				System.out.print(arr[i]+" ");

		}
		
		scanner.close();

	}

}
