import java.util.Scanner;

public class Q12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12번(2) 사칙연산 계산 switch 문을 이용하기
		
		System.out.print("연산>>");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		String cal = scanner.next();
		int y = scanner.nextInt();
		
		int res = 0;//계산 결과
		
		if (y == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			switch (cal) {
				case "+": res = x+y; break;
				case "-": res = x-y; break;
				case "*": res = x*y; break;
				case "/": res = x/y; break;
			}
		}
		
		System.out.println(x+cal+y+"의 계산 결과는 "+ res);
		
		scanner.close();
		
	}

}