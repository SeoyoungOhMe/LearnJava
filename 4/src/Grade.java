import java.util.Scanner;

public class Grade {
	
	private int math;
	private int science;
	private int english;

	public Grade(int math2, int science2, int english2) { // ������
		this.math = math2;
		this.science = science2;
		this.english = english2;
	}
	
	public int average() { // �޼���
		return (math + science + english)/3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� "+ me.average());
			
		scanner.close();

	}

}
