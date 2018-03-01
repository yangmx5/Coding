package Com.meituan;

import java.util.Scanner;


/*
 *  //��¼���������ͬ��ǰ׺�͵���С�±������±�  
            max[mod] = Math.max(max[mod], i);//��ͬ�������±���������������±�  
            min[mod] = Math.min(min[mod], i);//������С�±�  
            // ��� a%b = c%b ,��a-c = b*k,kΪ����  
        }  
  
        //Ȼ��ͬ��ǰ׺�͵�����±�����С�±�֮�ȡ������ֵ������󳤶�  
 */
public class Q1Right {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		int[] sums = new int[n + 1];
		sums[0] = 0;
		for (int i = 1; i < n + 1; i++) {
			nums[i - 1] = sc.nextInt();
			sums[i] = sums[i - 1] + nums[i - 1];
		}
		int k = sc.nextInt();
		int[] max = new int[k];
		int[] min = new int[k];
		for (int i = 0; i < k; i++) {
			max[i] = -1;
			min[i] = n + 1;
		}
		for (int i = 0; i < n + 1; i++) {
			int mod = sums[i] % k;
			max[mod] = Math.max(max[mod], i);
			min[mod] = Math.min(min[mod], i);
		}
		int count = 0;
		for (int i = 0; i < k; i++) {
			if (max[i] != -1 && min[i] != n + 1) {
				count = Math.max(count, max[i] - min[i]);
			}
		}

		System.out.println(count);
	}

}