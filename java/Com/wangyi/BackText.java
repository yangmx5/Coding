package Com.wangyi;

import java.util.Scanner;

/*

���һ��������������֮���ԭ������һ���ľͳ���������������Ϊ�������С����磺
{1, 2, 1}, {15, 78, 78, 15} , {112} �ǻ�������, 
{1, 2, 2}, {15, 78, 87, 51} ,{112, 2, 11} ���ǻ������С�
���ڸ���һ���������У�����ʹ��һ��ת��������
ѡ�������������ڵ�����Ȼ��������Ƴ������������������������ֵĺͲ��뵽��������֮ǰ��λ��(ֻ����һ����)��
���ڶ�����������Ҫ���������Ҫ���ٴβ������Խ����ɻ������С�

����Ϊ���У���һ��Ϊ���г���n ( 1 �� n �� 50)
�ڶ���Ϊ�����е�n������item[i]  (1 �� iteam[i] �� 1000)���Կո�ָ���


ʹ��˫�˶���deque���ݽṹ������⡣˫�˶���deque���ݽṹ֧�ָ�Ч����β����Ԫ�صĲ����ɾ����
(�ύ����ʱ��С��1ms) 

����˼·Ϊ���ж϶��׺Ͷ�βԪ�ء���������ȣ���������Ԫ�ض��������У������й�ģ��С2����
�ٶԸ���������жϣ������߲���ȣ���ѡ�����н�С��һ��������Ԫ�غ��������ڵ�Ԫ�ض��������У�
�ٽ���Ͳ�����У��Ӷ������й�ģ��С1�����ٶԸ���������жϡ�
 */


public class BackText {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int times = 0;
			int n = scanner.nextInt();
			int[] inputArr = new int[n];
			for (int i = 0; i < n; i++) {
				inputArr[i] = scanner.nextInt();
			}
			int head = 0;
			int tail = n - 1;
			while (head < tail) {
				if (inputArr[head] > inputArr[tail]) {
					inputArr[--tail] += inputArr[tail + 1];
					times++;
				} else if (inputArr[head] < inputArr[tail]) {
					inputArr[++head] += inputArr[head - 1];
					times++;
				} else {
					head++;
					tail--;
				}
			}
			System.out.println(times);
		}
		scanner.close();
	}
	
}
