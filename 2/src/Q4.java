import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		System.out.println("정수 3개 입력>>");
		Scanner scanner = new Scanner(System.in);
		
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		int mid1 = (n1 > n2) ? n1 : n2;
		int mid3 = (n1 < n2) ? n1 : n2;
		
		int n3 = scanner.nextInt();
		
		int mid2 = (mid1 < n3) ? mid1 : n3;
		
		int ans = (mid3 > mid2) ? mid3 : mid2;
		System.out.println("중간 값은 " + ans);
		scanner.close();
	}

}
