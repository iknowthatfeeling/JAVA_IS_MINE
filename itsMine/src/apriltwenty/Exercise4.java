package apriltwenty;

public class Exercise4 {

	public static void main(String[] args) {
		/*While ���� Math.random()�޼ҵ带 �̿��ؼ� �ΰ��� �ֻ��Ӹ� ������ ��
		 * ������ ���� (��1, ��2) ���·� ����ϰ�,
		 * ���� ���� 5�� �ƴϸ� ��� �ֻ����� ������, ���� ���� 5�̸� ������ ���ߴ� �ڵ�.
		 * 
		 * (1.4),(4,1),(2,3),(3,2)
		 * 
		 */
		while (true) {
		int num1 = (int)(Math.random()*6+1);
		int num2 = (int)(Math.random()*6+1);
		
		System.out.println("(" + num1 + " , " + num2 + ")");
		

			if	(num1 + num2  == 5 )
			break;
		}

		

	}

}