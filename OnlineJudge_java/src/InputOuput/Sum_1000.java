package InputOuput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum_1000 {

	public static void main(String[] args) throws IOException {

	/////////// �����Ʈ  ///////////
	////////////next()�� space�� ���� �ʾ�! space�� ����Ű�� �ν�
	//		Scanner sc = new Scanner(System.in);
	//		String str = sc.next();
	//		sc.close();
	//		
	//		String[] inputs = str.split(" ");
	//	 	int res = Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1]);  	// index���� 1�� ����
	//		System.out.print(inputs.length);										//1 ��, �����̽����� �����

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String input = in.readLine();
	String[] inputs = input.split(" ");
	System.out.print( Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1]) );


		
	}
	
}


