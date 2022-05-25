import java.util.Scanner;

public class Q10 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10번 >> 두 원이 겹치는지 확인
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		
		Scanner scanner1= new Scanner(System.in);
		int x1 = scanner1.nextInt();
		int y1 = scanner1.nextInt();
		int rad1 = scanner1.nextInt();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		
		Scanner scanner2= new Scanner(System.in);
		int x2 = scanner2.nextInt();
		int y2 = scanner2.nextInt();
		int rad2 = scanner2.nextInt();
		
		if ((x1+rad1 > x2-rad2) || (x1-rad1 > x2+rad2))
		{
			System.out.println("두 원은 서로 겹친다.");
		}else {
			System.out.println("두 원은 서로 겹치지 않는다.");
		}
		
		scanner1.close();
		scanner2.close();
	}

}
