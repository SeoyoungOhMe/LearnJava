import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4�� ���ĺ� �Է¹ް� 2�� ��ø �ݺ������� ���
		
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char c = s.charAt(0);
		
		for ( char i = c ; i >= 'a'; i--){
			for ( char j = 'a' ; j <= i ; j++ ) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	
		
		scanner.close();
	}

}
