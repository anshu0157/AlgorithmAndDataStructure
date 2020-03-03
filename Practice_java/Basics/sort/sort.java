package sort;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] src = {2, 1, 8, 7, 9, 10, 6, 5, 4, 3};

// O(n*n)		
//		select(src);
//		bubble(src);
		insert(src);
		
// ���� ���� 		pivot�� ���� ���� 
		//quick(src); // O(N*logN)  -- 
	}
	
	public static void select(int[] arr) {
		//�ð����⵵ O(n*n) : ��ȿ��
		int min, tmp;
		int index = 0;
		
		for( int i = 0; i < 10; i++) {
			min = 9999;
			for(int j=i; j<10; j++) {
				if (min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			
			tmp = arr[i];
			arr[i] = arr[index];
			arr[index] = tmp;
			
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubble(int[] arr) {
		//���� ȿ���� ������ O(n*n), ���� ������ �������ĺ��� ������. (��� �ڸ��� �ٲ۴�. ������ ���������� �ٲ۴� )
		int p, tmp;

		for ( int i = arr.length ; i > 1 ; i-- ) {
			p = 0;
			
			 while( p < i -1 ){
				if (arr[p+1] < arr[p]) {
					tmp = arr[p+1];
					arr[p+1] = arr[p];
					arr[p] = tmp;
				}
				p++;
			}
		}

		System.out.println(Arrays.toString(arr));
	}
	
	public static void insert(int[] arr) {
		// O(n*n) �߿� ���� ������. ������ ��ġ�� �ʿ��Ҷ���. ���ĵǾ��ٰ� �����ϴ� ��
		// [���ĵ�] ������ [������] ��� ���Ҹ� ���ĵ� �ֵ� ���̿� ������ ��ġ�� ����
		// 1. ��� ���� ����
		// 2. �� �ٷ� �տ� �ֺ��� ��. ������ ������ ����. ���Ⱑ ���ڸ�
		// ���� ���ĵ� ���¿��� ������! ��� �ڿ��� ����, ������. ȿ����.

		int tmp;

		
		for(int i= 1; i < arr.length ; i++) {			
			for(int j = i ; j > 0 ; j--) {
				if(arr[j-1] < arr[j]) {
					break;
				}else {
					tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void quick(int[] arr) {
		// Ư�� ���� �������� ū ���ڿ� ���� ���ڸ� ������.
		// pivot �ִ�! ���� �տ��ִ� ���� pivot���� �����Ѵ�.
		// ���ʿ��� ���غ��� ū ��, �����ʿ��� ��к��� ���� �� �ϳ��� ���õǸ� ���� �ٲ��ش�.
		// ��������Ʈ index�� ������ ����Ʈ index���� Ŀ���� stop, ���� ������ index�� pivot ����(��������Ȳ)
		if(arr.length < 2) {
			System.out.println(Arrays.toString(arr));
		}
		
		int key = 0;
		int i = 1; // ���� �������
		int j = arr.length - 1; // ������ ��� ����
		
		while(i<=j) { //������������ �ݺ�
			while(arr[i] <= arr[key] ){
				
			}
		}	
	}
}
