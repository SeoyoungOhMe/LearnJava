import java.util.Scanner;

public class Q12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12��(2) ��Ģ���� ��� switch ���� �̿��ϱ�
		
		System.out.print("����>>");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		String cal = scanner.next();
		int y = scanner.nextInt();
		
		int res = 0;//��� ���
		
		if (y == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} else {
			switch (cal) {
				case "+": res = x+y; break;
				case "-": res = x-y; break;
				case "*": res = x*y; break;
				case "/": res = x/y; break;
			}
		}
		
		System.out.println(x+cal+y+"�� ��� ����� "+ res);
		
		scanner.close();
		
	}

}