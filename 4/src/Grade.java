import java.util.Scanner;

public class Grade {
	
	private int math;
	private int science;
	private int english;

	public Grade(int math2, int science2, int english2) { // 생성자
		this.math = math2;
		this.science = science2;
		this.english = english2;
	}
	
	public int average() { // 메서드
		return (math + science + english)/3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 "+ me.average());
			
		scanner.close();

	}

}
