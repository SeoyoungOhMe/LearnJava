import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6번 금액을 입력받아 변환
		
		System.out.print("금액을 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] unit = {50000, 10000, 1000, 100, 10, 1};

		int k = n;
		for ( int i = 0 ; i < unit.length ; i++ ) {
			
			System.out.print(unit[i] + "원 짜리 : " + k/unit[i] + "개\n" );
			
			k = n%unit[i];
		}
		
		scanner.close();

	}

}
