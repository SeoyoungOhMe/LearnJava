
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		
		System.out.println("��ȭ�� �Է��ϼ���(���� ��)>>");
		Scanner money = new Scanner(System.in);
		
		int won = money.nextInt();
		double dollar = won/1100;
		System.out.println(won + "���� $" + dollar + "�Դϴ�.");
		
		money.close();
	}

}
