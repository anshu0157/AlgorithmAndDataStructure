package Basic;
import java.util.ArrayList;

public class GenericPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("�ȳ�");
		print(1);
		print(3L);
		print(true);
	}
	
	public static <T> void print(T type) {
		System.out.println(type);
		
	}

}
