import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		System.out.println("정수 3개를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		int mid1 = (n1 > n2) ? n1 : n2;
		int mid2 = (n1 < n2) ? n1 : n2;
		
		int n3 = scanner.nextInt();
		
		int max = (mid1 > n3) ? mid1 : n3;
		mid2 = (mid1 < n3) ? mid1 : n3;
		if (mid1 + mid2 > max) {
			System.out.println("삼각형이 됩니다");
		} else {
			System.out.println("삼각형이 되지 않습니다");
		}
		
		scanner.close();
	}

}
