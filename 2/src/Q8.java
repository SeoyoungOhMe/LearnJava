import java.util.Scanner;

public class Q8 {

	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 8번 직사각형 충돌여부 출력
		
		System.out.print("직사각형을 구성하는 첫 번째 점을 입력하시오>> ");
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		Boolean bo1 = inRect(x, y, 100, 100, 200, 200);
		
		System.out.print("직사각형을 구성하는 두 번째 점을 입력하시오>> ");
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		Boolean bo2 = inRect(x, y, 100, 100, 200, 200);
		
		if (bo1 || bo2) {
			System.out.println("충돌합니다");
		}else 
			System.out.println("충돌하지 않습니다");
		
		scanner.close();
		sc.close();
	}

}
