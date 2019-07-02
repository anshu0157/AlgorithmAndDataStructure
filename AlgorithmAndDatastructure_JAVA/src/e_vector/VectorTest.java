package e_vector;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// ���� ���� �ٷ�� ���׸� ���� ����
		Vector<Integer> vector = new Vector<Integer>();
		
		vector.add(5);
		vector.add(4);
		vector.add(-1);
		
		//���� �߰��� ����
		vector.add(2,100); // 4�� -1���̿� 100����  (1)  -1 (2) 4 (3) 5
		
		System.out.println("���� ���� ��� ��ü �� : " + vector.size());
		System.out.println("������ ���� �뷮 : " + vector.capacity());
		
		//��� ���� ��� ���
		for (int i =0 ; i<vector.size();i++) {
			int n = vector.get(i);
			System.out.println(n);
		}
		
		int sum = 0;
		//��� ���� ���ϱ�
		for (int i =0 ; i<vector.size();i++) {
			int n = vector.elementAt(i);
			sum += n;
		}
		
		System.out.println(sum);
		System.out.println("���Ϳ� �ִ� ������ �� : " + sum);
		

	}

}
