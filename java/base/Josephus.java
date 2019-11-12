package base;

import java.util.Arrays;

/**
 * ���:��˵������̫��ʷѧ�� Josephus�й����µĹ��£���������ռ���������غ�39 ����̫����Josephus���������Ѷ㵽һ�����У�
 * 		39����̫�˾�����Ը��Ҳ��Ҫ�����˵������Ǿ�����һ����ɱ��ʽ��41�����ų�һ��ԲȦ���ɵ�1���� ��ʼ������ÿ��������3��
 * 		���˾ͱ�����ɱ��Ȼ��������һ�����±�����ֱ�������˶���ɱ����Ϊֹ��Ȼ��Josephus ���������Ѳ�������ӣ�JosephusҪ
 * 		���������ȼ�װ��ӣ������������Լ������ڵ�16�����31��λ�ã������ӹ����ⳡ������Ϸ��
 * @param num ����
 * @param per ÿ�����˳�ȡһ��
 * @return Լɪ������
 */
public class Josephus {
public static int[] arrayOfJosephus(int num, int per) {
	int[] nums = new int[num];
	int count =0;
	int pos = 0;
	
	for (int i = 1; i <= num; i++) {
		while(true){
			pos = pos%num;
			if (nums[pos]==0) {
				count++;
			}
			
			if (count == per) {
				count = 0;
				break;
			}
			
			pos++;
		}
		
		nums[pos] = i;
	}
	
	return nums;
}

//Լɪ��ʵ��
public static void main(String[] args) {
	int manNum = 10;
	int per = 3;
	int aliveNum = 3;
	
	int[] man = Josephus.arrayOfJosephus(manNum, per);

	System.out.println("Լ�ٷ򻷣�"+Arrays.toString(man));
	System.out.println("L��ʾ3��������Ҫ�ŵ�λ�ã�");
	
	for (int i = 0; i < manNum; i++) {
		if (man[i] > manNum-aliveNum)
			System.out.print("L");
		else
			System.out.print("D");

		if ((i + 1) % 5 == 0)
			System.out.print("  ");
	}
}
}
