import java.util.Scanner;

class Dictionary {
	private static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };
	public static String kor2Eng(String word) {
		// �˻� �ڵ� �ۼ�
		for ( int i = 0 ; i < kor.length; i++) {
			if (word.equals(kor[i])) {
				return eng[i];
			} 
		}
		return "false";

	}
}
	
public class DicApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			Scanner scanner = new Scanner(System.in);
			String word = scanner.next();
			if (word.equals("�׸�")) {
				break;
			} else {
				String eng = Dictionary.kor2Eng(word);
				if (eng.equals("false")) {
					System.out.println(word+"�� ���� ������ �����ϴ�.");
				} else {
					System.out.println(word + "�� " + eng);
				}
			}
			
		}
		
	}
}
