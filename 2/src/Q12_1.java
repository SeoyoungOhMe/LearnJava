import java.util.Scanner;

public class Q12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12��(1) ��Ģ���� ��� if-else ���� �̿��ϱ�
		
		System.out.print("����>>");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		String cal = scanner.next();
		int y = scanner.nextInt();
		
		int res =0 ;//��� ���
		
		if (y == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} else {
			if (cal.equals("+")) {
				res = x+y;}
			else if (cal.equals("-")) {
				res = x-y;}
			else if (cal.equals("*")) {
				res = x*y;}
			else {
				res = x/y;}
		}
		
		System.out.println(x+cal+y+"�� ��� ����� "+ res);
		
		scanner.close();
		
	}

}
