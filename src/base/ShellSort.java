package base;

import java.util.Arrays;

public class ShellSort {
	/**
	 * ����n���������򣬽���������d1�������飬�Ը����������ֱ�Ӳ�������Ȼ����С���������·��飬�Է�������ֱ������ֵΪ1ʱֹͣ��
	 * ϣ�������ǲ��������㷨��һ�֡��ֳ� ��С�������� ʱ�临�Ӷ�ΪO(nlog n) 
	 * ���ȶ�����ʽ
	 * @param nums ����������
	 * @return �����������
	 */
	public static void sort(int[] nums) {
		int len = nums.length / 2;
		while (len >=1) {
			for (int i = 0; i < len; i++) {
				// ֱ�Ӳ�������Է����������
				for (int k = i; k < nums.length-len; k +=len) {
					int j = k + len;
					int temp = nums[j];

					while (k >= 0 && nums[k] > temp) {
						nums[j] = nums[k];
						k -= len;
						j -= len;
					}

					nums[j] = temp;
				}
			}
			len = len/2;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 4, 6, 8, 1, 2 };

		sort(arr);

		System.out.println(Arrays.toString(arr));

	}
}