package d_binarytree;

//����Ʈ���� �����ϴ� �������� Ŭ����
public class TreeNode { 
	private int itsKey; 						// ����� key��
	private Object itsValue; 					// ����� value��
	private TreeNode nodes[] = new TreeNode[2];	// �ڽ� ��� �ΰ��� �����Ƿ� �ΰ��� node�� ���´�.
	
	// ������
	public TreeNode(int key, Object value) {
		itsKey = key;
		itsValue = value;
		System.out.println("Start TreMapNode");
		
	}
	
	// ��� �ڽ����� ���� select (�Է� key�� ���� ����� key���� ������ 0.. �� ���ʾ� or �����ʾ� ���� ) 
	public int selectSubNode(int key) {
		return (key < itsKey)? 0 : 1 ;
	}
	
	
	// key �˻��ؼ� ��ġ�ϸ� ���� / ��ġ���� ������ �ڽĳ��� pivot �̵� 
	public Object find(int key) {
		// ��ġ�ϴ� Ű�� ã���� ����!
		if(key == itsKey) 
			return itsValue;

		// Ű�� ��ġ ���� ������ �ٽ� �ڽĳ�� �����ؼ� �˻� (=pivot�̵�)
		return findSub(selectSubNode(key), key);	
	}
	
	
	public Object findSub(int node, int key) {
		// �ش��ϴ� ��ġ�� �ڽ� ��尡 ������ null�� ����, �ش��ϴ� ��ġ�� �ڽĳ�� ������  find�Լ� ����
		return nodes[node] == null? null : nodes[node].find(key);
	}
	
	
	// �߰� : key���� ���� ������ ������ �߰�.
	public void add(int key, Object value) {

		// key�� �������� key�� ��ġ�ϸ� value����  (ex.topNode.addù ���� ��, key�� topNode�� key�� ��ġ�ϸ� , topNode value����)
		if(key == itsKey) 
			itsValue = value;
		
		else 
			SubNode(selectSubNode(key), key, value);
		// case1. SubNode( 0 , key, value) : ���ο� Ű�� �� ���� ��� (���� ���� key�� topNode�� key���� �۴�) - ����
		// case2. SubNode( 1 , key, value) : ���ο� Ű�� �� ū ��� (���� ���� key�� topNode�� key���� ũ��) - ������
	}

	
	private void SubNode(int node, int key, Object value) {
		// �ش� ��ġ�� ���� node�� ���� ��� -> �� ��ġ�� ���ο� ��� ����. add ������ �Ϸ�!
		if(nodes[node]==null) 
			nodes[node] = new TreeNode(key, value);
		
		// �ش� ��ġ�� �̹� node�� �ִ� ��� -> �ش� ��� ��ġ�� �������� add���� ����. (��, topNode�� �ƴ϶� topNode�� �ڽ� �� �ϳ��� ��尡 ������ ��. pivot �̵�) 
		// itsKey�� topNode�� Key���� �� �ڽĳ���� Key�� �ǰ���? 
		else
			nodes[node].add(key, value);
		
	}
	
}
