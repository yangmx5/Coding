package Com.wangyi;

import java.util.Scanner;


/*
 * ����һ������X���������rev(X)Ϊ��X����λ��ת����������ȥ����ǰ��0������:
 * ��� X = 123����rev(X) = 321;
 * ��� X = 100����rev(X) = 1.
 * ���ڸ�������x��y,Ҫ��rev(rev(x) + rev(y))Ϊ���٣� 
 * 
 */
public class RevNumAndCal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int num1 = sc.nextInt();
	        int num2 = sc.nextInt();
	        System.out.println(rev(rev(num1)+rev(num2)));
	}
	
	
	public static int rev(int num){
		
		String temp = Integer.valueOf(num).toString();
		
		String tar = "";
		for(int i = temp.length()-1; i >= 0 ; i--){
			tar += temp.charAt(i);
		}
		int result = Integer.valueOf(tar) ;  
		
		return result;
	}
	
}
