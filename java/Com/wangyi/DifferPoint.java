package Com.wangyi;

import java.util.*;

/*
 * 
 * С����һ��Բ��������ԭ���Բ��С��֪��Բ�İ뾶��ƽ����С����Ϊ��Բ�ϵĵ���Һ������궼�������ĵ������ŵģ�
 * С��������Ѱ��һ���㷨��������ŵĵ�ĸ������������������
 * ���磺�뾶��ƽ�����Ϊ25
 * ���ŵĵ���У�(+/-3, +/-4), (+/-4, +/-3), (0, +/-5) (+/-5, 0)��һ��12���㡣 
 * 
 * ����Ϊһ����������ΪԲ�뾶��ƽ��,��Χ��32λint��Χ�ڡ�
 * 
 * ���Ϊһ����������Ϊ���ŵĵ�ĸ���
 */
public class DifferPoint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double count = 0;
		for (int i = 0, j = (int) Math.sqrt(num); i <= j;) {
			int temp = i * i + j * j;
			if (temp < num)
				i++;
			else if (temp > num)
				j--;
			else if (temp == num) {
				if (i == j) {
					count += 0.5;
					i++;
				} else {
					count++;
					i++;
				}
			}
		}
		int test = (int) Math.sqrt(num);
		if (test * test == num) {
			count--;
			System.out.println((int) (count * 8 + 4));
		} else
			System.out.println((int) (count * 8));

	}

	public static int count(int n) {
		int count = 0;
		double r = Math.sqrt(n);
		for (int i = 0; i < r; i++) {
			double j = Math.sqrt(n - i * i);
			if (Math.abs(j - Math.round(j)) <= 0.000000001) {
				count++;
			}
		}
		return 4 * count;
	}
}
