import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//369게임
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int ten = num/10;
		int one = num%10;
		
		if ((ten==3)|| (ten==6)|| (ten==9))
		{
			if ((one==3)|| (one==6)|| (one==9)) {
				System.out.println("박수짝짝");
			}else {
				System.out.println("박수짝");
			}
		}else {
			if ((one==3)|| (one==6)|| (one==9)) {
				System.out.println("박수짝");
			}
		}
		
		scanner.close();
		
		
		

	}

}
