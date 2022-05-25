
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
		System.out.println(s + "��ġ " + color + "�÷�");
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
		System.out.println("���� IPTV�� " + ip + " �ּ��� " + getSize() + "��ġ " + getColor() + "�÷�");
	}
}


public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		
		iptv.printProperty();
	}

}