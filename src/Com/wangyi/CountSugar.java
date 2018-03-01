package Com.wangyi;

import java.util.Scanner;


/*
 * A,B,C�������Ǻ�����,ÿ�������ﶼ��һЩ�ǹ�,���ǲ�֪������ÿ�������Ͼ����ж��ٸ��ǹ�,��������֪�����µ���Ϣ��
A - B, B - C, A + B, B + C. ���ĸ���ֵ.ÿ����ĸ����ÿ������ӵ�е��ǹ���.
������Ҫͨ�����ĸ���ֵ�����ÿ���������ж��ٸ��ǹ�,��A,B,C�����ﱣ֤���ֻ��һ������A,B,C������������������ 
��������:
����Ϊһ�У�һ��4���������ֱ�ΪA - B��B - C��A + B��B + C���ÿո������
��Χ����-30��30֮��(������)��


�������:
���Ϊһ�У�����������������A��B��C��˳�����A��B��C���ÿո��������ĩ�޿ո�
�������������������A��B��C�������No
 * 
 */
public class CountSugar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			int num4 = sc.nextInt();
			int a = (num1 + num3) / 2;
			int b = (num2 + num4) / 2;
			int c = num4 - b;
			if (a < 0 || b < 0 || c < 0 || a + b != num3 || a - b != num1 || b - c != num2 || b + c != num4)
				System.out.println("No");
			else
				System.out.println(a + " " + b + " " + c);
		}
	}

}
