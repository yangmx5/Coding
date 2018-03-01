package test;

class Node {
	public Integer i;
	public Node nextNode;

	Node(Integer i, Node nextNode) {
		this.i = i;
		this.nextNode = nextNode;
	}

}

/*
 * ���ɱ�����ʵ��
 * 
 * ����ͨi++�����Ա�
 * 
 */
public class IncrementI {

	public  static Node node = new Node(0, null);//����ͷ

	//ÿ�δ���һ���µ�ֵΪ1�Ľڵ��������ͷ��
	public static  void Increment() {
		Node temp = new Node(1, node);
		node = temp;
	}

	//���������е�Ԫ��ֵ���ܺ�
	public static Integer getCount() {
		Integer result = 0;
		while (node != null) {
			result += node.i;
			node = node.nextNode;
		}

		return result;
	}

	public static Integer count = 0;

	public static void main(String[] args) {

//		for (int z = 0; z < 100; z++) {
//			
//			count = 0;
//			node = new Node(0, null);
//					
			for (int i = 0; i < 10000; i++) {
				new Thread() {
					public void run() {
						count++;
						Increment();
					};
				}.start();
			}

			System.out.println(count.toString() + "--" + getCount().toString());
//		}
	}
}
