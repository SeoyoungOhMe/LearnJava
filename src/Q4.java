import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4번 알파벳 입력받고 2중 중첩 반복문으로 출력
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char c = s.charAt(0);
		
		for ( char i = c ; i >= 'a'; i--){
			for ( char j = 'a' ; j <= i ; j++ ) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	
		
		scanner.close();
	}

}
