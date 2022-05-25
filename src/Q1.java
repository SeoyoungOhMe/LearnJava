
class TV {
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV extends TV {
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	public void printProperty() {
		int s = getSize();
		System.out.println(s + "인치 " + color + "컬러");
	}
	protected int getColor() { return color; }
}

class IPTV extends ColorTV {
	private String ip;
	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	public void printProperty() {
		System.out.println("나의 IPTV는 " + ip + " 주소의 " + getSize() + "인치 " + getColor() + "컬러");
	}
}


public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		
		iptv.printProperty();
	}

}