// https://www.youtube.com/watch?v=_hxFgg7TLZQ
// �����غ��� 
package f_search;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Stack;
import f_search.Queue;
import java.util.NoSuchElementException;

class Graph{
	
	
	class Node{
		int data;
		LinkedList<Node> adjacent;
		boolean marked;
		
		Node(int data){
			this.data = data;
			this.marked = false;
			adjacent = new LinkedList<Node>();
		}
	}
	
		
	Node[] nodes;
	
	//������
	Graph(int size){	
		nodes = new Node[size];
		for(int i =0; i<size; i++) {
			nodes[i] = new Node(i);
		}	
	}
	
	//���� ����, param�� index
	void addEgde(int i1, int i2) {
		Node n1 = nodes[i1];
		Node n2 = nodes[i2];
		
		if(!n1.adjacent.contains(n2)) {
			n1.adjacent.add(n2);
		}
		
		if(!n2.adjacent.contains(n1)) {
			n2.adjacent.add(n1);
		}
		
	}
	
	
	// node�� ������ ���
	void visit(Node n) {
		System.out.print(n.data + " ");
	}
	
	
	
//////////////////// 1. dfs - stack ///////////////////////////
	void dfs() {
		dfs(0);
	}
	
	// param�� �����ϴ� ����� �ε��� ��ȣ
	void dfs(int index) {
		Node root = nodes[index];
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		root.marked = true;
		
		while(!stack.isEmpty()) {
			// 1. stack���� ���
			Node r = stack.pop();
			
			// 2. ���� ���̿� ����� ������ stack�� �ֱ�
			for(Node n:r.adjacent) {
				if(n.marked==false) {
					n.marked= true;
					stack.push(n);
				}
			}
			
		
			// 3. ���� ������ data ���
		visit(r);
		
		} //while(!stack.isEmpty()) end		
	}
	
	
//////////////////// 2. dfsR - dfs recursive ///////////////////////////	
	void dfsR(Node r) {
		
		// ��尡 ��������� ����
		if(r==null) return;
		r.marked = true;
		
		//1. ���
		visit(r);
		
		//2. ����� ���� �湮
		for(Node n:r.adjacent) {
			if(n.marked==false) {
				dfsR(n);
			}
		}
	}
	
	//���� �پ��ϰ� �ϱ� ����
	void dfsR(int index) {
		Node r = nodes[index];
		dfsR(r);
	}
	
	void dfsR() {
		dfsR(0);
	}
	
	
//////////////////// 3. bfs ///////////////////////////
	void bfs() {
		bfs(0);
	}
	
	
	void bfs(int index) {
		Node root = nodes[index];
		Queue<Node> queue = new Queue<Node>();
		queue.enqueue(root);
		root.marked = true;
		
		while(!queue.isEmpty()) {
			Node r = queue.dequeue();
			for(Node n: r.adjacent) {
				if(n.marked == false) {
					n.marked = true;
					queue.enqueue(n);
				}
			}
			visit(r);
		}
	
	}
	
}


//////////////////// Test ///////////////////////////

public class FS {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		   0
		  /
	 	 1 -- 3    7
	 	 |   /|\  /
	 	 | /  | 5
	 	 2 -- 4  \
	 	 		  6 - 8
		 */
		
//		Graph g = new Graph(9);
//		g.addEgde(0, 1);
//		g.addEgde(1, 2);
//		g.addEgde(1, 3);
//		g.addEgde(2, 4);
//		g.addEgde(2, 3);
//		g.addEgde(3, 4);
//		g.addEgde(3, 5);
//		g.addEgde(5, 6);
//		g.addEgde(5, 7);
//		g.addEgde(6, 8);
//		
//		//g.dfs();	// 0 1 3 5 7 6 8 4 2 
//		//g.dfsR();	//0 1 2 4 3 5 6 8 7 
//		//g.bfs();	// 0 1 2 3 4 5 6 7 8 
//		
//		//g.dfs(3);	// 3 5 7 6 8 4 2 1 0 
//		//g.dfsR(3);	//3 1 0 2 4 5 6 8 7 
//		g.bfs(3);	//3 1 2 4 5 0 6 7 8 
		
		
		
		Graph g = new Graph(5);
		g.addEgde(1, 2);
		g.addEgde(1, 3);
		g.addEgde(1, 4);
		g.addEgde(2, 4);
		g.addEgde(3, 4);

		
		//g.dfs(1);	//1 4 3 2 
		g.dfsR(1); //1 2 4 3 
		
	}

}
