
public class Rectangle {
	
	int x, y, width, height; // �ʵ�
	
	public Rectangle(int x, int y, int width, int height) { // �ʵ带 �ʱ�ȭ�ϴ� ������
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square() { // �簢�� ���� ����
		return width * height;
	}
	
	void show() { // �簢���� ��ǥ�� ���̸� ȭ�鿡 ���
		System.out.println("(" + x + "," + y + ")" + "���� ũ�Ⱑ " + width + "x" + height + "�� �簢��");
	}
	
	boolean contains(Rectangle r) { // r�� �� �簢�� �ȿ� �֤����� true ����
		if ((r.x > x) && ((r.x + r.width) < (x + width)))
		{
			if ((r.y > y) && ((r.y + r.height) < (y + height)))
			{
				return true;
			} else {return false;}
		} else {return false;}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}
}
