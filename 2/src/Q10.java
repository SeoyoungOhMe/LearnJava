import java.util.Scanner;

public class Q10 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10�� >> �� ���� ��ġ���� Ȯ��
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		
		Scanner scanner1= new Scanner(System.in);
		int x1 = scanner1.nextInt();
		int y1 = scanner1.nextInt();
		int rad1 = scanner1.nextInt();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		
		Scanner scanner2= new Scanner(System.in);
		int x2 = scanner2.nextInt();
		int y2 = scanner2.nextInt();
		int rad2 = scanner2.nextInt();
		
		if ((x1+rad1 > x2-rad2) || (x1-rad1 > x2+rad2))
		{
			System.out.println("�� ���� ���� ��ģ��.");
		}else {
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		}
		
		scanner1.close();
		scanner2.close();
	}

}
