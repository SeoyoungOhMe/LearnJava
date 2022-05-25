import java.util.Scanner;
 
interface Stack{
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}
 
class StringStack implements Stack{
	String[] arr;
	int len,cap;
	public StringStack(int n) {
		arr=new String[n];
		len=0;
		cap=n;
	}
	
	public int length() {
		return len;
	}
	
	public int capacity() {
		return cap;
	}
	
	public String pop() {
		return arr[--len];
	}
	
	public boolean push(String val) {
		if(len==cap) {
			System.out.println("������ �� ���� Ǫ�� �Ұ�!");
			return false;
		}
		else {
			arr[len++]=val;
			return true;
		}
	}	
	
	public boolean isEmpty() {
		if(len==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void print() {
		System.out.print("���ÿ� ����� ��� ���ڿ� �� :");
		while(!isEmpty()) {
			System.out.print(" "+pop());
		}
		System.out.println();
	}
}
 
public class StackApp {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		
		int n=sc.nextInt();
		StringStack ss=new StringStack(n);
		
		String op;
		while(true) {
			System.out.print("���ڿ� �Է� >> ");
			op=sc.next();
			if(op.equals("�׸�")) {
				break;
			}
			ss.push(op);
		}
		ss.print();
	}
 
}
