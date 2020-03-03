package mf_20200303;

import java.io.*;
import java.util.*;

public class Normalize {
	public static String ChangeStr(String str){
		str = str.toLowerCase();
		char upper = Character.toUpperCase((str.charAt(0)));
		str = upper + str.substring(1, str.length());
		return str;
	}
		
	
	public static String getFormattedName(String firstName, String lastName){
		String formattedName;
		formattedName = ChangeStr(firstName) + " "  +  ChangeStr(lastName);
		return formattedName;
	}
	
	
	/* 
	** ���� �Լ����� �׽�Ʈ���̽��� ����¿� ���� �⺻���� ���� �ڵ尡 �ۼ��Ǿ� �ֽ��ϴ�. 
	** ����� �Լ��� �ϼ��Ͽ��� ������ �ذ��� �� ������, 
	** ���� �Լ��� ������ �� ������ �ڵ带 ��� �ۼ��Ͽ��� �����մϴ�.
	** ��, ������ �ۼ��� �ڵ�� ���� �߻��� ���� ���� ��� �����ڿ��� å���� �ֽ��ϴ�.
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		//�׽�Ʈ���̽��� ���� �Է¹޴´� 
		int caseNum = scanner.nextInt();
		
		//�׽�Ʈ���̽� �� ��ŭ �ݺ��ϸ� �����͸� �Է¹ް� ������ ����Ѵ�
		for(int caseIndex = 1; caseIndex <= caseNum; caseIndex++)
		{
			//���� �̸��� ���ʷ� �Է¹޴´� 
			String firstName = scanner.next();
			String lastName = scanner.next();
			
			//�־��� �Լ��� �̿��� �����õ� �̸� ���ڿ��� ��´� 
			String answer = getFormattedName(firstName, lastName);
			
			//������ ���Ŀ� �°� ����Ѵ�
			System.out.printf("Case #%d\n", caseIndex);
			System.out.println(answer);
		}

	}

}
