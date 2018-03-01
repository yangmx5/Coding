package Com.wangyi;

import java.util.Scanner;
import java.util.Arrays;

/*
С��ȥ�������̵���ƻ������թ���̷�ʹ���������ף�ֻ�ṩ6��ÿ����8��ÿ���İ�װ(��װ���ɲ��)��
����С������ֻ�빺��ǡ��n��ƻ����С���빺�����ٵĴ�������Я����������ܹ���ǡ��n��ƻ����С�׽����Ṻ�� 
��������:
����һ������n����ʾС���빺��n(1 �� n �� 100)��ƻ��


�������:
���һ��������ʾ������Ҫ����Ĵ��������������ǡ��n��ƻ�������-1

 */
public class BuyApples {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {

			int num = sc.nextInt();
			System.out.println(CountBags(num));
		}

	}

	public static boolean JudgeOdd(int num)// �ж�������
	{
		if (num % 2 == 0)
			return false;//
		else
			return true;// ��������true
	}

	public static int CountBags(int N) {
		int i;
		int minBag = N;// ��С�Ĵ���

		if (JudgeOdd(N))
			return -1;

		for (i = 0; i <= N / 6; i++) {
			if ((N - 6 * i) % 8 == 0) {
				int j = (N - 6 * i) / 8;
				minBag = minBag > (i + j) ? (i + j) : minBag;
			}
		}

		if (minBag != N)
			return minBag;
		else
			return -1;
	}

}
