import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6�� �ݾ��� �Է¹޾� ��ȯ
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] unit = {50000, 10000, 1000, 100, 10, 1};

		int k = n;
		for ( int i = 0 ; i < unit.length ; i++ ) {
			
			System.out.print(unit[i] + "�� ¥�� : " + k/unit[i] + "��\n" );
			
			k = n%unit[i];
		}
		
		scanner.close();

	}

}
