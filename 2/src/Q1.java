
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		
		System.out.println("원화를 입력하세요(단위 원)>>");
		Scanner money = new Scanner(System.in);
		
		int won = money.nextInt();
		double dollar = won/1100;
		System.out.println(won + "원은 $" + dollar + "입니다.");
		
		money.close();
	}

}
