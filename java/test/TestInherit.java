package test;

import java.util.Arrays;

class Person {
	
	public static int id = 0;
	
	Person() {
		System.out.println("create person");
	}

	public static String getName() {
		return "Person";
	}
}
//super()��������������๹�캯���ĵ�һ��
class Teacher extends Person {
	public int id = 1;
	
	Teacher() {
//		super();
		System.out.println("create teacher");

	}

	public static String getName() {
		return "Teacher";
	}
}

public class TestInherit {
	public static void main(String[] args) {

		
		// ���Ը������๹�캯����ϵ�����ع�ϵ
		Person person = new Person();
		Person teacher = new Teacher();
//		System.out.println(person.getName());
//		System.out.println(teacher.getName());

		// ����������Ԫ���Ƿ����Ϊnull ,(�������Ϳ���Ϊ�գ��������Ͳ�����)
		Person[] a = { person, teacher };// new Person[2];
		a[1] = null;
//		System.out.println(Arrays.toString(a));
//
//		String test = "A";
//
//		System.out.println(test.length());
//		
		System.out.println(teacher.id);

	}
}