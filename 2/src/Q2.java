import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2�ڸ��� ���� �Է�(10~99)>>");
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		int ten = i/10;
		int one = i%10;
		
		if (ten == one) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		} else {
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}

	}

}
