import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2자리수 정수 입력(10~99)>>");
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		int ten = i/10;
		int one = i%10;
		
		if (ten == one) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		} else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		}
		
		scanner.close();

	}

}
