
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10�� 4x4 2���� �迭�� ������ �����ϰ� ������ ������ 10���� ��ġ�� ������ ���ڸ� ������ ���
		
		// 2���� �迭 ������ 0���� ��� �ʱ�ȭ
		int[][] arr = {{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0} };
		
		// �迭�� ���� ����
		int num = 0;
		while(num < 10 )// 10�� �ݺ�
		{
			int i = (int)(Math.random()*10 + 1); //������ ���� ����
			while(true)
			{
				// ������ ��ġ ����
				int m = (int)(Math.random()*4);
				int n = (int)(Math.random()*4);
				
				// ������ ��ġ�� 0���� Ȯ��
					
				if (arr[m][n] == 0 ) { // 0�̸� ������ ��ġ�� ����->break
					arr[m][n] = i;
					break;
				} else { // 0�� �ƴϸ� �ٽ� ������ ��ġ ����(continue)
					continue;
				}	
			}
			
			num++;
		}
		
		//�迭 ���
		for (int i = 0 ; i < arr.length; i++)
		{
			for ( int j = 0; j < arr[i].length ; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
