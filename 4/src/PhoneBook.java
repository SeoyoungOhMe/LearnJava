import java.util.Scanner;

class Phone {
	// name, tel �ʵ�� ������
	String name, tel;
	
	public Phone(String name, String tel) { // name, tel �ʱ�ȭ
		 this.name = name;
		 this.tel = tel;
	}
	
	public static void show(String ans, Phone[] phone) {
		
			int count = 0;
			for ( int i = 0 ; i < phone.length; i++ )
			{
				if (ans.equals(phone[i].name)) {
					System.out.println(ans + "�� ��ȣ�� " + phone[i].tel + " �Դϴ�.");
					break;
				} else {
					count++;
					continue;
				}
			}
			if (count == phone.length) {
				System.out.println(ans + " �� �����ϴ�.");
			}
	}
}

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ ����� ���� �Է�
		System.out.print("�ο���>>");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Phone[] phone = new Phone[n]; // Phone ��ü �迭 ����
		
		for ( int i = 0 ; i < n ; i++ ) 
		{
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			String name = scanner.next();
			String tel = scanner.next();
			phone[i] = new Phone(name, tel); // Phone ��ü ����
		}
		
		System.out.println("����Ǿ����ϴ�...");
		
		while(true) {
			System.out.print("�˻��� �̸�>>");
			Scanner s = new Scanner(System.in);
			String ans = s.nextLine();
			
			if (ans.equals("�׸�")) {
				break;
			} else {
				Phone.show(ans, phone);
			}
		}
		scanner.close();
		//s.close();
	}

}
