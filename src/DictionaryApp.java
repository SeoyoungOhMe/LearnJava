
abstract class PairMap {
	protected String keyArray []; // key ���� �����ϴ� �迭
	protected String valueArray []; // value ���� �����ϴ� �迭
	abstract String get(String key); // key ���� ���� value ����. ������ null ����
	abstract void put(String key, String value); // key�� value�� ������ ����. ������ key�� ������, ���� value�� ����
	abstract String delete(String key); // key ���� ���� ������(value�� �Բ�) ����. ������ value �� ����
	abstract int length(); // ���� ����� �������� ���� ����
}

class Dictionary extends PairMap {
	int len;
	
	public Dictionary(int n) {
		keyArray = new String[n];
		valueArray = new String[n];
		len=0;
	}
	
	String get(String key) {
		// key ���� ���� value ����. ������ null ����
		for(int i=0; i<length() ; i++) {
			if (keyArray[i].equals(key)) {
				return valueArray[i];
			}
		}
		return null;
	}
	
	void put(String key, String value) {
		// key�� value�� ������ ����. ������ key�� ������, ���� value�� ����
		for(int j=0; j<length() ; j++) {
			if (keyArray[j].equals(key)) {
				valueArray[j] = value;
				return;
			}
			
		}
		keyArray[length()] = key;
		valueArray[length()] = value;
		len++;
		
	}
	
	String delete(String key) {
		// key ���� ���� ������(value�� �Բ�) ����. ������ value �� ����
		for(int i=0; i<length() ; i++) {
			if (keyArray[i].equals(key)) {
				String k = valueArray[i];
				valueArray[i] = null;
				return k;
			}
		}
		return null;
		
	}
	
	int length() {
		// ���� ����� �������� ���� ����
		return len;
	}
}

public class DictionaryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++"); // ���繮�� ���� C++�� ����
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����"); // Ȳ���� ������ ����
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����")); // ������ ������ ����
	}
}
