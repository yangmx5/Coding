package Com.wangyi;

import java.util.Scanner;
import java.util.Arrays;


/*
 * С����һ�����۰����ߣ����Ҷ���һ����������Լ��ʮ�ָ���Ȥ��һ��С����������һ�����⣺ 
 * ���庯��f(x)Ϊx��������Լ����xΪ�������� ����:f(44) = 11.
 * ���ڸ���һ��N����Ҫ��� f(1) + f(2) + f(3).......f(N)
 * ���磺 N = 7 =
 * f(1) + f(2) + f(3) + f(4) + f(5) + f(6) + f(7) = 1 + 1 + 3 + 1 + 5 + 3 + 7 = 21
 * С�׼�������������������ѣ���Ҫ�������һ���㷨�������� 
 * 
 */
public class TheMaxOddNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {

			int num = sc.nextInt();
			int[] dp = new int[num + 1];
			Arrays.fill(dp, 1);
			for (int i = 1; i < dp.length; i++) {
				if (i % 2 != 0) {
					for (int j = 1; j <= i; j++) {
						if (i * j < dp.length) {
							dp[i * j] = Math.max(dp[i * j], i);
						}
					}
				}
			}
			int result = 0;
			for (int i = 1; i <= num; i++) {
				result += dp[i];
			}
			System.out.println(result);
		}

	}
	
	/*
	 * ����˼·��
��Ϊ�������������Լ�������Լ���������ż������ֻ��һֱ��2ֱ���õ�һ��������Ϊ�������Լ��
 
����1 2 3 4 5 6 7 8 9 10
��n=10 ����ʱ������1 3 5 7 9 ���ǰ��⼸���������Ȼ��n/2
�õ��ڶ����������� 1 2 3 4 5 �ֱ��Ӧ�ϴε�2 4 6 8 10 ���ż�������������ټ�1 3 5
��������
 
ϸ�����⣺
��nΪż��������n/2�����������ݵȲ�������͹�ʽ ��(������+ĩ�*����)/2,����֪��n/2��������Ϊ((1+n-1)*n/2)/2,
��Ϊ(n/2) * (n/2),��ʱnΪż������� (n/2) * (n/2) = ((n+1)/2)  *  ((n+1)/2)
 
��nΪ��������(n+1)/2����������ʱ������Ϊ((n+1)/2)  *  ((n+1)/2)
����������������һ����ʽ���ܽ�

	 */
	public static void test2(String[] args) {
        Scanner s=new Scanner(System.in);
        long num=s.nextInt();
        long sum=0;
        for(long i=num;i>0;i=i/2){
            long temp=(i+1)/2;
            sum+=temp*temp;
        }
        System.out.println(sum);
    }

}
