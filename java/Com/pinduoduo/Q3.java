package Com.pinduoduo;

import java.util.Arrays;

public class Q3 {

	/*
	 * ��ʦ���ɿ���w[i]>h[i] ��i��С���ѱ���
	 * �����ܶ��С���ѱ���
	 * 
	 */
	public static void main(String[] args) {
		
		int [] arrw = {};
		int [] arrh = {};
		System.out.println(Integer.valueOf(Count(arrw,arrh)));
		
	}
	
	public static int Count(int [] w , int [] h){
		Arrays.sort(w);
		Arrays.sort(h);
		
		int result = 0;
		for(int i = w.length-1, j = h.length-1 ;i>=0&&j>=0;){
			if(h[j] > 0 &&w[i] >= h[j]){
				result++;
				i--;
				j--;
			}else if(h[j] <= 0 || w[i] < h[j]){
				j--;
			}
		}
		return result;
	}
}
