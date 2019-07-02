package d_binarytree;


//����Ʈ�� ����, �ڷ� �߰�/��ȸ ��� ����

public class Tree {
	TreeNode topNode = null;
	
	public void add(int key, Object value) {
		if(topNode == null)
			topNode = new TreeNode(key,value);
		else
			// topNode�� �������� �߰��ϰ� �ȴ�.
			topNode.add(key, value);
	}
	
	// ���޹��� key���� ���� node ã�Ƽ� �ֱ�
	public Object get(int key) {
		return topNode == null? null : topNode.find(key);
	}
	
}
