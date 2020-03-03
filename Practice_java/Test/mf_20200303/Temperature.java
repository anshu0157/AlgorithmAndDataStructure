package mf_20200303;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Temperature {
	/** 
	@description
		�α׸� �̿��� �ó���Ⱑ ������ ������ ��� �µ��� ����ϴ� �Լ�
	@param logs �ð� ������ ����� �α׵�
	@return     �ó���� ���� �ð� ������ ��� �µ�
*/
	
	
	public static double convertTime(String str){		
		SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
		Date time = new Date();
		
		try {
			time = f.parse(str);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		double res = time.getTime()/1000;
		
		// long diff = d1.getTime() - d2.getTime();
		// long sec = diff / 1000;
		// System.out.println(sec);

		return res;
	}
	
	public static double calculateAverageTemperature(String[] logs)
	{
		double averageTemperature = 0.0;
		
		String[] row  = new String[2]; //[�ð�, ��ɾ�]
		String[] commands  = new String[2]; // [���, �µ�]

		int currntTemp = 0;  		// ���� �µ�
		double startTime = 0d;	// ���ο� �µ� ���� �ð�
		double endTime = 0d;		// ���� �ð�
		double duration = 0d;		// ���ӽð� (endTime - startTime)
		
		//��� ����� ���� ������
		double totalSum = 0d;
		double totalTime = 0d;
		
		
		for( int i = 0 ; i < logs.length ; i ++ ){
			// �α� ��� �и�
			row = logs[i].split(" "); //0: time, 1: ���, 2: �µ�
			
			//��ɾ�
			commands = row[1].replace("TURN-", "").split("-"); // [ {on || off || Set} , temp ]

			//��ɾ ���� ����
			if(commands[0].equals("ON")){
				// 1.���� �µ�, ���۽ð� ����ϱ�
				currntTemp = Integer.parseInt(commands[1]);
				startTime = convertTime(row[0]);
				
			} else if(commands[0].equals("SET")){
				// 1. ���� �µ� ���ӽð� ���ϱ�
				endTime = convertTime(row[0]);
				duration = endTime - startTime;
				
				//2. �� ����� ���� total �� ����
				totalTime = totalTime + duration;
				totalSum = totalSum + (duration * currntTemp);
				
				//3. ���۽ð�, ����µ� ����
				currntTemp = Integer.parseInt(commands[1]);
				startTime = endTime;	
				
			} else if(commands[0].equals("OFF")){
				// 1. ���� �µ� ���ӽð� ���ϱ�
				endTime = convertTime(row[0]);
				duration = endTime - startTime;
				
				//2. �� ����� ���� total �� ����
				totalTime = totalTime + duration;
				totalSum = totalSum + (duration * currntTemp);
				
			} else{
				break;
			}
		}

		averageTemperature = totalSum / totalTime;
		return averageTemperature;
	}
	
	/* 
	** ���� �Լ����� �׽�Ʈ���̽��� ����¿� ���� �⺻���� ���� �ڵ尡 �ۼ��Ǿ� �ֽ��ϴ�. 
	** ����� �Լ��� �ϼ��Ͽ��� ������ �ذ��� �� ������, 
	** ���� �Լ��� ������ �� ������ �ڵ带 ��� �ۼ��Ͽ��� �����մϴ�.
	** ��, ������ �ۼ��� �ڵ�� ���� �߻��� ���� ���� ��� �����ڿ��� å���� �ֽ��ϴ�.
	*/

	public static void main(String[] args) {
//		4
//		00:00:00 TURN-ON-27
//		06:30:00 SET-29
//		08:00:00 SET-30
//		12:00:00 TURN-OFF
//		28.3�� �Ǿ�� �Ѵ�.
		
		
		Scanner scanner = new Scanner(System.in);
		
		//�α� ���ڿ��� ���� �Է¹޴´�
		int logNum = scanner.nextInt();
		scanner.nextLine(); //���ʿ��� ������ ����
		
		//�� �α׸� ���ʷ� �Է¹޾� logs�� �����Ѵ�
		String[] logs = new String[logNum];
		for(int logIndex = 1; logIndex <= logNum; logIndex++)
		{
			logs[logIndex-1] = scanner.nextLine().trim();
		}
		
		//�־��� �Լ��� �̿��� ��� �µ��� ����Ѵ� 
		double answer = calculateAverageTemperature(logs);
		
		//����� ��� �µ��� ���Ŀ� �°� ����Ѵ�
		System.out.printf("%.1f\n", answer);

	}

}
