
public class Rectangle {
	
	int x, y, width, height; // 필드
	
	public Rectangle(int x, int y, int width, int height) { // 필드를 초기화하는 생성자
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square() { // 사각형 넓이 리턴
		return width * height;
	}
	
	void show() { // 사각형의 좌표와 넓이를 화면에 출력
		System.out.println("(" + x + "," + y + ")" + "에서 크기가 " + width + "x" + height + "인 사각형");
	}
	
	boolean contains(Rectangle r) { // r이 현 사각형 안에 있ㄷ으면 true 리턴
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
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	}
}
