import java.util.Scanner;

public class Q8 {
	public static int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 8�� ������ ������ �Է¹޾� �����ϰ� �迭�� ������ ���
		
		System.out.print("���� �?");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int arr[] = new int[n];
		
		for (int i = 0 ; i < arr.length ; i++ ) 
		{
			while(true) { //������ ��ġ�� �ʴ� ��츦 ����
				Q8.j = (int)(Math.random()*100 + 1);
				int ok = 0;
				for ( int k = 0 ; k < i ; k++ ) {
					
					if (j == arr[k]) {
						continue;
					}else {
						ok++;
					}
				}
				if (ok == i) {
					break;
				}
			}
			arr[i] = Q8.j;
		}
		
		int count = 0;
		for (int i = 0 ; i< arr.length; i++ )
		{

				System.out.print(arr[i]+" ");

		}
		
		scanner.close();

	}

}
