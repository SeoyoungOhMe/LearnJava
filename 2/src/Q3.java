import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		System.out.println("금액을 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		int fiveMill = i/50000;
		System.out.println("오만원권 "+ fiveMill + "매");
		int oneMill = i%50000/10000;
		System.out.println("만원권 "+ oneMill + "매");
		int oneThou = i%50000%10000/1000;
		System.out.println("천원권 "+ oneThou + "매");
		int hundr = i%50000%10000%1000/100;
		System.out.println("백원 "+ hundr + "개");
		int fifty = i%50000%10000%1000%100/50;
		System.out.println("오십원 "+ fifty + "개");
		int ten = i%50000%10000%1000%100%50/10;
		System.out.println("십원 "+ ten + "개");
		int one = i%50000%10000%1000%100%50%10;
		System.out.println("일원 "+ one + "개");
		
		System.out.println();
		
		scanner.close();
	}

}
