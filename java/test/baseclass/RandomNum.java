package test.baseclass;

import java.util.Random;


/*
 * ���������
 */
public class RandomNum {

	public static void main(String[] args) {

		int max = 20;
		int min = 10;
		Random random = new Random();

		while (min-- > 0) {
			// int s = random.nextInt(max) % (max - min + 1) + min;
			//random���ȡ�����
			int s = random.nextInt(max);
			
			//Math���ȡ0-1֮��������double����
			double l = Math.random();
			//int n = (int) ((l*10)%(max - min + 1) + min);
			int n = (int) (l*10);
			long m = System.currentTimeMillis();

			System.out.println(s + " / " + l + " / " + n);
		}

	}
}
