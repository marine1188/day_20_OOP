package ex01.method;

public class OverloadMethod {
	// 변수가 다른면 다른 함수로 인식
	//오버 로드란
	//매개 변수 같고 
	//ctrl + 오른쪽 클릭 찾아간다
	public static void line() {
		System.out.println("=========================");
	}
	
	public static void line(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("+++++++++++++++++++++++++");
		}
		System.out.println("=========================");
	}
	public static void line(String n) {
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
	}
	
	public static void line(String str, int n) {
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {//시작점
		// TODO Auto-generated method stub
		int a ;
		String see = "하이" ;
		
		//int 변수 쓴 함수 
		line("%");
		line(3);
		
		

	}

}
