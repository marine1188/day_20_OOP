
// ... 배열 이다
package ex01.method;

public class ArgumentVariable {
	
//	public static void plus(int x, int y) {
//		System.out.println(x+y);
//	}
//	
	public static void plus(double x, int y) {
		System.out.println(x+y);
	}
//	
//	public static void plus(int x, int y, int z) {
//		System.out.println(x+y+z);
//	}
//	
//	public static void plus(int x, int y, int z, int a, int b, int c) {
//		System.out.println(x+y+z);
//	}
	public static void plus(int...x) {  // 가변길이 배열
		int sum =0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println("sum = " + sum);
	}
	
	public static void plus(String...x) {  // 가변길이 배열
		String sum = "";
		for (int i = 0; i < x.length; i++) {
			sum += x[i] + " ";
		}
		System.out.println("sum = " + sum);
	}
	// 가변 길이( ArgumentVariable)로 만들자 하나로 해결되게 //자료형이 같아야함 
	public static void main(String[] args) {
		plus(1,2,3,4,5,6);
		plus(2,3);
		plus(1,2,3);
		plus(12.34, 50);
		
		plus("a", "b", "c");
		plus("one", "two", "thrid", "korea", "love");
		
		add(30, 40);
		
		sub(1,2,3,4,5,5,8);
		sub(5,5,8);
		sub(1,2,5,8);
		
	}
	
	private static void sub(int...i) {
				
	}
	
	public static void add(int x, int y) {
		System.out.println(x + y);		
	}
}

//package ex01.method;
//
//public class ArgumentVariable {
//	// 자료 형이 같아야함 ex. int =int / int=d
//	public static void plus(int x, int y, int i, int j, int k) {
//		System.out.println(x+y);
//	}
////	public static void plus(int x, int y,int z) {
////		System.out.println(x+y+z);
////	}
//	
//	
//	//하나로 어떤 길이든 다 받아요
//	//재사용 가능
////	public static void puls(int...x) {
////		int sum = 0 ;
////		for (int i = 0; i < x.length; i++) {
////			//변수 선언
////			sum += x[i];
////		}
////		System.out.println("sum ="+sum);
////	}
//	//string
//	public static void puls(String...x) {
//		String sum = "";
//		for (int i = 0; i < x.length; i++) {
//			//변수 선언
//			sum += x[i];
//		}
//		System.out.println("sum ="+sum);
//	}
//	
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//plus(1,2);
//		//plus(1,2,3,5,6);
//		
//		plus("a","b","c");
//		
//		add(30,10);
//		
//
//	}
//	private static void add(int i, int j) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}








