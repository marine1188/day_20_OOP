package ex04.method;
//- static method : 객체 생성 없이 바로 사용 가능함
//object.methodName();  -- 
//ClassName.methodName();

class B{
	int x,y;
	public static void setData(int xx, int yy) {
		System.out.println(xx+","+yy);
	}
}//B class end

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.x = 9;
		//안좋은예
		b.setData(100, 200);
		System.out.println(b.x);
	}

}
