package Basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import model.Person;
import model.Hero;
import model.Character;
import model.ICharacter;
import model.Magician;

public class Basics {

	//static : ���α׷��� ����� �� �޸𸮿� �ε�Ǵ� �κ� (class�ʹ� ���� ����)
	public static void main(String[] args) {
		int x = 30;
		final int y = 30; //��ȭ �Ⱦ�
		short s = 30;
		long l = 30L;
		
		int i = (int)30L; // type casting ū ���� ���� ���ڿ�
		long ll = 30; // ���� ���� ū ���ڿ� -> �ڵ� ����ȯ
		
		
		double dd = 30.3; //�Ǽ� ������ �� ũ��
		float ff = 30.0f; //
		
		dd = ff; // �ڵ�����ȯ
		ff = (float)dd; // ���� ����ȯ
		
		boolean isMarried = true;
		char c = 'a';
		String str = "�ȴ�";
				
		System.out.println(str);
		System.out.printf("���� %s�Դϴ�. ���̴� %d�̰�, Ű�� %f�Դϴ�.\n", "ȫ����", 20, 170.5f);
		
		String str2 = String.format("���� %s�Դϴ�. ���̴� %d�̰�, Ű�� %f�Դϴ�.", "ȫ����", 20, 170.5f);
		System.out.println(str2);
		
		
		//Math
		System.out.println(Math.max(10, 30)); // min, abs
		
		//���ڿ� <-> ���ڿ�
		String str1 = "100";
		int ii = Integer.parseInt(str1);   //str -> num
		String str11 = String.valueOf(ii); //num -> str
		
		//Random
		Random random = new Random();
		int rand = random.nextInt(4) + 5 ; //  5- 9
		System.out.print(rand);
		
		// �����Է�
//		Scanner scanner = new Scanner(System.in);
//		System.out.println(scanner.next());
//		String scstr = scanner.next();
//		int sci = scanner.nextInt();
//		long scl = scanner.nextLong();
		
		//���ǹ�
		int a = 10;
		if(a > 5) {
			System.out.println("��");
		}
		else if(a>3) {
			System.out.println("�۽�");
			}
		else {
			System.out.println("����");
		}
		

		String strr;
		strr = isMarried ? "��" : "����";
		System.out.println(strr);
		// ���ǹ� Switch
		switch(strr) {
			case "��" : 
				System.out.println("������");
				break; // break ���ϸ� �ؿ��� �����
			case "����" :
				System.out.println("xxx");
				break;
			default:
				System.out.println("������");
		}
				
		//�ݸ� (continue, braek)
		for(i = 0; i < 10 ; i++) {
			
			if (i==6) {
				continue; // fi�� 6�̸� pass (������ϰ� 7�� �Ѿ��.)
			}
			
			if(i==8) {
				break; // 8�̸� �ݺ��� ����������.
			}
		}
		
		System.out.printf("i : %d", i);
		
		
		
		//�迭
		int[] score;
		score = new int[5]; // �ʱ�ȭ�� 0����, String�� null�� ����ִ�.
		
		int[] arr = new int[5];		
		int count = score.length;
		score[0] = 10;
		
		int[] score2 = new int[] {1,2,3,4,5};
		int[] score3 = {1,2,3,4,5};
		
		String[] names = {"ȫdd", "��"};
		String[] names2 = new String[2];
		
		System.out.println(names[0].length()); 
//		System.out.println(names2[0].length()); //nullpointerException
		
		// ����Ʈ
		// ���ϴ� ���� ������ ������ ����, ����
		ArrayList<Integer> scoreList = new ArrayList<>();
		scoreList.add(10);
		scoreList.add(20);
		scoreList.add(30);
		scoreList.add(2,1000); // index=2 �ڸ��� 1000�߰�.
		System.out.println(scoreList);
		scoreList.remove(2);
		System.out.println(scoreList);
		
		
		// �����ε�
		add(20,10);
		add(20,10,5);
		System.out.println(add(1,2,3,4,5));
		
		
	
		
		Person person = new Person();
		Person person2 = new Person("ȫ�浿", 10);
		System.out.println(person);
		System.out.println(person2);
			
		Hero hero1 = new Hero("���۸�");
		System.out.println(hero1.isFlying());
		
		Hero hero2 = new Hero("��Ʈ��");
		hero2.isFlying();
		
		hero1.attack(hero2);
		
		
		// �߻�Ŭ������ �������̽� (��� : Person > �߻� class Character, interface ICharacter > Magician, Hero) 
		
		Character chracter = new Hero("���۸�2"); // �߻�Ŭ������ new �� �� ������, ��ӹ����ط� �� �� �ִ�.
		
		
		//������		
		Character magician2 = new Magician();	
		Magician magician = new Magician();
		ICharacter magiciani = new Magician();
		
		if(magician instanceof Magician) {
			System.out.println( "magician: I'm a Magician!");
		} 
		
		if(magician2 instanceof Magician) {
			System.out.println( "magician2: I'm a Magician!");
		} 
		
		if(magiciani instanceof Magician) {
			System.out.println( "magiciani: I'm a Magician!");
		} else {
			System.out.println( "magiciani: I'm not a Magician!");
		}
		
		// 
		ArrayList<Character> characterAL = new ArrayList<>();
		characterAL.add(magician);
		characterAL.add(magician2);
//		characterAL.add(magiciani); //error -> Character ���������� ���� Magician ��������! 
		characterAL.add(hero1); //hero1 �� Character ��ӹ���
		
		
		
	}
	
	
	
	//�����ε�
	public static void add(int x, int y) {
		System.out.println(x+y);
		
	}
	
	public static void add(int x, int y, int z) {
		System.out.println(x+y+z);
		
	}

	public static int add(int ... numbers) {
		//... : 0������ n��, �迭�� ���´�.
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		
		return sum;
		
	}

	
	
	//Generic
	
	
	

	

}





