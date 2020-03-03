package mf_20200303;

import java.io.*;
import java.util.*;

public class Rect {
public static final Scanner scanner = new Scanner(System.in);
	
	/** 
  @description
    �� �簢���� �̷�� �� ���� �Ķ���ͷ� �޾� �����ϴ� ������ ���̸� ��ȯ�ϴ� �Լ�

  @param p	ù ��° �簢���� �� ��, q�� �밢���� �����Ѵ�.
  @param q	ù ��° �簢���� �� ��, p�� �밢���� �����Ѵ�.
  @param r	�� ��° �簢���� �� ��, s�� �밢���� �����Ѵ�.
  @param s	�� ��° �簢���� �� ��, r�� �밢���� �����Ѵ�.
  @return   �� ���簢���� �����ϴ� ������ ����
	**/
	
	
	public static void draw(Point p1, Point p2, int[][] canvas){		
		int rect_x_min = 0;
		int rect_x_max = 0;
		int rect_y_min = 0;
		int rect_y_max = 0;
		
		
		if (p1.x < p2.x){
			rect_x_min = p1.x;
			rect_x_max = p2.x;
		}else{
			rect_x_min = p2.x;
			rect_x_max = p1.x;
		}
		
		if (p1.y < p2.y){
			rect_y_min = p1.y;
			rect_y_max = p2.y;
		}else{
			rect_y_min = p2.y;
			rect_y_max = p1.y;
		}
		
		for(int i = rect_x_min; i < rect_x_max ; i++){
			for(int j = rect_y_min; j < rect_y_max ; j++){
				canvas[i][j]++;
				}
		}
		
	
	}
	
	public static int getDuplicatedArea(Point p, Point q, Point r, Point s)
	{
		int area = 0; //�� �簢���� �����ϴ� ������ ����
		
		int[] x_points = {p.x, q.x, r.x, s.x};
		int[] y_points = {p.y, q.y, r.y, s.y};
		
		int x_min = 0;
		int y_min = 0;
		int x_max = 0;
		int y_max = 0;
		
		
	// ��ǥ offset - min���� 0���� ǥ��ȭ.
		for(int i = 0; i<4; i++){
			if( x_min > x_points[i]){
				x_min = x_points[i];
				}
			if( x_max < x_points[i]){
				x_max = x_points[i];
				}
			if( y_min > y_points[i]){
				y_min = y_points[i];
				}
			if( y_max < y_points[i]){
				y_max = y_points[i];
				}
		}
		
		x_max = Math.abs(x_max - x_min); 
		y_max = Math.abs(y_max - y_min); 
		
		for(int i = 0; i<4; i++){
			x_points[i] = Math.abs(x_points[i] - x_min); 
			y_points[i] = Math.abs(y_points[i] - y_min);
		}
		

		p.setX(x_points[0]);
		p.setY(y_points[0]);
		
		q.setX(x_points[1]);
		q.setY(y_points[1]);
		
		r.setX(x_points[2]);
		r.setY(y_points[2]);
		
		s.setX(x_points[3]);
		s.setY(y_points[3]);
		
		// canvas���׸���
		int[][] canvas = new int[x_max][y_max];
		draw(p, q,canvas);
		draw(r, s,canvas);
		
		//��ġ�� ���� �ʺ�
		for(int i = 0; i < x_max ; i++){
			for(int j = 0; j < y_max ; j++){
				if (canvas[i][j] > 1) area++; 
			}
		}
		
		// ���� canvas ���
		// for(int i = 0; i < x_max ; i++){
		// 	for(int j = 0; j < y_max ; j++){
		// 		System.out.print(canvas[i][j]);
		// 	}
		// 	System.out.println();
		// }
	
	
		
		return area;
	}
	
	/* 
	** ���� �Լ����� �׽�Ʈ���̽��� ����¿� ���� �⺻���� ���� �ڵ尡 �ۼ��Ǿ� �ֽ��ϴ�. 
	** ����� �Լ��� �ϼ��Ͽ��� ������ �ذ��� �� ������, 
	** ���� �Լ��� ������ �� ������ �ڵ带 ��� �ۼ��Ͽ��� �����մϴ�.
	** ��, ������ �ۼ��� �ڵ�� ���� �߻��� ���� ���� ��� �����ڿ��� å���� �ֽ��ϴ�.
	*/

	  public static void main(String[] args) {
			//�� �� p, q, r, s�� ���ʷ� �Է¹޴´�.
//			Point p = new Point(scanner.nextInt(), scanner.nextInt());
//			Point q = new Point(scanner.nextInt(), scanner.nextInt());
//			Point r = new Point(scanner.nextInt(), scanner.nextInt());
//			Point s = new Point(scanner.nextInt(), scanner.nextInt());
	      
	        Point p = new Point(-7,5);
			Point q = new Point(0,0);
			Point r = new Point(-3,-3);
			Point s = new Point(4,2);
			
			
			//�־��� �Լ��� ���� �����ϴ� ������ ���̸� ����Ѵ� 
			int answer = getDuplicatedArea(p, q, r, s);
			
			//������ ���Ŀ� �°� ����Ѵ� 
			System.out.println(answer);
	  }
	  
	  

}

/** 
@description
  �ϳ��� ��(��ǥ)�� ��Ÿ���� Ŭ����
**/
class Point{
	public int x;
	public int y;
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
}

