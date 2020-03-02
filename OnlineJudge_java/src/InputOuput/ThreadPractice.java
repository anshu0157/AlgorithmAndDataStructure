package InputOuput;

public class ThreadPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		
		//������ thread���� �����ϰ� �ȴ�. ���� �� ���� �ϴ����� ��ǻ�� ���� 
		new Thread(new Runnable() { //runnable�� interface
			@Override
			public void run() { // run�� �߻� method
				// TODO Auto-generated method stub
				for(int i = 0 ; i < 5 ; i++) {					
					try {//1�� �� ����.
						Thread.sleep(1000);
						System.out.println(Thread.currentThread().getName() + ":" + i );
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		// ���ٽ� (lambda) - �߻�޼��� �ϳ��� ���� �������̽�
		new Thread(()-> {
			for(int i = 0 ; i < 5 ; i++) {					
				try {//1�� �� ����.
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName() + ":" + i );
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		System.out.println("2");
		
//		���
//		1
//		2
//		Thread-0:0
//		Thread-1:0
//		Thread-0:1
//		Thread-1:1
//		Thread-0:2
//		Thread-1:2
//		Thread-0:3
//		Thread-1:3
//		Thread-0:4
//		Thread-1:4

	}

}
