package base;

import java.util.Arrays;

public class RadixSort {
	/**
	 * ��������
	 * ���:���������ֳơ�Ͱ�ӷ���,����˼��,����͸����ֵ�Ĳ�����Ѷ����Ҫ�����Ԫ�ط�����ĳЩ��Ͱ���У����Դﵽ���������
	 * ��ʱ�临�Ӷ�ΪO (nlog(r)m)������rΪ����ȡ�Ļ�������mΪ����
	 * �ȶ�����ʽ
	 * @param nums ����������
	 * @d ����
	 */
	public static void sort(int[] nums,int d){
		int k = 0;
		int n = 1;
		int len = nums.length;
		
		//�ֳ�nums.length��Ͱ
		int[][] radixArray = new int[len][len];
		//ÿ��Ͱ�ŵĸ�����ɵ�����
		int[] tempArray = new int[len];
		
		//����λ����
		while (n<=d) {
			for (int i = 0; i < len; i++) {
				//��,ʮ,��,ǧ...
				int temp = (nums[i]/n)%10;
				//�����ض�Ͱ���ض�λ��
				radixArray[temp][tempArray[temp]] = nums[i];
				tempArray[temp]++;
			}
			
			for (int i = 0; i < len; i++) {
				if (tempArray[i] != 0) {
					for (int j = 0; j < tempArray[i]; j++) {
						//��������
						nums[k] = radixArray[i][j];
						k++;
					}
					//����,�Է��´�ѭ��ʱ���ݳ���
					tempArray[i] = 0;
				}
			}
			
			//����,�Է��´�ѭ��ʱ���ݳ���
			k = 0;
			//��λ
			n *=10;
		}
	}
	
	// ���������ʵ��
	public static void main(String[] args) {

		int[] nums = { 23, 71, 82, 34, 15, 61, 91,30, 53, 14 };

		RadixSort.sort(nums, 10);
		System.out.println(Arrays.toString(nums));
	}
}