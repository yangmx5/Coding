package Com.mi;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Test {

	public static void main(String[] args) {
		String str = "SUN��˾��Oracle�չ����Ƿ���ζ��java����������·��MY.AST_Parser12";
		String s = "\\d+.\\d+|\\w+";
		Pattern pattern = Pattern.compile(s);
		Matcher ma = pattern.matcher(str);

		while (ma.find()) {
			System.out.println(ma.group());
		}

	}

}
