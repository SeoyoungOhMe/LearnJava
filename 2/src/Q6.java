import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//369����
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int ten = num/10;
		int one = num%10;
		
		if ((ten==3)|| (ten==6)|| (ten==9))
		{
			if ((one==3)|| (one==6)|| (one==9)) {
				System.out.println("�ڼ�¦¦");
			}else {
				System.out.println("�ڼ�¦");
			}
		}else {
			if ((one==3)|| (one==6)|| (one==9)) {
				System.out.println("�ڼ�¦");
			}
		}
		
		scanner.close();
		
		
		

	}

}
