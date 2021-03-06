package ex01.method;

public class MainEntry {
	// 2) 매개변수 있고, 리턴타입 없는 경우
	public static void plus(int x, int y) {
		int hap = x + y;
		System.out.println("x + y  = " + hap);
		System.out.println(x + " + " + y + " = " + (x + y));
	}

	public static void line() {
		System.out.println("=========================");
	}

	// 3) 매개변수 없고, 리턴타입 있는 경우
	public static String message() {
		String str = "th1 class !!!";
//		return "안녕";
		return str;
	}

	// 4) 매개변수 있고, 리턴타입 있는 경우
	public static int sub(int x, int y, int z) {
		return x - y - z;
	}

	public static void main(String[] args) { // 시작점(진입점)
		int num = sub(1, 2, 3);
		System.out.println(num);
		System.out.println(sub(100, 20, 30));

		String msg = message();
		System.out.println(msg);
		System.out.println(message());

		plus(3, 5);

		System.out.println("main start~");
		line();
		showName(); // 함수 호출
		line();
		System.out.println("main end~");
		showName();
	}

	// 1) 매개변수 없고, 리턴타입 없는 경우
	public static void showName() { // 함수정의부(구현부)
		System.out.println("gil dong");
	}

}
