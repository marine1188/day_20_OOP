package ex02.method;

public class MainEntry {
	// run -> configurations
	public static void main(String[] args) {  //매개변수(인수)에 값 전달하기
		if(args.length!=0) {
//			int hap = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
			double result = Double.parseDouble(args[0]) + Double.parseDouble(args[1]); 
			
			System.out.println(result);
		}
		else
		{
			System.out.println("메인한테 값 안들어 왔어 ");
			System.exit(0);
		}
		

	}
}
