package Com.Wanmei;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		// int m = 10;
		// int n = 5;
		// int w[] = {5, 4, 3,5,2};
		// int p[] = {2, 2, 3,5,1};
		//
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] w = new int[n];
		for (int i = 0; i < n; i++)
			w[i] = sc.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++)
			p[i] = sc.nextInt();
		int m = sc.nextInt();

		int c[][] = BackPack_Solution(m, n, p, w);
		// for (int i = 1; i <=n; i++) {
		// for (int j = 1; j <=m; j++) {
		// System.out.print(c[i][j]+"\t");
		// if(j==m){
		// System.out.println();
		// }
		// }
		// }
		System.out.println(c[c.length - 1][c[0].length - 1]);

	}

	/**
	 * @param m
	 *            ��ʾ�������������
	 * @param n
	 *            ��ʾ��Ʒ����
	 * @param w
	 *            ��ʾ��Ʒ��������
	 * @param p
	 *            ��ʾ��Ʒ��ֵ����
	 */
	public static int[][] BackPack_Solution(int m, int n, int[] w, int[] p) {
		// c[i][v]��ʾǰi����Ʒǡ����һ������Ϊm�ı������Ի�õ�����ֵ
		int c[][] = new int[n + 1][m + 1];
		for (int i = 0; i < n + 1; i++)
			c[i][0] = 0;
		for (int j = 0; j < m + 1; j++)
			c[0][j] = 0;

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {
				// ����ƷΪi������Ϊjʱ�������i��������(w[i-1])С������jʱ��c[i][j]Ϊ�����������֮һ��
				// (1)��Ʒi�����뱳���У�����c[i][j]Ϊc[i-1][j]��ֵ
				// (2)��Ʒi���뱳���У��򱳰�ʣ������Ϊj-w[i-1],����c[i][j]Ϊc[i-1][j-w[i-1]]��ֵ���ϵ�ǰ��Ʒi�ļ�ֵ
				if (w[i - 1] <= j) {
					if (c[i - 1][j] < (c[i - 1][j - w[i - 1]] + p[i - 1]))
						c[i][j] = c[i - 1][j - w[i - 1]] + p[i - 1];
					else
						c[i][j] = c[i - 1][j];
				} else
					c[i][j] = c[i - 1][j];
			}
		}
		return c;
	}
}