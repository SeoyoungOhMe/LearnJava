import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		System.out.println("�ݾ��� �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		int fiveMill = i/50000;
		System.out.println("�������� "+ fiveMill + "��");
		int oneMill = i%50000/10000;
		System.out.println("������ "+ oneMill + "��");
		int oneThou = i%50000%10000/1000;
		System.out.println("õ���� "+ oneThou + "��");
		int hundr = i%50000%10000%1000/100;
		System.out.println("��� "+ hundr + "��");
		int fifty = i%50000%10000%1000%100/50;
		System.out.println("���ʿ� "+ fifty + "��");
		int ten = i%50000%10000%1000%100%50/10;
		System.out.println("�ʿ� "+ ten + "��");
		int one = i%50000%10000%1000%100%50%10;
		System.out.println("�Ͽ� "+ one + "��");
		
		System.out.println();
		
		scanner.close();
	}

}
