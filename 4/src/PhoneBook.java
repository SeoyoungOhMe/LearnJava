import java.util.Scanner;

class Phone {
	// name, tel 필드와 생성자
	String name, tel;
	
	public Phone(String name, String tel) { // name, tel 초기화
		 this.name = name;
		 this.tel = tel;
	}
	
	public static void show(String ans, Phone[] phone) {
		
			int count = 0;
			for ( int i = 0 ; i < phone.length; i++ )
			{
				if (ans.equals(phone[i].name)) {
					System.out.println(ans + "의 번호는 " + phone[i].tel + " 입니다.");
					break;
				} else {
					count++;
					continue;
				}
			}
			if (count == phone.length) {
				System.out.println(ans + " 이 없습니다.");
			}
	}
}

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 저장할 사람의 수를 입력
		System.out.print("인원수>>");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Phone[] phone = new Phone[n]; // Phone 객체 배열 생성
		
		for ( int i = 0 ; i < n ; i++ ) 
		{
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			phone[i] = new Phone(name, tel); // Phone 객체 생성
		}
		
		System.out.println("저장되었습니다...");
		
		while(true) {
			System.out.print("검색할 이름>>");
			Scanner s = new Scanner(System.in);
			String ans = s.nextLine();
			
			if (ans.equals("그만")) {
				break;
			} else {
				Phone.show(ans, phone);
			}
		}
		scanner.close();
		//s.close();
	}

}
