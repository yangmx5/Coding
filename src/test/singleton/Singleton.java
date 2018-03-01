package test.singleton;

//�����̲߳���ȫ
public class Singleton {

	private static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}

}

// �����̰߳�ȫ
class Singleton_2 {

	private static Singleton_2 instance;

	private Singleton_2() {

	}

	public static synchronized Singleton_2 getInstance() {
		if (instance == null)
			instance = new Singleton_2();
		return instance;
	}

}

// ����
class Singleton_3 {

	private static Singleton_3 instance = new Singleton_3();

	private Singleton_3() {
	}

	public static Singleton_3 getInstance() {
		return instance;
	}
}

// ��������
class Singleton_4 {

	private static Singleton_4 instance = null;
	static {
		instance = new Singleton_4();
	}

	private Singleton_4() {
	}

	public Singleton_4 getInstance() {
		return instance;
	}
}

// ��̬�ڲ���
class Singleton_5 {
	private static class Instance {
		private static final Singleton_5 INSTANCE = new Singleton_5();
	}

	private Singleton_5() {
	}

	public static Singleton_5 getInstance() {
		return Instance.INSTANCE;
	}
}

// ö��
enum Singleton_6 {
	INSTANSE;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

// ˫��У����
class Singleton_7 {
	private volatile static Singleton_7 instance;

	private Singleton_7() {
	}

	public Singleton_7 getInstance() {
		if (instance == null) {
			synchronized (Singleton_7.class) {
				if (instance == null) {
					instance = new Singleton_7();
				}
			}
		}
		return instance;
	}
}
