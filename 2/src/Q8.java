import java.util.Scanner;

public class Q8 {

	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 8�� ���簢�� �浹���� ���
		
		System.out.print("���簢���� �����ϴ� ù ��° ���� �Է��Ͻÿ�>> ");
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		Boolean bo1 = inRect(x, y, 100, 100, 200, 200);
		
		System.out.print("���簢���� �����ϴ� �� ��° ���� �Է��Ͻÿ�>> ");
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		Boolean bo2 = inRect(x, y, 100, 100, 200, 200);
		
		if (bo1 || bo2) {
			System.out.println("�浹�մϴ�");
		}else 
			System.out.println("�浹���� �ʽ��ϴ�");
		
		scanner.close();
		sc.close();
	}

}
