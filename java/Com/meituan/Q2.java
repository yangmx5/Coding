package Com.meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

	/*
	 *
K�ı���
sum[i] ��ʾǰi��ͣ�sum[i]%=k����sum[i] ����߳��ֹ�û�У����ֹ��������λ�ã�������Զ�ľ���



���Ծ�
̰�ģ�
���ȵ�һ����ѡ �����������϶��м�᲻���á�

������������һ����yes����Ϊ�����԰��մ������С���η���
��������ֻ��һ����С������������ĺʹ��ڵ����������yes������ no
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		int sum = 0;
		for(int i = 0 ; i < arr.length; i++){
			arr[i]  = sc.nextInt();
			sum+= arr[i];
		} 
		
		Arrays.sort(arr);
//		System.out.println(sum);
		boolean result = false;
		
		if(arr[arr.length-1] == arr[arr.length-2])
			result = true;
		else{
			if(sum-arr[arr.length-1] >= arr[arr.length-1])
				result = true;
		}
		
//		System.out.println(sum);
		
		if(result)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
}
